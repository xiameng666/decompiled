import j..util.function.Function.-CC;
import java.util.function.Function;

public final class wjk implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((cnrb)object0).b == 22 ? ((gvwd)((cnrb)object0).c) : gvwd.a;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

