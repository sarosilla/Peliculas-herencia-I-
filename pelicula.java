package peliculas2;

import java.sql.Date;

public class pelicula {

	private String titulo;
	private Date año;
	private String sinopsis;
	private Enum<?> Genero;
	private String Pais;
	
	public java.util.Collection Persona = new java.util.TreeSet();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getAño() {
		return año;
	}

	public void setAño(Date año) {
		this.año = año;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public Enum<?> getGenero() {
		return Genero;
	}

	public void setGenero(Enum<?> genero) {
		Genero = genero;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}
}
