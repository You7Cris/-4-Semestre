package Ordenar;

public class OrdenamientoQuicksort {
	
	public void OrdenamientoQuicksort(int arreglo[])
	{
		int n = arreglo.length;
		Quicksort(arreglo,0,n);
		
	}
	
	public void Quicksort(int arreglo[],int limite_izq, int limite_der) {
		int temporal;
		int izq = limite_der; //empieza en cero
		int der = limite_izq; //longitud total
		int vector[] = new int[(izq+der)/2];
		int pivote = vector[(izq+der)/2]; //Pivote almacena el vector
		do {
			while(vector[izq]<pivote && izq<limite_der)
			{
				izq ++;
			}
			while(pivote<vector[der] && der > limite_izq)
			{
				der ++;
			}
			if(izq <= der)
			{
				temporal = vector[izq]; //temporal almacena el vector en la posicion izquierda
				vector[izq] = vector[der];
				vector[der] = temporal;
				izq++;
				der--;
			}
		}while(izq<=der);
		if(limite_izq < der)
		{
			Quicksort(vector,limite_izq,der);
		}else if(limite_der > izq)
		{
			Quicksort(vector,izq,limite_der);
		}
		
		
		
	}

}
