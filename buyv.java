import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;

final class buyv extends ibsl implements ibtw {
    int a;
    final List b;
    final Account c;
    final long d;
    final ccpr e;
    private Object f;

    public buyv(List list0, Account account0, long v, ccpr ccpr0, ibrl ibrl0) {
        this.b = list0;
        this.c = account0;
        this.d = v;
        this.e = ccpr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buyv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new buyv(this.b, this.c, this.d, this.e, ibrl0);
        ibrl1.f = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        icck icck0 = (icck)this.f;
        Account account0 = this.c;
        long v1 = this.d;
        ccpr ccpr0 = this.e;
        ArrayList arrayList0 = new ArrayList(ibpo.q(this.b, 10));
        for(Object object2: this.b) {
            arrayList0.add(icbb.a(icck0, null, null, new buyu(((bbdi)object2), account0, v1, ccpr0, null), 3));
        }
        this.a = 1;
        Object object3 = icay.a(arrayList0, this);
        return object3 == object1 ? object1 : object3;
    }
}

