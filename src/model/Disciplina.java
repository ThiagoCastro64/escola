package model;

public class Disciplina {
	private int codigo;
	private String nome;
	private String sigla;
	private String turno;
	private int nAulas;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public int getnAulas() {
		return nAulas;
	}
	public void setnAulas(int nAulas) {
		this.nAulas = nAulas;
	}
	
	
}
