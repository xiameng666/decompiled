import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class bcqr implements Predicate {
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
        if(((gmeh)object0).j.size() <= 0) {
            gmfd gmfd0 = ((gmeh)object0).f;
            if(gmfd0 == null) {
                gmfd0 = gmfd.a;
            }
            return bcqx.G(gmfd0);
        }
        return true;
    }
}

