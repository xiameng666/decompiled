import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dwkj implements ibts {
    public final dwkl a;

    public dwkj(dwkl dwkl0) {
        this.a = dwkl0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        gged_interceptors gged0 = fsib.d(((ProtoSafeParcelable)object0));
        dwkl dwkl0 = this.a;
        if(gged0.isEmpty()) {
            ((ggtj)dwkl.a.i()).x("No valuables were returned from the save local valuables operation");
            dwkl0.g.l(gkaf.d);
            return ibom.a;
        }
        Object object1 = gged0.get(0);
        ibuq.e(object1, "get(...)");
        dwkl0.h.l(((Valuable)object1));
        return ibom.a;
    }
}

