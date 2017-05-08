import java.util.Scanner;

public class circulo {
	int raio;
	int area;
	int perimetro;
	double care;
	double caperi;
	double pi = 3.14;
	circulo(){
		
	}

	Scanner leitor = new Scanner (System.in);

	public void caclarea() {		
		care = pi*raio*raio;
		
	}
	
	public void caclperimetro()	{
		caperi = (2*pi*raio);
		
	}
		
	public void imprimir(){
		System.out.println("Calculo da Area: " + care);
		System.out.println("Calculo do perimetro: " + caperi);

	}

	public void ler(){
		System.out.println("Informe o raio");
		 raio = leitor.nextInt();
	}
}
