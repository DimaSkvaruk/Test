package work.firstExample;

public class Main {
    public static void main(String[] args) {

        System.out.println(Util.function(6, 4, Operation.ADD));
        System.out.println(Util.function(6, 4, Operation.SUBTRACT));
        System.out.println(Util.function(6, 4, Operation.MULTIPLY));
        System.out.println(Util.function(6, 4, Operation.DIVIDE));
        System.out.println(Util.function("6", "4", Operation.ADD));

    }
}


