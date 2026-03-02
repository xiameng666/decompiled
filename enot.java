import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class enot implements Predicate {
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
        emlc emlc0 = ((emld)object0).c;
        if(emlc0 == null) {
            emlc0 = emlc.a;
        }
        return emlc0.b != 2;
    }
}

