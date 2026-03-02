import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class boue implements Predicate {
    public final fqya a;

    public boue(fqya fqya0) {
        this.a = fqya0;
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
        gsyz gsyz0 = ((fqya)object0).c;
        if(gsyz0 == null) {
            gsyz0 = gsyz.a;
        }
        return ((ProtoLiteMessage)gsyz0).equals((this.a.c == null ? gsyz.a : this.a.c));
    }
}

