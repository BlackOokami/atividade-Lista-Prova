import java.util.Scanner;

public class retangulo {
	
	int largura;
	int area;
	int peri;
	int compri;
	int caperi;
	int care;
		
		
	retangulo(){
			
		}
		
	Scanner leitor = new Scanner (System.in);

		public void caclarea() {		
			care = largura*compri;
			
		}
		
		public void caclperimetro()	{
			caperi = (2*largura) + (2*compri);
			
		}
			
		public void imprimir(){
			System.out.println("Calculo da Area: " + care);
			System.out.println("Calculo do perimetro: " + caperi);
			
		}
		
		public void ler(){
			System.out.println("Informe a largura: " );
				largura = leitor.nextInt();
			System.out.println("Informe o comprimento");
			 	compri = leitor.nextInt();
		}
		
}
