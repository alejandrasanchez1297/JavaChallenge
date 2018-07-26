package FactoryWorld;

public class Client {
	
	
	public Client() {
		
		AbstractFactory xfact = new ConcreteFactoryX();
		AbstractFactory yfact = new ConcreteFactoryY();
		
		ProductA prodAX = xfact.createProductA();
		ProductB prodBX = yfact.createProductB();
		
		ProductA prodAY = xfact.createProductA();
		ProductB prodBY = yfact.createProductB();
		
	}

}
