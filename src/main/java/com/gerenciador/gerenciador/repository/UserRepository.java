package com.gerenciador.gerenciador.repository;

import com.gerenciador.gerenciador.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Adicione métodos personalizados aqui, se necessário
}