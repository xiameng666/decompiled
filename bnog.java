import j..util.function.Function.-CC;
import java.util.function.Function;

public final class bnog implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        fquv fquv0 = new fquv(null);
        gsyz gsyz0 = ((gszo)object0).c;
        if(gsyz0 == null) {
            gsyz0 = gsyz.a;
        }
        fquv0.c(gsyz0);
        fquv0.d(gfsx.m(((gszo)object0).i));
        gtaa gtaa0 = ((gszo)object0).d;
        if(gtaa0 == null) {
            gtaa0 = gtaa.a;
        }
        fquv0.b = gfsx.m((gszv.b(gtaa0.g) == null ? gszv.h : gszv.b(gtaa0.g)));
        fquv0.c = gfsx.m((((gszo)object0).e.size() <= 0 ? ggna.a : gged_interceptors.i(((gszo)object0).e)));
        return fquv0.a();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

