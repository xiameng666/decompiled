import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class dnug implements Predicate {
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
        boolean z;
        if((((dxev)object0).b & 1) != 0) {
            hkhr hkhr0 = ((dxev)object0).c;
            if(hkhr0 == null) {
                hkhr0 = hkhr.b;
            }
            if(((hkhr0.d == null ? hjwt.a : hkhr0.d).b & 2) != 0) {
                z = false;
            }
            else if((hkhm.b(hkhr0.f) == null ? hkhm.k : hkhm.b(hkhr0.f)) == hkhm.c) {
                hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
                hjwx hjwx0 = hjwt0.e == null ? hjwx.a : hjwt0.e;
                z = (hjww.b(hjwx0.b) == null ? hjww.l : hjww.b(hjwx0.b)) == hjww.k;
            }
            else {
                z = false;
            }
            Boolean.valueOf(z).getClass();
            return z;
        }
        return false;
    }
}

