package sbc;

import java.util.ArrayList;

public class Artigo {
	private String titulo;
	private String autores;
	private String link;
	private int id;
	private boolean statusAprovacao;
	private ArrayList <Revisor> revisores;
	private int tamanho = 0;
	
	public Artigo(String titulo, String autores, String link) {
		this.titulo = titulo;
		this.autores = autores;
		this.link = link;
		this.id = tamanho++;
		this.statusAprovacao = false;
		this.revisores = new ArrayList<>();
	}
	
	public void tornarAprovado() {
		if () {
		this.statusAprovacao = true;
		}
	}
	public boolean verificaAprovacao() {
		return this.statusAprovacao;
	}
	public String toString() {
		return "auauau";
	}
	public int getId() {
		return this.id;
	}
}
