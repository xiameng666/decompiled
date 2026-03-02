import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eoia implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        gzgf gzgf0 = ((gzhd)object0).e;
        if(gzgf0 == null) {
            gzgf0 = gzgf.a;
        }
        return (long)gzgf0.d;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

