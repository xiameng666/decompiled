import android.accounts.Account;
import java.util.ArrayList;
import java.util.Collection;

final class cbsw extends ibsl implements ibtw {
    int a;
    final cbte b;

    public cbsw(cbte cbte0, ibrl ibrl0) {
        this.b = cbte0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbsw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbsw(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.g(this);
            if(object0 == object1) {
                return object1;
            }
        }
        Object object2 = new ArrayList(ibpo.q(((Iterable)object0), 10));
        for(Object object3: ((Iterable)object0)) {
            String s = ((Account)object3).name;
            ibuq.e(s, "name");
            ((Collection)object2).add(s);
        }
        return object2;
    }
}

