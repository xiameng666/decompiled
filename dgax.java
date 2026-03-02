import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class dgax implements Predicate {
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
        heax heax0 = ((dbwx)object0).k;
        if(heax0 == null) {
            heax0 = heax.a;
        }
        if(heax0.c - 1800000L <= v) {
            heax heax1 = ((dbwx)object0).k;
            if(heax1 == null) {
                heax1 = heax.a;
            }
            return v < heax1.d + 1800000L;
        }
        return false;
    }
}

