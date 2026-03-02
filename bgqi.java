import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class bgqi implements Predicate {
    public final bgqs a;
    public final gxog b;

    public bgqi(bgqs bgqs0, gxog gxog0) {
        this.a = bgqs0;
        this.b = gxog0;
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
        hguc hguc1 = this.b.c == null ? hguc.a : this.b.c;
        return !(hguc0.h == null ? hgtw.a : hguc0.h).b.equals((hguc1.h == null ? hgtw.a : hguc1.h).b) && !this.a.i(((gxog)object0));
    }
}

