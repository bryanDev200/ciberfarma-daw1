package model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

@Entity
@Table(name="tb_categorias")
public class Categoria {
	@Column(name="idcategoria")
	@Id
	private int idCat;
	@Column(name="descripcion")
	private String descripcionCat;
	
	public Categoria(int idCat, String descripcionCat) {
		super();
		this.idCat = idCat;
		this.descripcionCat = descripcionCat;
	}

	public Categoria() {
		super();
	}

	public int getIdCat() {
		return idCat;
	}

	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}

	public String getDescripcionCat() {
		return descripcionCat;
	}

	public void setDescripcionCat(String descripcionCat) {
		this.descripcionCat = descripcionCat;
	}
}