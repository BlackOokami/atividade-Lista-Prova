import java.util.Scanner;

public class moto {
	//atributos
	
	String marca;
	String modelo;
	String cor;
	int marcha;
	int marchatotal;
	boolean Status;
	String on;
	 
	moto(){
		
	}
	Scanner leitor = new Scanner(System.in);
	
	void imprimir(){
	   System.out.println("Marca: Harley Davidson");
	   System.out.println("Modelo: Iron 883");
	   System.out.println("Cor: Preto");
	
	}
	
		
	
		
	moto(int marchamax) {
		marcha = marchamax;
		
	}

	void inicializarmarcha(int marchain) {
		marcha = marchain;
		
	}

	void inicializamarchatot(int marchatotin){
		marchatotal = marchatotin;
		
	}
	
	
	int shiftup() {
		if (marcha < marchatotal) {
			marcha++;
		System.out.println("Marcha: " + marcha);
		
		}else{
			System.out.println("Limite de marcha atingido");
			
		}
		return marcha;
		
	}
	 
	int shiftdown() {
		if (marcha >= 0){
			marcha --;
			System.out.println("Marcha: " + marcha);			
		
		}else{
			System.out.println("Marcha minima atingida");
		
		}
	    return marcha;
		
		
		}
	String Status() {
		if(marcha > 0) {
			Status = true;
			on = "Ligada";
		}else{
			Status = false;
			on = "Desligada";
		}
		return on;
	}
	
	
	

}
