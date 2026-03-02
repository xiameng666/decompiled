import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class eofa implements Predicate {
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
        hjii hjii0 = ((emll)object0).d;
        if(hjii0 == null) {
            hjii0 = hjii.a;
        }
        hfwn hfwn0 = hjii0.c == null ? hfwn.a : hjii0.c;
        hjii hjii1 = ((emll)object0).d;
        if(hjii1 == null) {
            hjii1 = hjii.a;
        }
        return hfym.a(hfwn0, (hjii1.d == null ? hfwn.a : hjii1.d)) <= 0;
    }
}

