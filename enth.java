import j..util.function.Function.-CC;
import java.util.function.Function;

public final class enth implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Object object1 = ((enyw)object0).c;
        return object1 == null ? hguv.a : object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

