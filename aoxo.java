import com.google.android.gms.autofill.fill.IFillField;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class aoxo implements Predicate {
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
        return !((IFillField)object0).q(ando.k) || angz.c(((IFillField)object0)) ? hqec.e() && ((IFillField)object0).p(ando.ap) : true;
    }
}

