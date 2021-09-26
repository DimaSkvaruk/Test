package work.StrategyExample;

class ConcatStringsStrategy implements Strategy<String> {
    @Override
    public String function(String x, String y) {
        return x.concat(y);
    }
}
