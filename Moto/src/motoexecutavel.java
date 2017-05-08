import java.util.Scanner;

public class motoexecutavel {

	public static void main(String[] args) {
		moto moto1 = new moto(1);
		
		Scanner leitor = new Scanner (System.in);
		
		moto1.imprimir();
		moto1.inicializamarchatot(6);
		System.out.println("Status: " + moto1.Status());
		moto1.shiftup();
		moto1.shiftup();
		moto1.shiftup();
		moto1.shiftup();
		System.out.println("=========");
		moto1.shiftdown();
		moto1.shiftdown();
		moto1.shiftdown();
		moto1.shiftdown();
		moto1.shiftdown();
		System.out.println("Status: " + moto1.Status());
		

	}

}
