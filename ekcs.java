import j..util.Collection.-EL;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class ekcs implements Predicate {
    public final ekcv a;

    public ekcs(ekcv ekcv0) {
        this.a = ekcv0;
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
        gdmx gdmx0 = ((gdmq)object0).d;
        if(gdmx0 == null) {
            gdmx0 = gdmx.a;
        }
        return !Collection.-EL.stream(gdmx0.g).flatMap(new ekco()).anyMatch(new ekcp(this.a));
    }
}

