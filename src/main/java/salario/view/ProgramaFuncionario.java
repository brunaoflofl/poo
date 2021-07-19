package salario.view;

import java.util.Locale;
import java.util.Scanner;

import estoque.entity.Product;
import salario.entity.Funcionario;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double porcentagem;

		
		Funcionario fn = new Funcionario();
		System.out.println("Calculando o salario de um funcionario: ");
		System.out.print("Insira o nome do funcionário:");
		fn.name = sc.next();
		System.out.print("Insira o salário Bruto:");
		fn.salary = sc.nextDouble();
		System.out.print("Insira o importo:");
		fn.taxa = sc.nextDouble();
		
		System.out.println("Nome: " + fn.name);
		System.out.println("Salário: " + fn.salary);
		System.out.println("Taxa: " + fn.taxa);
		
		System.out.println("Empregado: " + fn.name + "," + fn.netSalary());
		System.out.println("Insira a porcentagem para almento de salário:");
		porcentagem = sc.nextDouble();
		
		System.out.println(" Salário atualizado:");
		System.out.println("Empregado: " + fn.name + "," + fn.almentarSalary(porcentagem));

		

		
		

		



	}

}
