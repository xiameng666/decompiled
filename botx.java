import j..time.Instant;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class botx implements Predicate {
    public final Instant a;

    public botx(Instant instant0) {
        this.a = instant0;
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
        hfwn hfwn0 = ((fqzb)object0).c;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        return hfyg.d(hfwn0).isAfter(this.a);
    }
}

