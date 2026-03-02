import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class aqbp implements Predicate {
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
        aols aols0 = aols.b(((aolt)object0).g);
        if(aols0 == null) {
            aols0 = aols.p;
        }
        return aols0 != aols.n;
    }
}

