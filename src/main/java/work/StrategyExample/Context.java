package work.StrategyExample;

class Context<T> {
    private Strategy<T> strategy;

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    T doFunction(T x, T y) {
        return strategy.function(x, y);
    }
}
