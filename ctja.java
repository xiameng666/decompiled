import com.google.android.gms.multidevice.sync.appcast.client.ui.RemoteAppListChimeraActivity;

public final class ctja extends ibsl implements ibtw {
    int a;
    final RemoteAppListChimeraActivity b;

    public ctja(RemoteAppListChimeraActivity remoteAppListChimeraActivity0, ibrl ibrl0) {
        this.b = remoteAppListChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctja)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctja(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icig icig0 = this.b.c().a();
            ctiz ctiz0 = new ctiz(this.b);
            this.a = 1;
            if(icig0.oR(ctiz0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

