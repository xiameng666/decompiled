import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class ebif implements Predicate {
    public final ftdi a;

    public ebif(ftdi ftdi0) {
        this.a = ftdi0;
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
        String s = ((hkay)object0).b;
        return this.a.b == 2 ? s.equals(((ftba)this.a.c).c) : s.equals(ftba.a.c);
    }
}

