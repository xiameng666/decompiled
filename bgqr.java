import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class bgqr implements Predicate {
    public final String a;

    public bgqr(String s) {
        this.a = s;
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
        hguc hguc0 = ((gxog)object0).c;
        if(hguc0 == null) {
            hguc0 = hguc.a;
        }
        return this.a.equals((hguc0.h == null ? hgtw.a : hguc0.h).b);
    }
}

