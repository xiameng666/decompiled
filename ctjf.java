import com.google.android.gms.multidevice.sync.appcast.client.ui.RemoteAppListChimeraActivity;

public final class ctjf extends ibsl implements ibtw {
    int a;
    final RemoteAppListChimeraActivity b;

    public ctjf(RemoteAppListChimeraActivity remoteAppListChimeraActivity0, ibrl ibrl0) {
        this.b = remoteAppListChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctjf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctjf(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icls icls0 = new icls(this.b.h);
            icku icku0 = new icku(new ickt(new icoj(new ctje(null), icls0), new ctjb(null)));
            ctjd ctjd0 = new ctjd(this.b);
            this.a = 1;
            if(icku0.oR(ctjd0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

