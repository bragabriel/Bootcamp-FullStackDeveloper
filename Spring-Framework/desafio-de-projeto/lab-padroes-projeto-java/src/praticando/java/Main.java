package praticando.java;

import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;

public class Main {

	public static void main(String[] args) {
		
		/* Testes relacionados ao Design Pattern Singleton */
		
		/*
		 Padr�es de projeto:
		 - Criacionais: ... Singleton;
		 
		 Singleton: O Padr�o Singleton tem como defini��o garantir
		  que uma classe tenha apenas uma inst�ncia de si mesma
		  e que forne�a um ponto global de acesso a ela.
		  Ou seja, uma classe gerencia a pr�pria inst�ncia dela
		  al�m de evitar que qualquer outra classe crie uma inst�ncia dela.
		 */
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
	}

}
