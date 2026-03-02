import j..util.DesugarCollections;
import java.util.Map;

final class dxpo extends ibsl implements ibtw {
    int a;
    final dxpr b;

    public dxpo(dxpr dxpr0, ibrl ibrl0) {
        this.b = dxpr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxpo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxpo(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        dymg dymg0;
        Object object1 = ibrx.a;
        int v = this.a;
        boolean z = true;
        ibnx.b(object0);
        if(v == 0) {
            gmcd gmcd0 = this.b.c.a();
            this.a = 1;
            object0 = icpu.c(gmcd0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        Map map0 = DesugarCollections.unmodifiableMap(((dymo)object0).f);
        dxpr dxpr0 = this.b;
        dymm dymm0 = (dymm)map0.get(dxpr0.e);
        dxpn dxpn0 = (dxpn)dxpr0.b.a();
        if(dymm0 == null) {
            z = false;
        }
        if(dymm0 == null) {
            dymg0 = null;
        }
        else {
            dymg0 = dymm0.c;
            if(dymg0 == null) {
                dymg0 = dymg.a;
            }
        }
        dxpr0.a(new dxpn(z, dymg0));
        return ibom.a;
    }
}

