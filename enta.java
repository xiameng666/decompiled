import j..util.function.Function.-CC;
import java.util.function.Function;

public final class enta implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((enyp)object0).c == 1 ? ((enys)((enyp)object0).d) : enys.a;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

