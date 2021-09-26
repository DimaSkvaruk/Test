
package work.StrategyExample;

import static work.StrategyExample.Operations.*;

public class Main {
    public static void main(String[] args) {


        Handler<Comparable> handler = new Handler<>();
        System.out.println(handler.function(6, 4, ADD));
        System.out.println(handler.function(6, 4, SUBTRACT));
        System.out.println(handler.function(6, 4, MULTIPLY));
        System.out.println(handler.function(6, 4, DIVIDE));
        System.out.println(handler.function("6", "4", ADD));
    }

}


