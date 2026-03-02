import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class cxxf implements Predicate {
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
        switch(((cwey)object0).P() - 1) {
            case 1: {
                return true;
            }
            case 2: {
                ((cwey)object0).Q(3, "Notification muted by user");
                return false;
            }
            case 3: {
                ((cwey)object0).Q(3, "Notification temporarily disabled");
                return false;
            }
            default: {
                cwfa.a.g().H("Unknown state=%d for item %s", ((cwey)object0).P() - 1, ((cwey)object0));
                ((cwey)object0).Q(3, "Notification temporarily disabled");
                return false;
            }
        }
    }
}

