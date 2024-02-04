package com.muruna.evaluacion.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PasswordChecker {
    // Dada la utilizacion y creacion de una nueva variable de entorno debe ser considerada la creacion/configuracion de la metadata
    private static final Logger logger = LoggerFactory.getLogger(PasswordChecker.class);

    @Autowired
    public Environment env;
    
    public String obtenerConfiguracionRegexEnv() {
        String valorVariable = env.getProperty("validation.password.level");
        logger.info("La variable de entorno habilitada para contraseña es: " + valorVariable);
        
        switch (valorVariable.toUpperCase()) {
            case "NONE":
                return "";
            case "LOW":
                // "La contraseña debe tener al menos 6 caracteres"
                return ".{6,}";
            case "MEDIUM":
                // La contraseña debe tener al menos 6 caracteres, una minúscula, una mayúscula y un número
                return "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{6,}$";
            case "HIGH":
                // La contraseña debe tener al menos 8 caracteres, maximo 15 caracteres, una minúscula, una mayúscula, un número y un carácter especial
                return "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,15}$";
            default:
                throw new IllegalArgumentException("Palabra clave no válida: " + "validation.password.level");
        }
    }

    public boolean passwordTest(String pass) {
        Pattern pattern = Pattern.compile(this.obtenerConfiguracionRegexEnv());
        Matcher matcher = pattern.matcher(pass);
        return matcher.matches();
    }

    // Prueba de soluciones anteriores
    /*
    public boolean passwordTest(String pass) {
        Pattern pattern = Pattern.compile(this.obtenerConfiguracionRegexEnv().getEvaluation());
        Matcher matcher = pattern.matcher(pass);
        return matcher.matches();
    }

    public class EnvPassResponse {
        private String evaluation;
        private String response;
        private Boolean regexEvaluation;

        public EnvPassResponse() {
            super();
        }

        public EnvPassResponse(String evaluation, String response, Boolean regexEvaluation) {
            super();
            this.evaluation = evaluation;
            this.response = response;
            this.regexEvaluation = regexEvaluation;
        }

        public String getResponse() {
            return this.response;
        }

        public void setResponse(String response) {
            this.response = response;
        }

        public Boolean getRegexEvaluation() {
            return this.regexEvaluation;
        }

        public void setRegexEvaluation(Boolean regexEvaluation) {
            this.regexEvaluation = regexEvaluation;
        }

        public String getEvaluation() {
            return this.evaluation;
        }

        public void setEvaluation(String evaluation) {
            this.evaluation = evaluation;
        }
    }
    */
}
