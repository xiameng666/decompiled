import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class fcol implements Predicate {
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
        if(aqfk.a(((aqfl)object0).h) != 2) {
            aqej aqej0 = ((aqfl)object0).g;
            if(aqej0 == null) {
                aqej0 = aqej.a;
            }
            return (aqej0.b & 16) == 0 || (aqej0.b & 1) == 0 || ((aqej0.c == null ? aqek.a : aqej0.c).b & 4) == 0 ? true : aqej0.f < (aqej0.c == null ? aqek.a : aqej0.c).e;
        }
        return true;
    }
}

