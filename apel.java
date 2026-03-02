import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class apel implements Predicate {
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
        hheh hheh0 = ((hhee)object0).c;
        if(hheh0 == null) {
            hheh0 = hheh.a;
        }
        return hheh0.c == 1 && ((Boolean)hheh0.d).booleanValue();
    }
}

