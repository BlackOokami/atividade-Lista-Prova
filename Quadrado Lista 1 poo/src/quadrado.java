import java.util.Scanner;

public class quadrado {
 
	int lado;
	int area;
	int peri;
	int care;
	int caperi;
	
	
quadrado(){
		
	}
	
Scanner leitor = new Scanner (System.in);

	public void caclarea() {		
		care = lado*lado;
		
	}
	
	public void caclperimetro()	{
	caperi = 4*lado;
		
	}
		
	public void imprimir(){
		System.out.println("Lado:" + lado);
		System.out.println("Calculo da Area: " + care);
		System.out.println("Calculo do perimetro: " + caperi);
		
	}
	
	public void ler(){
		System.out.println("Informe o lado: " );
			lado = leitor.nextInt();
		
	}
	
	
	
	
	
}
