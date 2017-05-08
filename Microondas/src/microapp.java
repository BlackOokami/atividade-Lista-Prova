
public class microapp {

	public static void main(String[] args) {
		
		micro m = new micro();
		
		System.out.println("Digite 1 para fechar porta"
				+ " e 2 para abrir");
		m.imprimir();
		System.out.println("Status: " + m.ligado());
		
	}

}
