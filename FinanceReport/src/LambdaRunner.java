//import java.util.function.Function;

public class LambdaRunner {
    //static <P> void processor(Consumer<P> f, P h) {
       // f.execute(h);
   // }
    static <P, R> R function(Function<P, R> f, P h) {
        return f.execute(h);
    }
    static Boolean threeHumansAndIntToBool(ThreeHumansAndIntPredicate f, Human h1, Human h2, Human h3, Integer i) {
        return f.execute(h1, h2, h3, i);
    }
    static Boolean twoHumansToBool(TwoHumansPredicate f, Human h1, Human h2) {
        return f.execute(h1, h2);
    }
}