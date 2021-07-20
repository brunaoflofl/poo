package aluno.entity;

public class Aluno {
	 public String nome;
	 public Double nota1;
	 public Double nota2;
	 public Double nota3;
	

public Double media() {
	Double media = (this.nota1 + this.nota2 + this.nota3);
	return media;
}
public Boolean isAlunoAprovado(Double media) {
	if(media>=60) {
		return true;
	}
	return false;
	
	}
public Double pontosFaltando(Double media) {
	Double pontos = 60 - media;
	return pontos;
}
}
