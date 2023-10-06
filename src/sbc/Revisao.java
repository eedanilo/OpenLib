package sbc;

public class Revisao {
	private int artigo;
	private String revisor;
	private String data;
	private String texto;
	private boolean status;
	
	public Revisao (int idArtigo, String revisor, String data, String texto, boolean status) {
		this.artigo = idArtigo;
		this.revisor = revisor;
		this.data = data;
		this.texto = texto;
		this.status = status;
	}
	
	public String toString() {
		return "toString Revisão";
	}
}
