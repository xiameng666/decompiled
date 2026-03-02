import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class fcpd implements Predicate {
    public final fcpu a;

    public fcpd(fcpu fcpu0) {
        this.a = fcpu0;
    }

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
        return ((aqfl)object0).c == this.a.d.c && (((aqfl)object0).b & 0x200) != 0;
    }
}

