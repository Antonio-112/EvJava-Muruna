package com.muruna.evaluacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.muruna.evaluacion.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
    User findByEmail(String email);
    void delete(User user);
    
    @Modifying
    @Query("UPDATE app_user u SET u.isActive = :isActive WHERE u.id = :userId")
    void updateIsActive(@Param("userId") String userId, @Param("isActive") boolean isActive);
   }
