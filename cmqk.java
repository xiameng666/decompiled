import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class cmqk implements Predicate {
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
        gwry gwry0 = ((gxla)object0).c;
        if(gwry0 == null) {
            gwry0 = gwry.a;
        }
        return (gwry0.b & 0x2000000) != 0 && (((gxla)object0).b & 2) != 0;
    }
}

