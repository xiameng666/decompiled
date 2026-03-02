import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class apem implements Predicate {
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
        hheg hheg0 = ((hhem)object0).b;
        if(hheg0 == null) {
            hheg0 = hheg.a;
        }
        if(hfhu.a(hheg0.c) == 98) {
            hheg hheg1 = ((hhem)object0).b;
            if(hheg1 == null) {
                hheg1 = hheg.a;
            }
            hhef hhef0 = hheg1.d == null ? hhef.a : hheg1.d;
            return ((hhef0.b == 4 ? ((hfhv)hhef0.c) : hfhv.a).b & 1) != 0;
        }
        return false;
    }
}

