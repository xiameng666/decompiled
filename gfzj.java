import j..util.function.BiFunction.-CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public final class gfzj implements BinaryOperator {
    public final BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0, Object object1) {
        Object object2 = (ggfk)object0;
        ((ggfk)object2).c(((ggfk)object1).a);
        return object2;
    }
}

