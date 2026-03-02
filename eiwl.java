import j..time.Duration;
import j..time.Instant;
import j..util.function.Predicate.-CC;
import java.util.Map.Entry;
import java.util.function.Predicate;

public final class eiwl implements Predicate {
    public final Duration a;
    public final Instant b;

    public eiwl(Duration duration0, Instant instant0) {
        this.a = duration0;
        this.b = instant0;
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
        return ((Instant)((Map.Entry)object0).getValue()).plus(this.a).isAfter(this.b);
    }
}

