package ProjetoBiblioteca2;

public class Livro {
	private String titulo;
	private int genero;
	private String autor;
	private int id;

	public Livro(int id, String autor, int genero, String titulo) {
		this.id = id;
		this.autor = autor;
		this.genero = genero;
		this.titulo = titulo;
		
	}
	
	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getGenero() {
		return genero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getGeneroString() {
		switch(genero) {
		case 1:
			return "LGBTQIA+";
		case 2:
			return "Infantil";
		case 3:
			return "Autoajuda";
		case 4:
			return "Ciências Sociais";
		default:
			return "";
		}
	}
}
