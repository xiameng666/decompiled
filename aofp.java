import j..util.function.Predicate.-CC;
import java.util.Map.Entry;
import java.util.function.Predicate;

public final class aofp implements Predicate {
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
        if(((String)((Map.Entry)object0).getKey()).matches("[^a-zA-Z]*")) {
            Integer integer0 = ((String)((Map.Entry)object0).getKey()).length();
            return TimeRange.g(Integer.valueOf(9), Integer.valueOf(12)).s(integer0);
        }
        return false;
    }
}

