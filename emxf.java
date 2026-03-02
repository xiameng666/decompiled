import j..time.Instant;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class emxf implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hfwn hfwn0 = ((gzrd)object0).c;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        Instant instant0 = hfyg.d(hfwn0);
        hfwn hfwn1 = ((gzrd)object0).d;
        if(hfwn1 == null) {
            hfwn1 = hfwn.a;
        }
        return TimeRange.m(instant0, hfyg.d(hfwn1));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

