import java.util.Scanner;

public class ssasas {
	public static void main(String[] args ) {
	
	
	}
	
		public static int suma(int operando1,int operando2) {
			int total = 0;
			total = operando1 + operando2;
			return total;
		}
		
		public static int resta(int operando1,int operando2) {
			int total = 0;
			total = operando1 - operando2;
			return total;
		}
		public static int DIV(int operando1,int operando2) {
			int total = 0;
			total = operando1 / operando2;
			return total;
	}
		public static int MULTI(int operando1,int operando2) {
			int total = 0;
			total = operando1 * operando2;
			return total;
}
		public static int elev(int operando1,int operando2) {
			Scanner tec= new Scanner(System.in);
			int n, base;
			System.out.println("Ingrese la base: ");
			base = tec.nextInt();
			System.out.println("Ingrese el exponente");
			n = tec.nextInt();
			int resultado = (int) Math.pow(base, n);
			System.out.println(base + " elevado a la " + n + " es igual a " + resultado);
			return operando2;
			
		}
}