# EvJava-Muruna
<h1 align="center">EvaluacionJavaRegistroUsuarios</h1>
<!-- descripcion  -->
<p>Este repositorio contiene el código fuente y los recursos asociados a una prueba técnica centrada en la implementación de un sistema de registro de usuarios en Java con SpringBoot.</p>
<!--  -->
<br>
<!-- Indice -->
<h2 align="center">Índice</h2>
<ul>
    <li><a href="#requisitos-previos">Requisitos previos</a></li>
    <li><a href="#estructura-del-proyecto">Estructura del Proyecto</a></li>
    <li><a href="#configuracion">Configuración</a></li>
    <li><a href="#recursos">Recursos</a></li>
    <li><a href="#instalación">Instalación</a></li>
    <li><a href="#desarollo">Desarrollo</a></li>
    <li><a href="#uso">Uso</a></li>
    <li><a href="#contribuciones">Contribuciones</a></li>
    <li><a href="#licencia">Licencia</a></li>
</ul>
<!--  -->
<br>
<!-- Requisitos previos -->
<h2 id="requisitos-previos" align="center">Requisitos previos</h2>
<p>Para ejecutar este proyecto en su entorno local, debe tener instalado lo siguiente:</p>
<ul>
    <li>Java (versión recomendada 8 o superior)</li>
    <li>Spring Boot</li>
    <li>Base de Datos (puede ser MySQL, PostgreSQL, H2, etc.)</li>
    <li>Gradle o Maven</li>
</ul>
<h3 id="configuracion">Configuración</h3>
<p>Siga estos pasos para configurar el entorno del proyecto:</p>
<ol>
    <li>Configurar la conexión a la base de datos en el archivo de configuración correspondiente.</li>
    <li>Realizar ajustes de configuración adicionales según sea necesario.</li>
</ol>
<!--                   -->
<br>
<!-- Estructura del Proyecto -->
<h2 id="estructura-del-proyecto" align="center">Estructura del Proyecto</h2>
<pre>
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── ejemplo/
│   │           ├── controller/
│   │           │   <i># Controladores para la gestión de autenticación y registro</i>
│   │           ├── model/
│   │           │   <i># Modelos de datos para usuarios, sesiones, respuestas, etc.</i>
│   │           ├── repository/
│   │           │   <i># Interfaces de repositorio para la persistencia de datos</i>
│   │           ├── service/
│   │           │   <i># Lógica de negocio y servicios para autenticación y registro</i>
│   │           └── utils/
│   │               <i># Metodos utiles, como mappers de clases, validaciones personalizadas </i>
│   └── resources/
│       └── application.properties <i># Configuración de la aplicación, incluyendo la configuración de la base de datos</i>
├── test/
│   └── java/
│       └── com/
│           └── ejemplo/
│               <i># Pruebas unitarias y de integración</i>
</pre>
<!--                   -->
<br>
<!-- Recursos -->
<h2 id="recursos" align="center">Recursos</h2>
<p>Dentro de la carpeta "recursos", ubicada en la raíz del proyecto, encontrarás tanto la estructura de carpetas del mismo como la documentación Swagger detallada sobre la implementación del registro, una coleccion postman para la prueba de endpoints y un diagrama sencillo uml</p>
<!--  -->
<br>
<!-- Instalación -->
<h2 id="instalación" align="center">Instalación</h2>
<p>Siga los siguientes pasos para instalar el proyecto en su entorno local:</p>
<ol>
    <li>Clone el repositorio:</li>
</ol>
<pre><code>git clone https://github.com/usuario/repo.git</code></pre>
<ol start="2">
    <li>Cambie al directorio del proyecto:</li>
</ol>
<pre><code>cd EvaluacionJavaRegistroUsuarios</code></pre>
<ol start="3">
    <li>Construya el proyecto utilizando Gradle o Maven:</li>
</ol>
<pre><code>gradle build</code></pre>
<p>o</p>
<pre><code>mvn clean install</code></pre>
<p>Asegúrese de configurar la base de datos según las especificaciones del archivo <code>application.properties</code>, en este caso se utiliza una base de datos en memoria H2</p>
<!--  -->
<br>
<!-- Desarrollo -->
<h2 id="desarollo" align="center">Desarrollo</h2>
<p>Para ejecutar la aplicación en modo de desarrollo, utilice el siguiente comando:</p>
<pre><code>gradle bootRun</code></pre>
<p>o</p>
<pre><code>mvn spring-boot:run</code></pre>
<!--  -->
<br>
<!-- Uso -->
<h2 id="uso" align="center">Uso</h2>
<p>Para iniciar la aplicación, ejecute el siguiente comando:</p>
<pre><code>gradle bootRun</code></pre>
<p>o</p>
<pre><code>mvn spring-boot:run</code></pre>
<p>El servidor se iniciará en el puerto 8080 por defecto. Puede acceder a la API en <code>http://localhost:8080</code>.</p>
<br>
<p>Configure cualquier cliente de prueba de API (por ejemplo, Postman) utilizando la documentación proporcionada en la carpeta "recursos" para probar los endpoints de la API.</p>
<!--  -->
<br>
<!-- Pruebas -->
<h2 id="pruebas" align="center">Pruebas</h2>
<!--  -->
<br>
<!-- Contribuciones -->
<h2 id="contribuciones" align="center">Contribuciones</h2>
<p>Este proyecto es de código abierto y las contribuciones son bienvenidas. Si desea contribuir, siga estos pasos:</p>
<ol>
    <li>Realice un "fork" del repositorio</li>
    <li>Clone su fork en su entorno local</li>
    <li>Cree una nueva rama con un nombre descriptivo relacionado con la característica o corrección que desea aportar</li>
    <li>Realice sus cambios y envíelos</li>
    <li>Abra una solicitud de extracción (pull request) desde su repositorio al repositorio original</li>
</ol>
<p>Al contribuir al proyecto, asegúrese de seguir las buenas prácticas de desarrollo y las convenciones del código. También es importante mantener una comunicación abierta con el equipo del proyecto, especialmente al discutir nuevas características o cambios significativos en la estructura del código. Trabajar juntos y mantener una comunicación efectiva garantizará que las contribuciones sean valiosas y beneficiosas para el proyecto.</p>
<!--  -->
<br>
<!-- Licencia -->
<h2 id="licencia" align="center">Licencia</h2>
<p>Este proyecto está licenciado bajo la Licencia MIT. Siéntase libre de usar, modificar y distribuir el código siguiendo los términos de la licencia.</p>
<pre align="center">
    /\_/\  
   / o o \ 
  (   "   ) 
</pre>
