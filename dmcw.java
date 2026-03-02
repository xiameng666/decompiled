import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class dmcw implements Predicate {
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
        String s;
        ibuq.f(((Valuable)object0), "valuable");
        if(!dmcy.c) {
            return true;
        }
        gveu gveu0 = ((Valuable)object0).a;
        if(gveu0.b == 5) {
            guxg guxg0 = (guxg)gveu0.c;
            ibuq.e(guxg0, "getFlight(...)");
            hfuo hfuo0 = hwmp.i().b;
            ibuq.e(hfuo0, "getElementList(...)");
            hfuo hfuo1 = hwmp.k().b;
            ibuq.e(hfuo1, "getElementList(...)");
            if((guxg0.b & 0x400) != 0) {
                guxd guxd0 = guxg0.l == null ? guxd.a : guxg0.l;
                guxe guxe0 = guxd0.b == null ? guxe.a : guxd0.b;
                s = (guxe0.c == null ? guxc.a : guxe0.c).b;
                ibuq.c(s);
                return hfuo1.contains(s) ? hfuo0.contains(dmcy.a(guxg0)) : false;
            }
            s = (guxg0.j == null ? guxc.a : guxg0.j).b;
            ibuq.c(s);
            return hfuo1.contains(s) ? hfuo0.contains(dmcy.a(guxg0)) : false;
        }
        return false;
    }
}

