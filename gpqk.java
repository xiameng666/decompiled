import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class gpqk implements Predicate {
    public final gprj a;

    public gpqk(gprj gprj0) {
        this.a = gprj0;
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
        return (((gprm)object0) instanceof gprj) && gpqj.b(((gprm)object0).c, this.a.c);
    }
}

