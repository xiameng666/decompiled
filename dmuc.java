import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class dmuc implements Predicate {
    public final hjqn a;

    public dmuc(hjqn hjqn0) {
        this.a = hjqn0;
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
        hkhr hkhr0 = ((dxes)object0).c;
        if(hkhr0 == null) {
            hkhr0 = hkhr.b;
        }
        return !((ProtoLiteMessage)(hkhr0.e == null ? hjqn.a : hkhr0.e)).equals(this.a);
    }
}

