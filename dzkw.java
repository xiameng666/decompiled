import j..util.function.Function.-CC;
import java.util.function.Function;

public final class dzkw implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((dyli)object0).b == 1 ? ((dykv)((dyli)object0).c) : dykv.a;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

