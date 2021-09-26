package work.StrategyExample;

interface Strategy<T> {
    T function(T x, T y);
}
