import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class fxil implements Predicate {
    public final int a;

    public fxil(int v) {
        this.a = v;
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
        int v = hgui.a(((hgtz)object0).b);
        if(v == 0) {
            v = 1;
        }
        return v == this.a;
    }
}

