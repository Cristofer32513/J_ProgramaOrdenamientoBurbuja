import java.util.Arrays;

class MetodoDeOrdenamientoBurbuja{
	int contadorComparaciones;
	int contadorIntercambios;
	int contadorRecorridos;
	long tiempoEjecucion;
	
	public void mostrarVector(int[] datos){
		System.out.println(Arrays.toString(datos));
	}	
	
	public void ordenamientoBurbuja0(int[] datos){
		contadorComparaciones=0;
		contadorIntercambios=0;
		contadorRecorridos=0;
		tiempoEjecucion=0;
		long tiempoInicio=0;
		long tiempoFin=0;
		
		int aux=0;
		tiempoInicio=System.currentTimeMillis();
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
		tiempoFin=System.currentTimeMillis();
		tiempoEjecucion=tiempoFin-tiempoInicio;
	}
	
	public void ordenamientoBurbuja1(int[] datos){
		int aux=0;
		for(int i=2;i<datos.length;i++){
			for(int j=0;j<(datos.length-i);j++){
				if(datos[j]>datos[j+1]){
					aux=datos[j];
					datos[j]=datos[j+1];
					datos[j+1]=aux;
				}
			}
		}
	}
}

public class PruebaOrdenamientoBurbuja {

	public static void main(String[] args) {
		int[] edades={34, 25, 12, 87, 9, 10, 34, 37, 24, 2};
		
		MetodoDeOrdenamientoBurbuja burbuja=new MetodoDeOrdenamientoBurbuja();
		
		System.out.println("=================VECTOR ORIGINAL======================");
		burbuja.mostrarVector(edades);
		System.out.println();
		System.out.println("===============ORDENAMIENTO BURBUJA===================");
		//burbuja.ordenamientoBurbuja0(edades);
		//burbuja.mostrarVector(edades);
		System.out.println();
		System.out.println();
		
		/*System.out.println("DATOS DE EFICICENCIA DEL ALGORITMO DE ORDENAMIENTOBURBUJA0");
		System.out.println();
		System.out.println("    - Cantidad de recorridos realizados: "+burbuja.contadorComparaciones);
		System.out.println("    - Cantidad de comparaciones realizadas: "+burbuja.contadorComparaciones);
		System.out.println("    - Cantidad de intercambios realizados: "+burbuja.contadorIntercambios);
		System.out.println("    - Tiempo total de ejecucion: "+burbuja.tiempoEjecucion);*/
		
		burbuja.ordenamientoBurbuja1(edades);
		burbuja.mostrarVector(edades);
		
		
		
		
	}
}