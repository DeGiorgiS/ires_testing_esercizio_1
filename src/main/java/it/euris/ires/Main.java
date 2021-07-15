package it.euris.ires;

public class Main {

    public static void main (String[] args){

        //precondizioni (classe istanziata e input: int 1 e int 1)
        System.out.println("Calcolator instanziato");
        Calculator calc = new Calculator();
        System.out.println("input: a->int 1 ; b->int 1");
        int a = 1;
        int b = 1;

        //SUT
        int result = calc.add(a, b);

        // postcondizioni: output int 2
        System.out.println("Il risultato è: " + result + "rispetto all'atteso di 2");

        //precondizioni (classe istanziata e input: int 2000000000 e int 2000000000)
        System.out.println("input: a->int 2000000000 ; b->int 2000000000");
        a = 2000000000;
        b = 2000000000;

        //SUT
        result = calc.add(a, b);

        // postcondizioni: output int 4000000000
        System.out.println("Il risultato è: " + result + "rispetto all'atteso di 4000000000");
        System.out.println("COMPORTAMENTO ANOMALO BECCATO");
    }
}
