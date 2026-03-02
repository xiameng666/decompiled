import j..util.function.Predicate.-CC;
import java.util.List;
import java.util.function.Predicate;

public final class eolg implements Predicate {
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
        if(((List)object0) != null && ((List)object0).size() >= 2 && (((List)object0).get(0) instanceof Integer)) {
            Integer integer0 = (Integer)((List)object0).get(0);
            if(!(((List)object0).get(1) instanceof String)) {
                ((ggtj)eolk.a.j()).x("DNS value should be string type");
                return false;
            }
            return ((int)integer0) == 2;
        }
        ((ggtj)eolk.a.j()).x("Invalid an entry");
        return false;
    }
}

