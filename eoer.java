import j..time.Instant;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eoer implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hjii hjii0 = ((emll)object0).d;
        if(hjii0 == null) {
            hjii0 = hjii.a;
        }
        Instant instant0 = hfyg.d((hjii0.c == null ? hfwn.a : hjii0.c));
        hjii hjii1 = ((emll)object0).d;
        if(hjii1 == null) {
            hjii1 = hjii.a;
        }
        return TimeRange.h(instant0, hfyg.d((hjii1.d == null ? hfwn.a : hjii1.d)));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

