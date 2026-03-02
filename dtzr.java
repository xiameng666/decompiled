import android.content.Context;
import j..util.Collection.-EL;
import java.util.List;

final class dtzr extends ibsl implements ibtw {
    int a;
    final dtzt b;
    final String c;
    final Context d;

    public dtzr(dtzt dtzt0, String s, Context context0, ibrl ibrl0) {
        this.b = dtzt0;
        this.c = s;
        this.d = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dtzr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dtzr(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.c(this.b.b, this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((List)object0) == null) {
            ((ggtj)dtzt.a.j()).x("Could not fetch RP allowlist");
            return null;
        }
        dtzt dtzt0 = this.b;
        String s = this.c;
        Context context0 = this.d;
        Object object2 = hwfk.Y() && !dtzt0.c ? dtzn.a(s) : null;
        hkbc hkbc0 = (hkbc)Collection.-EL.stream(((List)object0)).filter(new duba(s)).findFirst().orElse(null);
        if(hkbc0 == null) {
            ((ggtj)dtzt.a.j()).x("Could not find RP info for package name.");
            return object2;
        }
        hkay hkay0 = (hkay)dubh.b(hkbc0).filter(new dubc(s)).findFirst().orElse(null);
        if(hkay0 == null) {
            ((ggtj)dtzt.a.j()).x("Could not find package info for package name");
            return object2;
        }
        hfuo hfuo0 = hkay0.c;
        ibuq.e(hfuo0, "getSignatureDigestsList(...)");
        if(!dtzt0.e(context0, s, hfuo0)) {
            ((ggtj)dtzt.a.j()).x("Package signature from allowlsit did not match that from the device");
            return object2;
        }
        Object object3 = hkbc0.d;
        return object3 == null ? hjzr.a : object3;
    }
}

