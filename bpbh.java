import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class bpbh implements Predicate {
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
        int v = 2;
        switch(((gtbo)object0).c) {
            case 0: {
                return v == 3;
            }
            case 1: {
                v = 3;
                return v == 3;
            }
            case 2: {
                return false;
            }
            default: {
                return false;
            }
        }
    }
}

