package work.StrategyExample;

class Handler<T extends Comparable> {

    private Context<T> context = new Context<>();

    T function(T x, T y, Operations operations) {
        switch (operations) {
            case ADD:
                if (x instanceof String | y instanceof String) {
                    context.setStrategy(new ConcatStringsStrategy());
                } else {
                    context.setStrategy(new AddIntStrategy());
                }
                break;
            case SUBTRACT:
                context.setStrategy(new SubtractIntStrategy());
                break;
            case DIVIDE:
                context.setStrategy(new DivideIntStrategy());
                break;
            case MULTIPLY:
                context.setStrategy(new MultiplyIntStrategy());
        }
        return context.doFunction(x, y);
    }

}
