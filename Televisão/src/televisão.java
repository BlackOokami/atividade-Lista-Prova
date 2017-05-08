import java.util.Scanner;

public class televisão {
	boolean ligado;
	int canal;
	int canaltot;
	int volume = 15;
	int volumetot = 30;
	String on;

	
	televisão(){
		
	}
	Scanner leitor = new Scanner(System.in);
	
	void imprimir(){
	   System.out.println("canal atual: " + canal); 
	   System.out.println("volume atual: " + volume);
	
	}
	
		
	televisão(int canalmax) {
		canal = canalmax;
		
	}

	void inicializarcanal(int canalin) {
		canal = canalin;
		
	}

	void inicializacanaltot(int canalin){
		canaltot = canalin;
		
	}
	
	
	int canalup() {
		if (canal < canaltot) {
			canal++;
		System.out.println("Canal: " + canal);
		
		}else{
			System.out.println("Limite atingido");
			
		}
		return canal;
		
	}
	 
	int canaldown() {
		if (canal >= 0){
			canal --;
			System.out.println("canal: " + canal);			
		
		}else{
			System.out.println("Limite de canal");
		
		}
	    return canal;
		
		
		}
	int volumeup() {
		if (volume < volumetot) {
			volume++;
		System.out.println("Volume: " + volume);
		
		}else{
			System.out.println("Limite atingido");
			
		}
		return volume;
		
	}
	 
	int volumedown() {
		if (volume >= 0){
			volume --;
			System.out.println("Volume: " + volume);			
		
		}else{
			System.out.println("Volume minimo");
		
		}
	    return volume;
	}
		

	String ligado() {
		if(canal > 0) {
			ligado = true;
			on = "Ligada";
		}else{
			ligado = false;
			on = "Desligada";
		}
		return on;
	}




	
		
	
	
	
	
	
	
	
	
}
