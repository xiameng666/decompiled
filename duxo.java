import com.google.android.gms.mdocstore.types.ProvisioningId;

final class duxo extends ibsl implements ibtw {
    int a;
    final duyb b;
    final ProvisioningId c;

    public duxo(duyb duyb0, ProvisioningId provisioningId0, ibrl ibrl0) {
        this.b = duyb0;
        this.c = provisioningId0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((duxo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new duxo(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.b.b.f(this.c.a);
            ibuq.e(this.c.a, "asString(...)");
            this.a = 1;
            if(this.b.b(this.c.a, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

