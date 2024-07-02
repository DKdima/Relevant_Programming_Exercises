package ParImpar;

import java.util.Scanner;

public class ParImpar {


	    public static boolean esPar(int numero) {
	        return numero % 2 == 0;
	    }
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner (System.in);
	    	System.out.println("Inserte un número");
	        int numero = sc.nextInt();
	        if (esPar(numero)) {
	            System.out.println("Sí es par");
	        } else {
	            System.out.println("No es par");
	        }
	    }

	}