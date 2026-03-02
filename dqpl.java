import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class dqpl implements Predicate {
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
        if(dqjj.T(((gtkg)object0))) {
            gtqj gtqj0 = gtqj.b(((gtkg)object0).g);
            if(gtqj0 == null) {
                gtqj0 = gtqj.i;
            }
            return !gtqj0.equals(gtqj.b);
        }
        return false;
    }
}

