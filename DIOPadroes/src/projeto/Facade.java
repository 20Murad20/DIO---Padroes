package projeto;

class Subsistema1 {
    public void operation1() {
        System.out.println("Subsystem1: Operation1");
    }
}

class Subsistema2 {
    public void operation2() {
        System.out.println("Subsystem2: Operation2");
    }
}

class Subsistema3 {
    public void operation3() {
        System.out.println("Subsystem3: Operation3");
    }
}

// Facade
class Facade {
    private Subsistema1 subsistema1;
    private Subsistema2 subsistema2;
    private Subsistema3 subsistema3;

    public Facade() {
        this.subsistema1 = new Subsistema1();
        this.subsistema2 = new Subsistema2();
        this.subsistema3 = new Subsistema3();
    }

    public void performOperation() {
        subsistema1.operation1();
        subsistema2.operation2();
        subsistema3.operation3();
    }
}