import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class amzt implements Predicate {
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
        if(((amwz)object0).i(ando.E)) {
            switch(((amwz)object0).d.ordinal()) {
                case 4: 
                case 7: 
                case 8: {
                    break;
                }
                default: {
                    return true;
                }
            }
        }
        return false;
    }
}

