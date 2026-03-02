import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class bpqj implements Predicate {
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
        gfsx gfsx0 = ((fqun)object0).i;
        if(!gfsx0.i()) {
            return true;
        }
        return ((fqun)object0).h.i() ? false : !fqso.c(((gszv)gfsx0.d()));
    }
}

