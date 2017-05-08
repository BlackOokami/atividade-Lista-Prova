import java.util.Scanner;

public class Eletrodomestico {
	boolean ligado;
	boolean on;
	String ação;
	
	
	Eletrodomestico(){
		
	}
	
	Scanner leitor = new Scanner (System.in);
	
	String ligado() {
	if (ligado == on){
		ligado = true;
		ação = "Ligada"; 
    
	}else{
		ligado = false;
		ação = "Desligada";
	}
	return ação;
	
	}
	
  void imprimir(){
	  
	System.out.println("O estado é: " + ação);  
	
  }
	void ler(){
		System.out.println("O que você que fazer: ");
		ação = leitor.next();
	}

}






