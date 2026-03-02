import android.app.Application;
import java.util.ArrayList;
import java.util.Collection;

final class cbia extends ibsl implements ibtw {
    int a;
    final cbij b;

    public cbia(cbij cbij0, ibrl ibrl0) {
        this.b = cbij0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbia)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbia(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            cbij cbij0 = this.b;
            Application application0 = cbij0.a();
            if(!huju.a.b().b()) {
                return bbmn.h(application0, "com.google.android.gms");
            }
            cbdy cbdy0 = cbec.a(application0, cbij0.b);
            this.a = 1;
            object0 = cbdy0.a(this);
            if(object0 == object1) {
                return object1;
            }
        }
        Object object2 = new ArrayList(ibpo.q(((Iterable)object0), 10));
        for(Object object3: ((Iterable)object0)) {
            ((Collection)object2).add(cbed.a(((cbed)object3)));
        }
        return object2;
    }
}

