import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class enlv implements Predicate {
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
        int v = ((gzrd)object0).b;
        if((v & 1) != 0 && (v & 2) != 0) {
            hfwn hfwn0 = ((gzrd)object0).c;
            if(hfwn0 == null) {
                hfwn0 = hfwn.a;
            }
            hfwn hfwn1 = ((gzrd)object0).d;
            if(hfwn1 == null) {
                hfwn1 = hfwn.a;
            }
            return hfym.a(hfwn0, hfwn1) < 0;
        }
        return false;
    }
}

