import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class bgql implements Predicate {
    public final gxoi a;

    public bgql(gxoi gxoi0) {
        this.a = gxoi0;
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
        hgtu hgtu0 = ((gxoi)object0).c;
        if(hgtu0 == null) {
            hgtu0 = hgtu.a;
        }
        return !((ProtoLiteMessage)hgtu0).equals((this.a.c == null ? hgtu.a : this.a.c));
    }
}

