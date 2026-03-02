import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class dvbj implements Predicate {
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
        gtxo gtxo0 = ((ftjg)object0).c;
        if(gtxo0 == null) {
            gtxo0 = gtxo.a;
        }
        return gtxo0.c != 5;
    }
}

