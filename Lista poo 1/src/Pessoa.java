import java.util.Scanner;

public class Pessoa {
	//atributos
	public String nome;
	public String ende;
	public int telefone;
	
	//construtor
	Pessoa() {
		
	}
	Scanner leitor = new Scanner (System.in);
	 
	public void imprimir() {
		System.out.println("Nome: " + nome  );
		System.out.println("Endereço: " + ende);
		System.out.println("telefone: " + telefone);
		
	}
	
	public void construtor(){
		System.out.println("Informe o seu nome: ");
			nome = leitor.nextLine();			
		System.out.println("Informe o endereço: ");
		    ende = leitor.nextLine();
	 	System.out.println("Informe o telefone: ");
		 	telefone = leitor.nextInt();
		
		  
	}
}