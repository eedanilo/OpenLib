package sbc;

import java.util.ArrayList;

public class Revisor {
	private String email;
	private String nome;
	private String afiliacao;
	private int pontuacao;
	private ArrayList <Artigo> artigosRevisados;
	
	public Revisor (String email, String nome, String afiliacao) {
		this.email = email;
		this.nome = nome;
		this.afiliacao = afiliacao;
		this.pontuacao = 0;
		this.artigosRevisados = new ArrayList<>();
	}
	public String toString() {
		return "uiuiui";
	}
	public void incrementaPontuacao() {
		this.pontuacao++;
	}
	public boolean registraRevisao() {
		this.pontuacao++;
		return true;
	}
	public String getBadge() {
		String badge = "";
		if (this.pontuacao < 10) {
			badge += "Pesquisador P2";
		}
		else if (this.pontuacao >= 10 && this.pontuacao < 20) {
			badge += "Pesquisador P1";
		}
		else if (this.pontuacao >= 20) {
			badge += "Pesquisador Produtivo";
		}
		return badge;
	}
}
