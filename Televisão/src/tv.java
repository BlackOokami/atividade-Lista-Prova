
public class tv {

	public static void main(String[] args) {
		televisão TV = new televisão(1);
		
		
		
		TV.inicializacanaltot(6);	
		System.out.println("Status: " + TV.ligado());
		TV.canalup();
		TV.canalup();
		TV.canalup();
		TV.volumeup();
		TV.volumeup();
		TV.volumeup();
		TV.imprimir();
		TV.inicializacanaltot(6);
		System.out.println("==================");
		TV.canaldown();
		TV.canaldown();
		TV.canaldown();
		TV.canaldown();
		TV.volumedown();
		TV.volumedown();
		TV.volumedown();
		System.out.println("Status: " + TV.ligado());
		
		TV.imprimir();
		
		
	}	

}
