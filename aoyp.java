import com.google.android.gms.autofill.fill.IFillField;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class aoyp implements Predicate {
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
        return ((IFillField)object0).q(ando.L) || ((IFillField)object0).q(ando.M) || ((IFillField)object0).q(ando.N) || ((IFillField)object0).q(ando.O) || ((IFillField)object0).q(ando.P) || ((IFillField)object0).q(ando.Q) || ((IFillField)object0).q(ando.R) || ((IFillField)object0).q(ando.S) || ((IFillField)object0).q(ando.T);
    }
}

