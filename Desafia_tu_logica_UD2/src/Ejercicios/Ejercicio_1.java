//mostrar números de 10 al 1, en ese orden

package Ejercicios;

public class Ejercicio_1 {
		
	public static void main(String[]args) {
		
		int num,contador;
		
		num=10;
		contador=0;
		
		while(contador<10) {
			
			contador=contador+1;
			System.out.println(num);
			num=num-1;
			
		}
	}
}
