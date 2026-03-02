import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class ewry implements Predicate {
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
        long v = System.currentTimeMillis();
        gimx gimx0 = ((gimr)object0).e;
        if(gimx0 == null) {
            gimx0 = gimx.a;
        }
        return v - gimx0.g < hzay.a.o().g();
    }
}

