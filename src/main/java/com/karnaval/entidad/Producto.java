package com.karnaval.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "productos")
@Data
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 255, nullable = false)
	@NotBlank(message = "El nombre no puede estar en blanco")
	@Size(min = 2, max = 255, message = "El nombre debe tener entre 2 y 255 caracteres")
	private String nombre;

	@Column(nullable = false)
	@PositiveOrZero(message = "El precio del producto no puede ser menor a 0")
	private Double precio;

	@Column(nullable = false)
	@PositiveOrZero(message = "El stock del producto no puede ser menor a 0")
	private Integer stock;

	private String descripcion;
	
	private String ubicacionAlmacen;

	private String foto;
}
