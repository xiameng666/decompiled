import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class bpbm implements Predicate {
    public final gfsx a;

    public bpbm(gfsx gfsx0) {
        this.a = gfsx0;
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
        return ((fqzb)object0).d.equals(this.a.d());
    }
}

