package Paquete1;


import java.util.Scanner;

public class Punto25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int prestamo=200,anos=5;
		double totalAPagar = (prestamo+(prestamo*0.06));
		double cuota = (totalAPagar/anos);
		double deuda= (totalAPagar);
		
		System.out.println("Miguel debera pagar cada año así:");
		System.out.println(totalAPagar+" | "+cuota+" | "+deuda);
		
		for(int i=1;i<=5;i++) {
			System.out.println("Año:"+i+" Cuota:"+cuota+" Deuda:"+String.format("%.2f",(deuda-(cuota*i)))+" Pagado:"+String.format("%.2f",(totalAPagar-(cuota*i))));
		}
	}

}
