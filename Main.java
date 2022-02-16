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
		
		/*Scanner sc1 = new Scanner(System.in);
		
		double raio ;
		double pi = 3.14159 ;
		double resultado;
		
		raio = sc1.nextDouble();
		
		resultado = (pi*raio*raio) ;
		
		System.out.printf("Entrada:\n%.2f\nResultado:\n%.4f", raio, resultado);*/
		
		
		/*Scanner s = new Scanner(System.in);
		
		int A,B,C,D,R;
		
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		D = s.nextInt();
		
		R = (A*B)-(C*D);
		
		System.out.printf("Resultado:\n%d", R);*/
		
		/*Scanner s = new Scanner(System.in);
		
		int numero, horas;
	    double valorHora, salario;

	    numero = s.nextInt();
	    horas = s.nextInt();
	    valorHora = s.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = U$ %.2f%n", salario);
		
		s.close();*/
		
		
		/*Scanner s = new Scanner(System.in);
		
		int peca1, peca2, quantpeca1,quantpeca2;
		double valor, valorpeca1, valorpeca2;
		
		peca1 = s.nextInt();
		quantpeca1 = s.nextInt();
		valorpeca1 = s.nextDouble();
		
		peca2 = s.nextInt();
		quantpeca2 = s.nextInt();
		valorpeca2 = s.nextDouble();
		
		valor = (double)(quantpeca1 * valorpeca1)+(quantpeca2 * valorpeca2) ;
		
		System.out.printf("Total da compra:\n$ %.2f",valor);*/
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~If - Else
		
		
		/*Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
	    
		if (N % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}*/
		
		/*Scanner sc = new Scanner(System.in);
		
		int value = sc.nextInt();
		
		if(value < 3 ) {
			
			System.out.println("Num. Menor que 3.");
			
		}else {
			
			System.out.println("Num. Maior que 3.");
			
		}*/
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Switch
		
		/*Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			String dia;
			switch (x) {
			case 1:
				dia = "domingo";
			break;
			case 2:
				dia = "segunda";
				break;
			case 3:
				dia = "terca";
				break;
			case 4:
				dia = "quarta";
				break;
			case 5:
				dia = "quinta";
				break;
			case 6:
				dia = "sexta";
				break;
			case 7:
				dia = "sabado";
				break;
			default:
				dia = "valor invalido";
				break;
			}
			System.out.println("Dia da semana: " + dia);*/
		
		//~~~~~~~~~~~~~~~~~~~~~~~~Condicional Ternaria
		
		/*double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05 ;
		
		System.out.println(desconto);*/
		
		//~~~~~~~~~~~~~~~~~While
		
		/*Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		int i =0;
	
		while(Num != 0 ) {
		
			// i+= Num | Significa i = i +Num
			
			i += Num;
			Num = sc.nextInt();
		
		}
		
		System.out.println(i);
		
		sc.close();*/
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~For

		
		/*Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		
		for(int i =1; i < x; i++) {
			
			
			if(i % 2 != 0) {
			
				System.out.println(i);
				
			}
		
		}*/
		
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Do-While
		
		
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em C°");
		
		
		
		char resp;
		do {
			
			double cls = sc.nextInt();
			double F = cls * 1.8 +32;
			System.out.printf("Em Fahrenheit: %.1f\n" , F);
			System.out.print("Deseja calcular novamente?(s/n)");
			resp = sc.next().charAt(0);
			
		}while(resp != 'n');
		
		sc.close();
		*/

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Strings
		/*String original = "asadjibhda FASFbcYAS ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("Original : "+ original+"-");
		System.out.println("toLowerCase : "+s01+"-");
		System.out.println("toUpperCase : "+s02+"-");
		System.out.println("trim : "+s03+"-");
		System.out.println("substring : "+s04+"-");
		System.out.println("replace ('a' por 'x') : "+s06+"-");
		System.out.println("replace ('abc' por 'xy') : "+s07+"-");
		System.out.println("Index of 'bc') : "+i);
		System.out.println("Last Index of 'bc') : "+j);*/

		/*String s = "potato apple lemon orange";
		String[] vect = s.split(" ");
		
		System.out.println(vect [0]);
		System.out.println(vect [1]);
		System.out.println(vect [2]);
		System.out.println(vect [3]);*/


		
	}

	
	
}
