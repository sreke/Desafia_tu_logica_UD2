//pedir un número, debe de ser positivo si no, reiterar la entrada
//si el número introducido es válido, mostrar los 20 números sucesivos al introducido

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_2 {
	
	public static void main(String[]args){

	Scanner sc = new Scanner(System.in);
	
	int num,contador;
	boolean flag;
	
	
	System.out.print("Escribe un número = ");
	
	num = sc.nextInt();
	
	flag=false;
	
	while(flag==false) { //si bandera no es true seguirá pidiendo número
		
		if(num>=0) {
			flag=true; //sale del while
		}else {
			flag=false;
			System.out.print("El número debe de ser positivo = ");
			num = sc.nextInt();
		}
	}
	
		contador=0;
		while(contador<20) { 
			num=num+1; //para mostrar el siguiente número sucesivo exceptuando el introducido
			System.out.println(num);
			contador=contador+1;
		}
	
	
	}
	
}
	
