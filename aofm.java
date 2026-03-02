import j..util.Objects;
import j..util.function.BiFunction.-CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public final class aofm implements BinaryOperator {
    public final BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0, Object object1) {
        Integer integer0 = (int)0;
        return (int)(((int)(((Integer)Objects.requireNonNullElse(((Integer)object0), integer0)))) + ((int)(((Integer)Objects.requireNonNullElse(((Integer)object1), integer0)))));
    }
}

