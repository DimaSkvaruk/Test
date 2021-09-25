package work.firstExample;

public class Util {


    public static <T extends Number> int function(T x, T y, Operation operation) {
        int result = 0;
        switch (operation) {
            case ADD:
                result = x.intValue() + y.intValue();
                break;
            case MULTIPLY:
                result = x.intValue() * y.intValue();
                break;
            case SUBTRACT:
                result = x.intValue() - y.intValue();
                break;
            case DIVIDE:
                if (y.intValue() == 0) {
                    throw new ArithmeticException("Argument 'divisor' is 0");
                }
                result = x.intValue() / y.intValue();
                break;

        }
        return result;
    }

    public static <T extends String> String function(T x, T y, Operation operation) {
        String result = null;
        switch (operation) {
            case ADD:
                result = x.concat(y);
                break;
            default:
                throw new StringException("Only concatenation allowed");
        }
        return result;
    }

}
