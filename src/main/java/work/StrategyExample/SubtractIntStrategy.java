package work.StrategyExample;

class SubtractIntStrategy implements Strategy<Integer> {
    @Override
    public Integer function(Integer x, Integer y) {
        return x - y;
    }
}
