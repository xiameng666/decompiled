import j..util.Collection.-EL;
import j..util.Objects;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class enly implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        gftb.b(enmv.i(((gzrd)object0)) || enmv.h(((gzrd)object0)), enmk.f);
        if(enmv.i(((gzrd)object0))) {
            gzra gzra0 = ((gzrd)object0).g;
            if(gzra0 == null) {
                gzra0 = gzra.a;
            }
            hgvd hgvd0 = gzra0.b == 1 ? ((hgvd)gzra0.c) : hgvd.a;
            ggdy ggdy0 = new ggdy();
            hguu hguu0 = hgvd0.e == null ? hguu.a : hgvd0.e;
            ggdy0.i(Long.valueOf((hguu0.c == null ? hgun.a : hguu0.c).c));
            hfta hfta0 = gzox.c;
            hgvd0.f(hfta0);
            hftu hftu0 = hfta0.d;
            if(hgvd0.s.m(hftu0)) {
                hgvd0.f(hfta0);
                Object object1 = hgvd0.s.k(hftu0);
                ggdy0.k(((Iterable)Collection.-EL.stream(((gzox)(object1 == null ? hfta0.b : hfta0.d(object1))).b).map(new enmi()).collect(ggaf.a)));
            }
            enmp enmp0 = new enmp(ggdy0.h());
            Objects.requireNonNull(enmp0);
            return new enml(new enjw(enmp0), enmv.a(((gzrd)object0)));
        }
        gzra gzra1 = ((gzrd)object0).g;
        if(gzra1 == null) {
            gzra1 = gzra.a;
        }
        hgum hgum0 = gzra1.b == 2 ? ((hgum)gzra1.c) : hgum.a;
        ggdy ggdy1 = new ggdy();
        ggdy1.i(Integer.valueOf((hgum0.g == null ? hgul.a : hgum0.g).c));
        hfta hfta1 = gzot.c;
        hgum0.f(hfta1);
        hftu hftu1 = hfta1.d;
        if(hgum0.s.m(hftu1)) {
            hgum0.f(hfta1);
            Object object2 = hgum0.s.k(hftu1);
            ggdy1.k(((Iterable)Collection.-EL.stream(((gzot)(object2 == null ? hfta1.b : hfta1.d(object2))).b).map(new enmh()).collect(ggaf.a)));
        }
        enmo enmo0 = new enmo(ggdy1.h());
        Objects.requireNonNull(enmo0);
        return new enml(new enjv(enmo0), enmv.a(((gzrd)object0)));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

