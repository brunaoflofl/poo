package salario.entity;

public class Funcionario {
	public String name;
	public Double salary;
	public Double taxa;
	
	public Double netSalary() {
		return this.salary - this.taxa;
		
	}

	public Double almentarSalary(Double porcentagem) {
		return this.salary + (porcentagem/100 * this.salary) - this.taxa;
		
		
		
	}

}
