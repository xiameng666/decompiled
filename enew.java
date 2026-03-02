import j..util.function.Function.-CC;
import java.util.function.Function;

public final class enew implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        gzra gzra0 = ((gzrd)object0).g;
        if(gzra0 == null) {
            gzra0 = gzra.a;
        }
        hgvd hgvd0 = gzra0.b == 1 ? ((hgvd)gzra0.c) : hgvd.a;
        hguu hguu0 = hgvd0.e == null ? hguu.a : hgvd0.e;
        Long long0 = (long)(hguu0.c == null ? hgun.a : hguu0.c).c;
        gzra gzra1 = ((gzrd)object0).g;
        if(gzra1 == null) {
            gzra1 = gzra.a;
        }
        hgvd hgvd1 = gzra1.b == 1 ? ((hgvd)gzra1.c) : hgvd.a;
        hguu hguu1 = hgvd1.e == null ? hguu.a : hgvd1.e;
        return new gfsz(long0, ((long)(hguu1.c == null ? hgun.a : hguu1.c).d));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

