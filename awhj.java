import j..util.function.Function.-CC;
import java.util.function.Function;

public final class awhj implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        gabi gabi0 = (gabi)object0;
        long v = (long)gabi0.c().size();
        return (long)(gabi0.d / v);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

