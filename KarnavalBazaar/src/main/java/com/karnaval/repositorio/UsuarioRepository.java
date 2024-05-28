package com.karnaval.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karnaval.entidad.Usuario;

public interface UsuarioRepository
		extends JpaRepository<Usuario, Long> {

}
