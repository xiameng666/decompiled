import android.accounts.Account;
import android.app.Application;
import java.util.ArrayList;
import java.util.List;

final class cbta extends ibsl implements ibtw {
    int a;
    final cbte b;
    private Object c;

    public cbta(cbte cbte0, ibrl ibrl0) {
        this.b = cbte0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbta)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cbta(this.b, ibrl0);
        ibrl1.c = object0;
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
        icck icck0 = (icck)this.c;
        cbte cbte0 = this.b;
        Application application0 = cbte0.a();
        List list0 = cbaz.a().b(application0, "com.google.android.gms");
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object2: list0) {
            arrayList0.add(icbb.a(icck0, null, null, new cbsz(cbte0, ((Account)object2), null), 3));
        }
        this.a = 1;
        Object object3 = icay.a(arrayList0, this);
        return object3 == object1 ? object1 : object3;
    }
}

