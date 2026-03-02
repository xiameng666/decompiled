import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class bppq implements Predicate {
    public final ggfp a;

    public bppq(ggfp ggfp0) {
        this.a = ggfp0;
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
        gsyz gsyz0 = ((gszo)object0).c;
        if(gsyz0 == null) {
            gsyz0 = gsyz.a;
        }
        return this.a.contains(gsyz0);
    }
}

