package work.secondExample;

class Util {

    public static <T extends Number> Integer function(T x, T y, Operation operation) {
        return operation.action(x, y);
    }

    public static  <T extends String> String function(T x, T y) {
        return x.concat(y);
    }
}
