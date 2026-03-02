import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class enev implements Predicate {
    @Override
    public final Predicate and(Predicate predicate0) {
        return Predicate.-CC.$default$and(this, predicate0);
    }

    @Override
    public final Predicate negate() {
        return Predicate.-CC.$default$negate(this);
    }

    @Override
    public final Predicate or(Predicate predicate0) {
        return Predicate.-CC.$default$or(this, predicate0);
    }

    @Override
    public final boolean test(Object object0) {
        gzra gzra0 = ((gzrd)object0).g;
        if(gzra0 == null) {
            gzra0 = gzra.a;
        }
        if(((gzra0.b == 1 ? ((hgvd)gzra0.c) : hgvd.a).b & 4) != 0) {
            gzra gzra1 = ((gzrd)object0).g;
            if(gzra1 == null) {
                gzra1 = gzra.a;
            }
            hgvd hgvd0 = gzra1.b == 1 ? ((hgvd)gzra1.c) : hgvd.a;
            return ((hgvd0.e == null ? hguu.a : hgvd0.e).b & 1) != 0;
        }
        return false;
    }
}

