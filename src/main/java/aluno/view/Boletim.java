package aluno.view;

import java.util.Locale;
import java.util.Scanner;

import aluno.entity.Aluno;

public class Boletim {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.print("Insira o nome do aluno: ");
		aluno.nome = sc.next();
		System.out.print("Nota do primeiro trimestre::");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Nota do segundo trimestre::");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Nota do terceiro trimestre::");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE : " +  aluno.media());
		if(aluno.media() >= 60) {
			System.out.println("PASS ");
		} else {
			System.out.println("FAILED ");
			Double media = aluno.media();
			System.out.println("MISSING " + aluno.pontosFaltando(media) + "POINTS");
		}
		





		
		
	}

}
