import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class dmtr implements Predicate {
    public final dmtv a;

    public dmtr(dmtv dmtv0) {
        this.a = dmtv0;
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
        int v;
        hkhr hkhr0 = ((dxev)object0).c;
        if(hkhr0 == null) {
            hkhr0 = hkhr.b;
        }
        hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
        switch((hkhh0.g == null ? hkir.a : hkhh0.g).m) {
            case 0: {
                v = 2;
                break;
            }
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                v = 4;
                break;
            }
            default: {
                v = 0;
            }
        }
        if(v == 0) {
            v = 1;
        }
        switch(v - 2) {
            case 1: {
                return true;
            }
            case 2: {
                return false;
            }
            default: {
                return this.a.f.a;
            }
        }
    }
}

