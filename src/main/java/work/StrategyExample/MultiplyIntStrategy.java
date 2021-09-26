package work.StrategyExample;

class MultiplyIntStrategy implements Strategy<Integer> {
    @Override
    public Integer function(Integer x, Integer y) {
        return x * y;
    }
}
