import com.google.android.gms.trustagent.activeunlock.proxy.chime.ProxyDeviceGcmIntentOperation;

public final class ezah extends ibsl implements ibtw {
    int a;
    final ProxyDeviceGcmIntentOperation b;
    final exnd c;

    public ezah(ProxyDeviceGcmIntentOperation proxyDeviceGcmIntentOperation0, exnd exnd0, ibrl ibrl0) {
        this.b = proxyDeviceGcmIntentOperation0;
        this.c = exnd0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ezah)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ezah(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ezak ezak0 = this.b.a;
            if(ezak0 == null) {
                ibuq.j("remoteCommandSender");
                ezak0 = null;
            }
            this.a = 1;
            if(ezak0.a(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

