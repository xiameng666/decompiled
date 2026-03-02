import j..util.function.BiFunction.-CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public final class gfzm implements BinaryOperator {
    public final BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0, Object object1) {
        Object object2 = (ggdy)object0;
        ggdy ggdy0 = (ggdy)object1;
        ((ggdq)object2).a(ggdy0.a, ggdy0.b);
        return object2;
    }
}

