import j..util.function.Function.-CC;
import java.util.function.Function;

public final class dmtw implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return Boolean.valueOf(dyln.b(((dylm)object0).d) == 4);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

