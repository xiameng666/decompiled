import j..util.function.Function.-CC;
import java.util.Locale;
import java.util.function.Function;

public final class fckd implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return hzyp.f() ? String.format(Locale.US, "%s:%d", ((aqfl)object0).e, ((long)((aqfl)object0).d)) : ((aqfl)object0).e;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

