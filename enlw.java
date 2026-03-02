import j..util.Objects;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class enlw implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        gftb.b(enmv.i(((gzrd)object0)) || enmv.h(((gzrd)object0)), enmk.e);
        if(enmv.i(((gzrd)object0))) {
            gzra gzra0 = ((gzrd)object0).g;
            if(gzra0 == null) {
                gzra0 = gzra.a;
            }
            hgvd hgvd0 = gzra0.b == 1 ? ((hgvd)gzra0.c) : hgvd.a;
            hguu hguu0 = hgvd0.e == null ? hguu.a : hgvd0.e;
            enmn enmn0 = new enmn((hguu0.c == null ? hgun.a : hguu0.c).c);
            Objects.requireNonNull(enmn0);
            return new enml(new enju(enmn0), enmv.a(((gzrd)object0)));
        }
        gzra gzra1 = ((gzrd)object0).g;
        if(gzra1 == null) {
            gzra1 = gzra.a;
        }
        hgum hgum0 = gzra1.b == 2 ? ((hgum)gzra1.c) : hgum.a;
        enmm enmm0 = new enmm((hgum0.g == null ? hgul.a : hgum0.g).c);
        Objects.requireNonNull(enmm0);
        return new enml(new enjt(enmm0), enmv.a(((gzrd)object0)));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

