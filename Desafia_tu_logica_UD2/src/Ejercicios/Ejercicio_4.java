//pedir 3 números
//pedir una orden para ordenarlos de manera ascendente o descendente
//mostrar resultado según la orden pedida

package Ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[]args) {
		
		int num1,num2,num3,mayor,mediano,menor,orden;
	
		
		Scanner sc = new Scanner(System.in);
		
		num1=0; num2=0; num3=0; mayor=0; mediano=0; menor=0; orden=0;
		
		System.out.println("Introduce 3 números");
		System.out.print("1º = ");
		num1=sc.nextInt();
		System.out.print("2º = ");
		num2=sc.nextInt();
		System.out.print("3º = ");
		num3=sc.nextInt();
		System.out.print("Para ordenarlos de manera ascedente escribe '1' para descendente '2' = ");
		orden=sc.nextInt();
		
		if(num1>num2&&num1>num3) {
			mayor=num1;
			if(num2>num3) {
				mediano=num2;
				menor=num3;
			}else {
				mediano=num3;
				menor=num2;
			}
		}
		
		if(num2>num1&&num2>num3) {
			mayor=num2;
			if(num1>num3) {
				mediano=num1;
				menor=num3;
			}else {
				mediano=num3;
				menor=num1;
			}
		}
		
		if(num3>num1&&num3>num2) {
			mayor=num3;
			if(num2>num1) {
				mediano=num2;
				menor=num1;
			}else {
				mediano=num1;
				menor=num2;
			}
		}
	
		switch(orden) {
		case 1:
			System.out.print(+mayor+"/"+mediano+"/"+menor);
			break;
		
		case 2:
			System.out.print(+menor+"/"+mediano+"/"+mayor);
			break;
			
		}
		
	}
	
	
}
