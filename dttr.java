import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class dttr implements Predicate {
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
        gtxb gtxb0 = gtxb.b(dual.b(((gtxg)object0)).c);
        if(gtxb0 == null) {
            gtxb0 = gtxb.n;
        }
        return gtxb0.equals(gtxb.f);
    }
}

