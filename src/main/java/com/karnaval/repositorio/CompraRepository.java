package com.karnaval.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karnaval.entidad.Compra;

public interface CompraRepository
		extends JpaRepository<Compra, Long> {

}
