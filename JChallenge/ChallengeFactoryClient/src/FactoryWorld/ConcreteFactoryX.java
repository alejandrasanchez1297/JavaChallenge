package FactoryWorld;

public class ConcreteFactoryX implements AbstractFactory{
	
	public ProductA createProductA() {
		ProductA productoA = new ProductAX();
		return productoA;
	}
	public ProductB createProductB() {
		ProductB productoB = new ProductBX();
		return productoB;
	}
}
