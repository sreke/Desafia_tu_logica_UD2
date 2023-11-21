//mostrar números divisibles entre 2 y 3 en el rango del 1 al 100

package Ejercicios;

public class Ejercicio_3 {
	
	
	public static void main(String[]args) {
	
		int num;
		
		for(num=1;num<=100;num++) { //más interesante con un for así se puede cambiar el rango fácilmente
			
			if(num%2==0&&num%3==0) {
				
				System.out.println(num+" Es divisible por 2 y 3");
				
				}
				
			}
		
		
		
	}
}
