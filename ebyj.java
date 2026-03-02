import com.google.android.gms.common.api.Status;

final class ebyj extends ibsl implements ibtw {
    int a;
    final ebyk b;

    public ebyj(ebyk ebyk0, ibrl ibrl0) {
        this.b = ebyk0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ebyj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ebyj(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dyra dyra0 = this.b.g;
            if(dyra0 == null) {
                ibuq.j("octopusCardManager");
                dyra0 = null;
            }
            this.a = 1;
            if(dyra.j(dyra0, this) == object1) {
                return object1;
            }
        }
        byte[] arr_b = ebyk.a.toBytesArray();
        this.b.c.b(Status.b, arr_b);
        return ibom.a;
    }
}

