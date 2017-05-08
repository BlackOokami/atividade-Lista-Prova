import java.util.Scanner;

public class micro {
	boolean ligado;
	String on;
	int porta;
	String aberta;
	
	micro(){
		
	}
	Scanner leitor = new Scanner(System.in);
	
	void imprimir(){
		System.out.println("A porta está: ");
			porta = leitor.nextInt();
	}
	

	
	String ligado() {
		
		if(porta == 1) {
			ligado = true;
			on = "ligado";
		}else{
			ligado = false;
			on = "desligado";
		}
		return on;
	}
	
}
