import j..util.function.Function.-CC;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public final class eziw implements UnaryOperator {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return (int)(((int)(((Integer)object0))) + 1);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

