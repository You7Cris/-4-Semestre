package Paquete1;

import java.util.Scanner;



public class Clase1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		float []numeros = new float[4];
		for(int i=0; i < 4; i++)
		{
			System.out.println("Ingrese el "+(i+1)+" valor: ");
			numeros[i]=sc.nextFloat();
			
			if(numeros[i] % 1 == 0)
			{
				System.out.println("El numero es entero");
			}else {
				System.out.println("El numero no es entero");
				//break;//Si detecta que es un decimal, salta
			}
		}
		sc.close();
		for(int i= 3; i >= 0; i--)
		{
			System.out.println("El numero "+(i+1)+" es :"+numeros[i]);
		}
		

	}
	
	

}
