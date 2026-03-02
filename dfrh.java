import com.google.android.gms.nearby.sharing.TransferMetadata;

final class dfrh extends ibsl implements ibtw {
    Object a;

    public dfrh(ibrl ibrl0) {
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dfrh)this.c(((dckx)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dfrh(ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        dckx dckx0 = (dckx)this.a;
        boolean z = true;
        if(hvqz.a.b().bg()) {
            if((dckx0 instanceof dckw)) {
                TransferMetadata transferMetadata0 = ((dckw)dckx0).b;
                return !transferMetadata0.e || (transferMetadata0.a == 1004 || transferMetadata0.a == 0x3F0 || transferMetadata0.a == 0x3FA) ? Boolean.valueOf(true) : Boolean.valueOf(false);
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

