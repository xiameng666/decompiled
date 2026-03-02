import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class dmud implements Predicate {
    public final dmue a;

    public dmud(dmue dmue0) {
        this.a = dmue0;
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
        if(hwfk.a.b().f() && ((dylc)object0).d.isEmpty()) {
            return false;
        }
        dmue dmue0 = this.a;
        dyna dyna0 = dyna.b(((dylc)object0).c);
        if(dyna0 == null) {
            dyna0 = dyna.k;
        }
        return ((Boolean)dmue0.a.b(dyna0, ((dylc)object0).d).map(new dmtw()).orElse(Boolean.valueOf(false))).booleanValue();
    }
}

