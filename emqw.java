import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class emqw implements Predicate {
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
        gzqw gzqw0 = gzqw.b(((gzrd)object0).k);
        if(gzqw0 == null) {
            gzqw0 = gzqw.a;
        }
        return !gzqw0.equals(gzqw.a);
    }
}

