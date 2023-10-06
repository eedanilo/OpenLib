package sbc;

import java.util.HashMap;

public class SBCOpenLibController {
	private HashMap <String, Artigo> artigos;
	private HashMap <String, Revisor> revisores;
	private HashMap <String, Revisao> revisoes;
	
	public SBCOpenLibController () {
		this.artigos = new HashMap<>();
		this.revisores = new HashMap<>();
		this.revisoes = new HashMap<>();
	}
	public void cadastrarRevisor (String email, String nome, String afiliacao) {
		Revisor novoRevisor = new Revisor(email, nome, afiliacao);
		this.revisores.put(email, novoRevisor);
	}
	public String listarRevisor (String email) {
		return this.revisores.get(email).toString();
	}
	public String[] listarRevisores() {
		String[] lista = new String[revisores.size()];
		int i = 0;
		for (Revisor r: this.revisores.values()) {
			lista[i] = r.toString();
			i++;
		}
		return lista;
	}
	public String[] listarRevisoresPorBadge (String badge) {
		String[] listaPorBadge = new String[revisores.size()];
		int j = 0;
		for (Revisor r: this.revisores.values()) {
			if (r.getBadge.equals(badge)) {
				listaPorBadge[j] = r.toString();
				j++;
			}
			return listaPorBadge;
		}
	}
	public int cadastrarArtigo (String titulo, String autores, String link) {
		Artigo novoArtigo = new Artigo (titulo, autores, link);
		this.artigos.put(Integer.toString(novoArtigo.getId()), novoArtigo);
		return novoArtigo.getId();
	}
	public boolean ehArtigoAprovado (int idArtigo) {
		return this.artigos.get(Integer.toString(idArtigo)).verificaAprovacao();
	}
	public String listarArtigo (int idArtigo) {
		return this.artigos.get(Integer.toString(idArtigo)).toString();
	}
	public String[] listarArtigos () {
		String[] listArtigos = new String[this.artigos.size()];
		int ar = 0;
		for (Artigo a: artigos.values()) {
			listArtigos[ar] = a.toString();
			ar++;
		}
		return listArtigos;
	}
	public String[] listarArtigosPorStatus (boolean aprovado) {
		String[] artigosPorStatus = new String[this.artigos.size()];
		int b = 0;
		for (Artigo artigo: artigos.values()) {
			if (artigo.verificaAprovacao() == true) {
				artigosPorStatus[b] = artigo.toString();
				b++;
			}
		}
		return artigosPorStatus;
	}
	public void realizarRevisao (int idArtigo, String emailRevisor, String data, String texto, boolean status) {
		Revisao novaRevisao = new Revisao(idArtigo, emailRevisor, data, texto, status);
		
	}
	public String[] listarRevisoesArtigo (int idArtigo) {
		
	}
	public String[] listarArtigosRevisados (String emailRevisor) {
		String[] artigosRevisados = new String[];
	}
}
