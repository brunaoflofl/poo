package estoque.entity;

public class Product {
	public Double width;
	public Double height;
	
	public Double calculaArea() {
		return this.height * this.width;
	}
	public Double calculaPerimetro() {
		return 2*(this.height + this.width);
	}
	public Double calculaDiagonal() {
		Double d;
		d = Math.sqrt(this.height) + Math.sqrt(this.width);
		return Math.sqrt(d);
	}
}
