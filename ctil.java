import com.google.android.gms.multidevice.sync.appcast.client.ui.AppCastChimeraActivity;

public final class ctil extends ibsl implements ibtw {
    int a;
    final AppCastChimeraActivity b;

    public ctil(AppCastChimeraActivity appCastChimeraActivity0, ibrl ibrl0) {
        this.b = appCastChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctil)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctil(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            AppCastChimeraActivity appCastChimeraActivity0 = this.b;
            cthp cthp0 = appCastChimeraActivity0.f;
            if(cthp0 == null) {
                ibuq.j("appCastDeviceManager");
                cthp0 = null;
            }
            icig icig0 = cthp0.a();
            ctik ctik0 = new ctik(appCastChimeraActivity0);
            this.a = 1;
            if(icig0.oR(ctik0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

