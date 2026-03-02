import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class esxk implements Predicate {
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
        if((((espz)object0) instanceof esqa)) {
            switch(((esqa)(((espz)object0))).a.I) {
                case 3: {
                    return true;
                }
                case 4: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }
}

