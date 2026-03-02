import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class fbro implements Predicate {
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
        if(geoo.a(((hchi)object0).d) == 2) {
            hchh hchh0 = ((hchi)object0).g;
            if(hchh0 == null) {
                hchh0 = hchh.a;
            }
            return hchh0.b;
        }
        return false;
    }
}

