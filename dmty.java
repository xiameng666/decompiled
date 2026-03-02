import j..util.function.Function.-CC;
import java.util.function.Function;

public final class dmty implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Object object1 = ((dxes)object0).c;
        return object1 == null ? hkhr.b : object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

