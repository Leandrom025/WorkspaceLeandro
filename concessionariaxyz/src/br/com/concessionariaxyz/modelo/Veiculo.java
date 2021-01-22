package br.com.concessionariaxyz.modelo;

public class Veiculo {
	
	private String montadora;
	private String modelo;
	private float velocidadeMaxima;
	private float velocidadeAtual;
	private boolean status;
	private float valor;
	
	// Sintaxe dos métodos
	// <modificador> <tipo do retorno> <nome do método>(<tipo do param> <nome do param>) 
	
	public String verificarStatus() {
		return "Ligado?" + status + "\n" + "Velocidade Atual: " + velocidadeAtual;
	}
	
	
	public void desacelerar() {
		if (velocidadeAtual>0) {
			velocidadeAtual-=10;
		}
	}
	
	
	public void acelerar() {
		if (velocidadeAtual<velocidadeMaxima) {
			velocidadeAtual+=10;
		}
	}
	
	

	
	public String desligar() {
		if (status==true) {
			status=false;
		}
		return "Veículo desligado";
	}
	
	
	public String ligar() {
		if (status==false) {
			status=true;
		}
		return "Veículo Ligado";
		
	}
	
	public float retornarValor() {
		return valor;
	}
	
	public void preencherValor(float param) {
		if (param>0) {
			valor = param;
		}
	}
	
	public float retornarVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	
	public void preencherVelocidadeMaxima(float param) {
		if (param>0) {
			velocidadeMaxima = param;
		}
	}
	
	public String retornarModelo() {
		return modelo;
	}
	
	
	public void preencherModelo(String param) {
		modelo = param.toUpperCase();
	}
	
	
	public String retornarMontadora() {
		return montadora;
	}
	
	
	
	public void preencherMontadora(String param) {
		montadora = param.toUpperCase();
	}
	
}