import java.util.Scanner;

public class programHipotenüs {

	public static void main(String[] args) {
		// Dik Üçgende Hipotenüs Bulan Program
		int a ,b;
		
		double c ;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Lütfen 1'inci  kenarı giriniz ? ");
		a=scan.nextInt();
		System.out.println("Lütfen 2'nci değeri giriniz ? ");
		b=scan.nextInt();
		
		c = Math.sqrt((a*a) + (b*b));
		
		System.out.println("hipotenüs : " + c);
	}

}
