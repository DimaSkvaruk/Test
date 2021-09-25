package work.secondExample;

enum Operation {


    ADD {
        public <T extends Number> int action(T x, T y) {
            return x.intValue() + y.intValue();
        }
    },
    SUBTRACT {
        public <T extends Number> int action(T x, T y) {
            return x.intValue() - y.intValue();
        }
    }, MULTIPLY {
        public <T extends Number> int action(T x, T y) {
            return x.intValue() * y.intValue();
        }
    }, DIVIDE {
        public <T extends Number> int action(T x, T y) {
            return x.intValue() / y.intValue();
        }
    };

    public abstract <T extends Number> int action(T x, T y);

}
