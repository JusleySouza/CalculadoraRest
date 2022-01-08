package com.calculadora.rest.services;

import org.springframework.stereotype.Service;

import com.calculadora.rest.model.Numeros;
import com.calculadora.rest.model.Resultado;

@Service
public class Operacoes {
	
	private Resultado resultado = new Resultado();

	public Numeros soma1(Numeros numeros) {
	
		numeros.setResultado(numeros.getN1() + numeros.getN2());
		
		return numeros;
	}
	
	public Resultado soma2(Numeros numeros) {
		
		resultado.setResultado(numeros.getN1() + numeros.getN2());
		resultado.setContador(resultado.getContador() + 1);
		
		return resultado;
	}
	
	public Numeros subtracao1(Numeros numeros) {
		numeros.setResultado(numeros.getN1() - numeros.getN2());
		
		return numeros;
	}

	public Resultado subtracao2(Numeros numeros) {
	
		resultado.setResultado(numeros.getN1() - numeros.getN2());
		resultado.setContador(resultado.getContador() + 1);
		
		return resultado;
	}
	
	public Numeros multiplicacao1(Numeros numeros) {
		numeros.setResultado(numeros.getN1() * numeros.getN2());
		
		return numeros;
	}

	public Resultado multiplicacao2(Numeros numeros) {
	
		resultado.setResultado(numeros.getN1() * numeros.getN2());
		resultado.setContador(resultado.getContador() + 1);
		
		return resultado;
	}
	
	public Numeros divisao1(Numeros numeros) {
		numeros.setResultado(numeros.getN1() / numeros.getN2());
		
		return numeros;
	}

	public Resultado divisao2(Numeros numeros) {
	
		resultado.setResultado(numeros.getN1() / numeros.getN2());
		resultado.setContador(resultado.getContador() + 1);
		
		return resultado;
	}
}
