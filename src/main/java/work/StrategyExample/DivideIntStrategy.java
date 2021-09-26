package work.StrategyExample;

class DivideIntStrategy implements Strategy<Integer> {
    @Override
    public Integer function(Integer x, Integer y) {
        return x / y;
    }
}
