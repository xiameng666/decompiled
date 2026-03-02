import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class ekcp implements Predicate {
    public final ekcv a;

    public ekcp(ekcv ekcv0) {
        this.a = ekcv0;
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
        return (((gdnd)object0).b & 4) != 0 && ((gdnd)object0).e.equals("com.google") && (((gdnd)object0).b & 8) != 0 && this.a.d.a(((gdnd)object0).f);
    }
}

