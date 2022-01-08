package com.calculadora.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculadora.rest.exception.UnsupportedMathOperationsException;
import com.calculadora.rest.model.Numeros;
import com.calculadora.rest.model.Resultado;
import com.calculadora.rest.services.Operacoes;
import com.calculadora.rest.validator.Validations;

@RestController
@ RequestMapping("/calculadora")
public class CalculadoraController {

	Validations validations = new Validations();
	
	@Autowired
	private Operacoes operacoes;
	
	@GetMapping
	public String hello(){
		return "Hello World!!!";
	}
	
	@GetMapping("/{n1}/{n2}")
	public int soma(@PathVariable("n1") int n1, @PathVariable("n2") int n2){
		return n1 + n2;
	}
	
	@GetMapping("/soma1")
	public Numeros soma1(@RequestBody Numeros numeros){
		return operacoes.soma1(numeros);
	}
	
	@GetMapping("/soma2")
	public Resultado soma2(@RequestBody Numeros numeros) {
		return operacoes.soma2(numeros);
	}
	
	@GetMapping("/subtracao1")
	public Numeros subtracao1(@RequestBody Numeros numeros) {
		return operacoes.subtracao1(numeros);
	}
	
	@GetMapping("/subtracao2")
	public Resultado subtracao2(@RequestBody Numeros numeros) {
		return operacoes.subtracao2(numeros);
	}
	
	@GetMapping("/multiplicacao1")
	public Numeros multiplicacao1(@RequestBody Numeros numeros) {
		return operacoes.multiplicacao1(numeros);
	}
	
	@GetMapping("/multiplicacao2")
	public Resultado multiplicacao2(@RequestBody Numeros numeros) {
		return operacoes.multiplicacao2(numeros);
	}
	
	@GetMapping("/divisao1")
	public Numeros divisao1(@RequestBody Numeros numeros) {
		
		if(validations.divisaoPorZero(numeros)) {
			throw new UnsupportedMathOperationsException(validations.getMensagem());
		}
		
		return operacoes.divisao1(numeros);
	}
	
	@GetMapping("/divisao2")
	public Resultado divisao2(@RequestBody Numeros numeros) {
		return operacoes.divisao2(numeros);
	}
}
