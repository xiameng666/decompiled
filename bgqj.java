import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class bgqj implements Predicate {
    public final hgtu a;

    public bgqj(hgtu hgtu0) {
        this.a = hgtu0;
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
        return ((ProtoLiteMessage)this.a).equals((hguc0.c == null ? hgtu.a : hguc0.c));
    }
}

