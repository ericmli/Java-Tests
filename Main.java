import java.util.Scanner;

// %f = Num Quebrado
// %d = Num Inteiro
// %s = Texto

// Tipos de var

// Numeros inteiros
// byte = 8btis.
// short = 16btis.
// int = 32bits.
// long = 64bits.

// Com ponto
// float
// double
// char = unicode
// boleano = true,false

public class Main {

	public static void main(String[] args) {

		//System.out.println("Hello World Again.");

		/*
		 * int y = 32; System.out.println(y);
		 * 
		 * double x = 10.35784;
		 * 
		 * System.out.println(x);
		 * 
		 * // printf = formatado // "%.2f" = 2 casas decÃ­mais // \n = quebra de linha
		 * System.out.printf("%.2f\n", x); System.out.printf("%.4f\n", x);
		 * System.out.printf("RESULTADO = %.2f metros\n",x);
		 */

		/*
		 * String nome = "Maria"; int idade = 31; double renda = 4000.0;
		 * System.out.printf("%s tem %d anos e ganha R$%.2f", nome, idade, renda);
		 */

		// ~~~~~~~~~~~~~~~~~~~~

		/*
		 * String produto1 = "Computer"; String produto2 = "Office Desk";
		 * 
		 * int age = 30; int code = 5290; char gender = 'F';
		 * 
		 * double price1 = 2100.0; double price2 = 650.50; double measure = 53.234567;
		 * 
		 * System.out.
		 * printf("Products:\n%s, which price is $ %.2f\n%s, which price is %.2f\n\nRecord : %d years old, code %d and gender : %s\n\nMeasue with eight decimal places : %.8f\nRouded (three decimal places): %.3f\nUS decimal point: %.2f"
		 * , produto1, price1, produto2, price2, age, code, gender, measure, measure,
		 * measure);
		 */

		// ~~~~~~~~~~~~~~~~~~~~~~~ new Scanner(System.in)

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * String x; x = sc.next(); System.out.println("Você digitou: " +x);
		 * 
		 * sc.close();
		 */

		/*
		 * Scanner sc1 = new Scanner(System.in); int y; y = sc1.nextInt();
		 * System.out.println("Você digitou: " +y);
		 * 
		 * sc1.close();
		 */

		/*
		 * Scanner sc1 = new Scanner(System.in); double y; y = sc1.nextDouble();
		 * System.out.println("Você digitou: " +y);
		 * 
		 * sc1.close();
		 */

		/*Scanner sc1 = new Scanner(System.in);
		String x;
		int y;
		double z;
		x = sc1.next();
		y = sc1.nextInt();
		z = sc1.nextDouble();
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.println("Você digitou: " + z);
		sc1.close();*/
		
		/*Scanner sc = new Scanner(System.in);
		
		int x;
		String s1,s2,s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3= sc.nextLine();
		
		sc.close();
		
		
		System.out.printf("Dados Digitados: %d\n%s\n%s\n%s" , x, s1, s2, s3);*/
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Math
		
		/*Scanner s = new Scanner(System.in);
		
		int value;
		int value2;
		int soma;
		
		value = s.nextInt();
		value2 = s.nextInt();
		
		soma = value + value2;
		
		//System.out.printf("Entrada :\n" +value + "\n" + value2 + "\nSoma :\n" + soma);
		System.out.printf("Entrada:\n%d\n%d\nSoma:\n%d", value, value2, soma);*/
		
		Scanner sc1 = new Scanner(System.in);
		
		double raio ;
		double pi = 3.14159 ;
		double resultado;
		
		raio = sc1.nextDouble();
		
		resultado = (pi*raio*raio) ;
		
		System.out.printf("Entrada:\n%.2f\nResultado:\n%.4f", raio, resultado);
		
		

	}

}
