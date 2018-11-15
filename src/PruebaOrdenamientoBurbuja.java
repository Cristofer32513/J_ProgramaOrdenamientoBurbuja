import java.util.Arrays;

class MetodoDeOrdenamientoBurbuja{
	
	public void mostrarVector(int[] datos){
		System.out.println(Arrays.toString(datos));
	}	
	
	public void mostrarDatosDeEficiencia(int contadorComparaciones,
			int contadorIntercambios, int contadorRecorridos, long tiempoTotal){
		System.out.println("       DATOS DE EFICIENCIA DEL ALGORITMO");
		System.out.println();
		System.out.println("    - Cantidad de recorridos realizados: "+contadorComparaciones);
		System.out.println("    - Cantidad de comparaciones realizadas: "+contadorComparaciones);
		System.out.println("    - Cantidad de intercambios realizados: "+contadorIntercambios);
		System.out.println("    - Tiempo total de ejecucion: "+tiempoTotal);
		System.out.println("    - Tiempo total de ejecucion: "+(double)tiempoTotal/1000000+" milisegundos");
	}
	
	public void ordenamientoBurbuja0(int[] datos){
		int contadorComparaciones=0, contadorIntercambios=0, contadorRecorridos=0;
		long tiempoTotal=0, tiempoInicial=0;
		
		int aux=0;
		tiempoInicial=System.nanoTime();
		for(int i=0;i<datos.length;i++){
			for(int j=(i+1);j<datos.length;j++){
				contadorComparaciones++;
				if(datos[i]>datos[(j)]){
					contadorIntercambios++;
					aux=datos[i];
					datos[i]=datos[j];
					datos[j]=aux;
				}
			}
			contadorRecorridos++;
		}
		tiempoTotal=System.nanoTime()-tiempoInicial;
		mostrarVector(datos);
		System.out.println();
		System.out.println();
		mostrarDatosDeEficiencia(contadorComparaciones, contadorIntercambios, contadorRecorridos, tiempoTotal);
	}
	
	public void ordenamientoBurbuja1(int[] datos){
		int contadorComparaciones=0, contadorIntercambios=0, contadorRecorridos=0;
		long tiempoTotal=0, tiempoInicial=0;
		
		int aux=0;
		tiempoInicial=System.nanoTime();
		for(int i=2;i<=datos.length;i++){
			for(int j=0;j<=(datos.length-i);j++){
				contadorComparaciones++;
				if(datos[j]>datos[j+1]){
					contadorIntercambios++;
					aux=datos[j];
					datos[j]=datos[j+1];
					datos[j+1]=aux;
				}
			}
			contadorRecorridos++;
		}
		tiempoTotal=System.nanoTime()-tiempoInicial;
		mostrarVector(datos);
		System.out.println();
		System.out.println();
		mostrarDatosDeEficiencia(contadorComparaciones, contadorIntercambios, contadorRecorridos, tiempoTotal);
	}
}

public class PruebaOrdenamientoBurbuja {

	public static void main(String[] args) {
		int[] edades={34, 25, 12, 87, 9, 10, 34, 37, 24, 2};
		
		MetodoDeOrdenamientoBurbuja burbuja=new MetodoDeOrdenamientoBurbuja();
		
		System.out.println("=================VECTOR ORIGINAL======================");
		burbuja.mostrarVector(edades);
		System.out.println();
		System.out.println();
		System.out.println("===============ORDENAMIENTO BURBUJA===================");
		burbuja.ordenamientoBurbuja0(edades);
			
		burbuja.ordenamientoBurbuja1(edades);
				
		
		
		
		
	}
}