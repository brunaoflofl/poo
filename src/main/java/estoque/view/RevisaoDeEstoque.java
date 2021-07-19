package estoque.view;

import java.util.Locale;
import java.util.Scanner;

import estoque.entity.Product;

public class RevisaoDeEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product pr = new Product();
		System.out.println("Calculando medidas de um retangulo: ");
		System.out.print("Altura do retangulo:");
		pr.height = sc.nextDouble();
		System.out.print("Largura do retangulo:");
		pr.width = sc.nextDouble();
		
		System.out.println("A área é : " + pr.calculaArea());
		System.out.println("O perimetro é:  " + pr.calculaPerimetro());
		System.out.println("A diagonal é: " + pr.calculaDiagonal());



		
		
	}

}
