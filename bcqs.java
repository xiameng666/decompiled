import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class bcqs implements Predicate {
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
        gmfh gmfh0 = ((gmfk)object0).c;
        if(gmfh0 == null) {
            gmfh0 = gmfh.a;
        }
        if(!bcqx.H(gmfh0)) {
            int v = ((gmfk)object0).b;
            return (v & 16) == 0 ? (v & 0x20) != 0 : true;
        }
        return true;
    }
}

