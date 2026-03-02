import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class apfq implements Predicate {
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
        if((((apdm)object0).b & 1) != 0) {
            hfwn hfwn0 = ((apdm)object0).e;
            if(hfwn0 == null) {
                hfwn0 = hfwn.a;
            }
            return !((ProtoLiteMessage)hfwn0).equals(hfyn.c);
        }
        return false;
    }
}

