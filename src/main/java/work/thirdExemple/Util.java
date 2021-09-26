package work.thirdExemple;

class Util {


    public static <T extends Number> T function(T x, T y, Operation operation) {
        if (x == null | y == null) {
            throw new IllegalArgumentException("empty parameters not allowed");
        }
        Integer result = 0;
        switch (operation) {
            case ADD:
                result = Integer.valueOf(x.intValue() + y.intValue());
                break;
            case SUBTRACT:
                result = Integer.valueOf(x.intValue() - y.intValue());
                break;
            case MULTIPLY:
                result = Integer.valueOf(x.intValue() * y.intValue());
                break;
            case DIVIDE:
                if (y.intValue() == 0) {
                    throw new ArithmeticException("divide by zero not allowed");
                }
                result = Integer.valueOf(x.intValue() / y.intValue());
        }

        return (T) result;
    }

    public static <T extends String> T function(T x, T y, Operation operation) {
        String result ;
        if (x == null | y == null) {
            throw new IllegalArgumentException("empty parameters not allowed");
        }
        switch (operation) {
            case ADD:
                result = x.concat(y);
                break;
            default:
                throw new RuntimeException("Only concatenation allowed");

        }
        return (T) result;
    }
}


