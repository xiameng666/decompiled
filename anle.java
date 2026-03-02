import j..time.Instant;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class anle implements Predicate {
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
        hfwn hfwn0 = hfyg.b(Instant.now());
        hfwn hfwn1 = ((anmg)object0).e;
        if(hfwn1 == null) {
            hfwn1 = hfwn.a;
        }
        return hfyn.e(hfwn1, hfwn0).b >= hqdq.a.c().c();
    }
}

