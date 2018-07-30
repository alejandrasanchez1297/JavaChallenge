package FactoryWorld;

public class ConcreteFactoryY implements AbstractFactory{
	
	public ProductA createProductA() {
		ProductA productoA = new ProductAY();
		return productoA;
	}
	public ProductB createProductB() {
		ProductB productoB = new ProductBY();
		return productoB;
	}

}
