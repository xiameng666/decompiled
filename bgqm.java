import j..time.Instant;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class bgqm implements Predicate {
    public final bgqs a;

    public bgqm(bgqs bgqs0) {
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
        hfwn hfwn0 = ((gxoi)object0).f;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        return hfyg.d(hfwn0).plus(bgqs.a).isAfter(Instant.ofEpochMilli(this.a.b.a()));
    }
}

