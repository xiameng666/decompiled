import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class akee implements Predicate {
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
        grey grey0 = ((grff)object0).g;
        if(grey0 == null) {
            grey0 = grey.a;
        }
        return grey0.b == 2;
    }
}

