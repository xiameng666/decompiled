import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class bpjr implements Predicate {
    public final long a;

    public bpjr(long v) {
        this.a = v;
    }

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
        return !((bpkj)object0).f.i() && bpkl.k(((bpkj)object0).d, this.a);
    }
}

