import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class dwuy implements Predicate {
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
        if(!hwmp.q()) {
            return true;
        }
        gveu gveu0 = ((Valuable)object0).a;
        if(gveu0.b == 5) {
            guxg guxg0 = (guxg)gveu0.c;
            return !hwmp.j().b.contains(dwvk.d(guxg0));
        }
        return false;
    }
}

