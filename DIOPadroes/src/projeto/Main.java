package projeto;

public class Main {
	
	public static void main(String[]args) {
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		Singleton singleton3 = Singleton.getInstance();
		
		System.out.println(singleton1);
		System.out.println(singleton2);
		System.out.println(singleton3);
		
		Contexto contextAdd = new Contexto(new AddStrategy());
	    System.out.println("10 + 5 = " + contextAdd.executarStrategy(10, 5));

	    Contexto contextSubtract = new Contexto(new SubtractStrategy());
	    System.out.println("10 - 5 = " + contextSubtract.executarStrategy(10, 5));
	
	    
	    Facade facade = new Facade();
        facade.performOperation();

	}

}
