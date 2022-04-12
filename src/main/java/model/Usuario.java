package model;

	import javax.persistence.Entity;
	import javax.persistence.Table;
	import javax.persistence.Column;
	import javax.persistence.Id;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	@Column(name = "cod_usua")
	@Id
	private int codigo;
	@Column(name = "nom_usua")
	private String nombre;
	@Column(name = "ape_usua")
	private String apellido;
	@Column(name = "usr_usua")
	private String usuario;
	@Column(name = "cla_usua")
	private String clave;
	@Column(name = "fna_usua")
	private String fechNacim;
	@Column(name = "idtipo")
	private int tipo;
	@Column(name = "est_usua")
	private int estado;
	
	public Usuario(int codigo, String nombre, String apellido, String usuario, String clave, String fechNacim, int tipo,
			int estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.clave = clave;
		this.fechNacim = fechNacim;
		this.tipo = tipo;
		this.estado = estado;
	}
	
	public Usuario() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getClave() {
		return clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getFechNacim() {
		return fechNacim;
	}
	
	public void setFechNacim(String fechNacim) {
		this.fechNacim = fechNacim;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario
				+ ", clave=" + clave + ", fechNacim=" + fechNacim + ", tipo=" + tipo + ", estado=" + estado + "]";
	}	
}