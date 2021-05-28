import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Elige el ejercicio que quieres hacer");
		int numeroEjercicio = Integer.parseInt( br.readLine());
		
		
		switch (numeroEjercicio) {
		case 1:
			System.out.println("Escribe la funcion tabladeMultiplicar");
			tablaMultiplicar(4);
		break;
		
		case 2:
			System.out.println("Escribe una funcion imprimeSerie");
			imprimeSerie(5,1);
			break;
			
		case 3:
			System.out.println("Escribe una funcion signo");
			System.out.println(signo(-0));
			break;
			
		case 4:
			System.out.println("Escribe una funcion max");
			System.out.println(max(1, 9));
			break;
		case 5:
			System.out.println("Escribe una funcion area triangulo que te calcule el area de un triangulo y se le pasa por parametros la base y la altura");
			System.out.println(areaTriangulo(2, 4));
			break;
			
		case 18:
			System.out.println("Escribe una funcion area triangulo que te calcule el area de un triangulo y se le pasa por parametros la base y la altura");
			Ejercicio18();
			break;
			
		default: 
			System.out.println("No hay ningun ejercicio con ese numero");
			break;	
		}	
		
	}
	public static void tablaMultiplicar(int n1) throws NumberFormatException, IOException {		
		for(int i = 0;i<=10;i++) 
			System.out.println(n1 + "x" + i + "=" + n1*i );
	}
	public static void imprimeSerie(int n1, int n2) {
		
		if (n1 <=n2) {
			for (; n1<=n2; n1++) {
			System.out.println(n1);
			}	
		}else if (n2<= n1){
			for (; n2<=n1; n1--) {
				System.out.println(n1);
			}
		}else {
			System.out.println("Los dos numeros son iguales");
		}
		
	}
	public static int signo(int n1) {
		int resultado = 0;
		if (n1 <0) {
			resultado = -1;
					
			
		}else if (n1> 0){
			resultado = 1;
				
		
		}
		return resultado;
		
	}
	public static int max(int n1, int n2) {		 
		int mayor= n1;
		if (n1 <n2) {
			mayor = n2;
						
		}
		return mayor;
	}
	
		public static int areaTriangulo(int n1, int n2) {		 
			int multiplicacion = (n1*n2)/2;
			
			return multiplicacion;
	}
		public static void Ejercicio18() throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		
			String Opciones = br.readLine();
			switch (Opciones) {
			
			case "a":
				int n1 = 0;
				for (int i = 0;i<100;i++) {	
				System.out.println(n1*11);
				n1++;
				}
				
			break;

			case "b":
				int n2 = 0;
				for (int i = 0;i<100;i++) {	
					System.out.println(n2*17);
					n2++;
				}
				
				
			break;

			case "c":
				int n3 = 0;
				for (int i = 0;i<100;i++) {	
					System.out.println(n3*23);
					n3++;
				}

			break;
			}
		}
	
}
