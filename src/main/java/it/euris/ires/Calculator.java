package it.euris.ires;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {return a - b;}

	public int multiply(int a, int b) { return a * b;}

	public double divide(int a, int b) {return a / b;}
}


/*
PRECONDIZIONI:
classe istanziata, numeri interi o trasformabili in interi

POSTCONDIZIONI:
ottenere un intero che equivalga al risultato dell'addizione

SUT:
il metodo .add() della classe Calculator

 */