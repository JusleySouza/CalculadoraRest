package com.calculadora.rest.validator;

import com.calculadora.rest.model.Numeros;

public class Validations {

	private boolean divisaoPorZero;
	private String mensagem;
	
	public Validations() {
		this.divisaoPorZero = false;
		this.mensagem = "";
	}
	
	
	public boolean getDivisaoPorZero() {
		return divisaoPorZero;
	}


	public void setDivisaoPorZero(boolean divisaoPorZero) {
		this.divisaoPorZero = divisaoPorZero;
	}


	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
public boolean divisaoPorZero(Numeros numeros) {
		
		if(numeros.getN2() == 0) {
			setDivisaoPorZero(true);
			setMensagem("Não é possível dividir por 0!!");
		}
		else {
			setDivisaoPorZero(false);
		}
		
		return getDivisaoPorZero();
	}

}
