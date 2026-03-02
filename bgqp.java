import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class bgqp implements Predicate {
    public final bgqs a;

    public bgqp(bgqs bgqs0) {
        this.a = bgqs0;
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
        return !((gxog)object0).e && !this.a.i(((gxog)object0));
    }
}

