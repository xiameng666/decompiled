import android.content.Context;
import java.util.List;

public final class dtzs extends ibsl implements ibtw {
    int a;
    final dtzt b;
    final Context c;
    final String d;
    final String e;

    public dtzs(dtzt dtzt0, Context context0, String s, String s1, ibrl ibrl0) {
        this.b = dtzt0;
        this.c = context0;
        this.d = s;
        this.e = s1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dtzs)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dtzs(this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                this.a = 1;
                object0 = this.b.b(this.b.b, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                break;
            }
            default: {
                return object0;
            }
        }
        if(((List)object0) == null) {
            ((ggtj)dtzt.a.j()).x("Could not fetch browser allowlist");
            return null;
        }
        String s = this.d;
        for(Object object2: ((List)object0)) {
            if(!ibuq.m(((hkay)object2).b, s)) {
                continue;
            }
            goto label_19;
        }
        object2 = null;
    label_19:
        if(((hkay)object2) == null) {
            ((ggtj)dtzt.a.j()).x("Could not find browser integrator");
            return null;
        }
        dtzt dtzt0 = this.b;
        hfuo hfuo0 = ((hkay)object2).c;
        ibuq.e(hfuo0, "getSignatureDigestsList(...)");
        if(!dtzt0.e(this.c, s, hfuo0)) {
            ((ggtj)dtzt.a.j()).x("Browser integrator signature did not match that from the device");
            return null;
        }
        this.a = 2;
        Object object3 = dtzt0.d(this.e, this);
        return object3 == object1 ? object1 : object3;
    }
}

