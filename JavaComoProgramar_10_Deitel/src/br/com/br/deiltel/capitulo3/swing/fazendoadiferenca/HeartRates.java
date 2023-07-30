package br.com.br.deiltel.capitulo3.swing.fazendoadiferenca;

public class HeartRates {

	private String nome;
	private String sobreNome;
	private int diaIdade;
	private int mesIdade;
	private int anoIdade;
	
	private int diaAtual;
	private int mesAtual;
	private int anoAtual;
	
	private int idadeAtual;
	private int frequenciaCardiacaMaxima = 220;
	private int frequenciaCardiacaAlvo;
	
	
	public HeartRates(String nome, String sobreNome) {
				this.nome = nome;
		this.sobreNome = sobreNome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public int getDiaIdade() {
		return diaIdade;
	}
	public void setDiaIdade(int diaIdade) {
		this.diaIdade = diaIdade;
	}
	public int getMesIdade() {
		return mesIdade;
	}
	public void setMesIdade(int mesIdade) {
		this.mesIdade = mesIdade;
	}
	public int getAnoIdade() {
		return anoIdade;
	}
	public void setAnoIdade(int anoIdade) {
		this.anoIdade = anoIdade;
	}
	public int getDiaAtual() {
		return diaAtual;
	}
	public void setDiaAtual(int diaAtual) {
		this.diaAtual = diaAtual;
	}
	public int getMesAtual() {
		return mesAtual;
	}
	public void setMesAtual(int mesAtual) {
		this.mesAtual = mesAtual;
	}
	public int getAnoAtual() {
		return anoAtual;
	}
	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}
	
	
	public int calculos() {
		
		idadeAtual = anoAtual - anoIdade;
		
		
		System.out.println("Iformamos que " + nome );
		System.out.println("Iformamos que " + sobreNome );
		System.out.println("Com " + idadeAtual + " anos");
		
		
		return idadeAtual;
		
		/*CONTINUAR PAGINA 78 - DEITEL 30/07/2023*/
		
	}
	

	
	
	
	
	
}
