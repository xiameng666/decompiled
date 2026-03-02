import j..util.function.Predicate.-CC;
import java.util.AbstractMap.SimpleEntry;
import java.util.function.Predicate;

public final class apbg implements Predicate {
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
        return !((String)((AbstractMap.SimpleEntry)object0).getKey()).isEmpty() && ((int)(((Integer)((AbstractMap.SimpleEntry)object0).getValue()))) >= 0;
    }
}

