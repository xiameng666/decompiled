import j..util.function.Function.-CC;
import java.util.Arrays;
import java.util.function.Function;

public final class eljc implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return Arrays.copyOf(((byte[])object0), ((int)hxuv.a.e().c()));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

