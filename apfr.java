import j..util.function.Function.-CC;
import java.util.function.Function;

public final class apfr implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Object object1 = ((apdm)object0).e;
        return object1 == null ? hfwn.a : object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

