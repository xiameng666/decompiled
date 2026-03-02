import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class dmub implements Predicate {
    public final hkhr a;

    public dmub(hkhr hkhr0) {
        this.a = hkhr0;
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
        hkhr hkhr0 = this.a;
        if((((dxev)object0).b & 8) != 0 || ((hkhr0.d == null ? hjwt.a : hkhr0.d).b & 4) != 0) {
            dylf dylf0 = ((dxev)object0).g;
            if(dylf0 == null) {
                dylf0 = dylf.a;
            }
            dylc dylc0 = dylf0.d == null ? dylc.a : dylf0.d;
            hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
            hjwx hjwx0 = hjwt0.e == null ? hjwx.a : hjwt0.e;
            return (dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c)).equals(dypl.c((hjww.b(hjwx0.b) == null ? hjww.l : hjww.b(hjwx0.b)))) && dylc0.d.equals(hjwx0.c);
        }
        return false;
    }
}

