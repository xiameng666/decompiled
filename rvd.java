import android.os.PersistableBundle;

final class rvd extends ibsl implements ibtw {
    int a;
    final rve b;
    final rve c;
    final ibts d;

    public rvd(rve rve0, rve rve1, ibts ibts0, ibrl ibrl0) {
        this.b = rve0;
        this.c = rve1;
        this.d = ibts0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rvd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rvd(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            iccs iccs0 = icbb.a(this.b.r(), null, null, new rva(this.d, null), 3);
            this.b.v(iccs0);
            ruz ruz0 = new ruz(this.b, null);
            ibuq.f(iccm.a, "start");
            icck icck0 = this.c.r();
            ruw ruw0 = new ruw(ruz0, this.c, null);
            iccs iccs1 = icbd.b(icck0, ibru.a, iccm.a, ruw0);
            this.c.v(iccs1);
            this.b.v(iccs1);
            icsu icsu0 = new icsu(this.u());
            icsu0.i(iccs0.p(), new rvb(null));
            icsu0.i(iccs1.p(), new rvc(null));
            this.a = 1;
            object0 = icsu.c(icsu0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        this.b.s();
        rna rna0 = this.b.k().g();
        rsp rsp0 = this.b.k();
        long v1 = this.b.d;
        PersistableBundle persistableBundle0 = object0 == null ? null : ((PersistableBundle)this.b.k().h().fm(object0));
        rnv rnv0 = this.b.f;
        return rnv0.f() ? new rxu(rna0, rsp0, v1, persistableBundle0, null) : new rxu(rna0, rsp0, v1, persistableBundle0, rnv0);
    }
}

