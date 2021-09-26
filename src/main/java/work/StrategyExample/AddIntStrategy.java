package work.StrategyExample;

class AddIntStrategy implements Strategy<Integer> {

    @Override
    public Integer function(Integer x, Integer y) {
        return x + y;
    }
}
