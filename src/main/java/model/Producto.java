package model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;

	import lombok.Data;
	
@Data
@Entity
@Table(name = "tb_productos")
public class Producto {
	@Column(name = "id_prod")
	@Id
	private String codigo;
	@Column(name = "des_prod")
	private String descripcion;
	@Column(name = "stk_prod")
	private int stock;
	@Column(name = "pre_prod")
	private double precio;
	@Column(name="idcategoria")
	private int idcategoria;
	@ManyToOne
	@JoinColumn(name="idcategoria", insertable=false, updatable=false)
	private Categoria categoria;
	@Column(name = "est_prod")
	private int estado;
	@Column(name = "idprovedor")
	private int idproveedor;
	@ManyToOne
	@JoinColumn(name="idprovedor", insertable=false, updatable=false)
	private Proveedor proveedor;
}