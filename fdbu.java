import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class fdbu implements Predicate {
    public final boolean a;

    public fdbu(boolean z) {
        this.a = z;
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
        return !this.a || !((fdyo)object0).f;
    }
}

