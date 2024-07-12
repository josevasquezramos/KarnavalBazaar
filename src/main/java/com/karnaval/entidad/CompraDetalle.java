package com.karnaval.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@IdClass(CompraDetalleID.class)
@Table(name = "compra_detalles")
@Data
public class CompraDetalle {

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(
			name = "idCompra",
			referencedColumnName = "id",
			nullable = false,
			foreignKey = @ForeignKey(name = "fk_compras_compra_detalle"))
	private Compra compra;

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(
			name = "idProducto",
			referencedColumnName = "id",
			nullable = false,
			foreignKey = @ForeignKey(name = "fk_productos_compra_detalle"))
	private Producto producto;

	private Integer cantidad;
	private Double precioUnitario;
}
