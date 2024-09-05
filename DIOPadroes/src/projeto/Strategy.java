package projeto;

interface Strategy {
    int executar(int a, int b);
}

class AddStrategy implements Strategy {
    public int executar(int a, int b) {
        return a + b;
    }
}

class SubtractStrategy implements Strategy {
    public int executar(int a, int b) {
        return a - b;
    }
}

class Contexto {
    private Strategy strategy;

    public Contexto(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public int executarStrategy(int a, int b) {
        return strategy.executar(a, b);
    }
    
}