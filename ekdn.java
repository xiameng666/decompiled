import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class ekdn implements Predicate {
    public final ekdq a;

    public ekdn(ekdq ekdq0) {
        this.a = ekdq0;
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
        return this.a.a.equals(((gdnd)object0).f) && ((gdnd)object0).e.equals("com.google");
    }
}

