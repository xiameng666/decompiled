import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class dwva implements Predicate {
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
            hfuo hfuo0 = hwmp.i().b;
            hfuo hfuo1 = hwmp.k().b;
            if((guxg0.b & 0x400) != 0) {
                guxd guxd0 = guxg0.l == null ? guxd.a : guxg0.l;
                guxe guxe0 = guxd0.b == null ? guxe.a : guxd0.b;
                return hfuo1.contains((guxe0.c == null ? guxc.a : guxe0.c).b) ? hfuo0.contains(dwvk.d(guxg0)) : false;
            }
            return hfuo1.contains((guxg0.j == null ? guxc.a : guxg0.j).b) ? hfuo0.contains(dwvk.d(guxg0)) : false;
        }
        return false;
    }
}

