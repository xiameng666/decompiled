import android.location.Location;
import j..util.function.Predicate.-CC;
import java.util.ArrayList;
import java.util.function.Predicate;

public final class fxin implements Predicate {
    public final Location a;

    public fxin(Location location0) {
        this.a = location0;
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
        hfuo hfuo0 = ((hgub)object0).b;
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: hfuo0) {
            arrayList0.add(fxix.c(((hjij)object1)));
        }
        return new ghab(arrayList0).s(fxix.d(this.a));
    }
}

