import com.google.android.gms.trustagent.activeunlock.primary.trustagent.ActiveUnlockRemoteIntentChimeraService;

public final class eyib implements ibts {
    public final ActiveUnlockRemoteIntentChimeraService a;
    public final String b;
    public final evqp c;
    public final exne d;
    public final ibvd e;

    public eyib(ActiveUnlockRemoteIntentChimeraService activeUnlockRemoteIntentChimeraService0, String s, evqp evqp0, exne exne0, ibvd ibvd0) {
        this.a = activeUnlockRemoteIntentChimeraService0;
        this.b = s;
        this.c = evqp0;
        this.d = exne0;
        this.e = ibvd0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        evqp evqp0 = this.c;
        if(((Throwable)object0) != null) {
            ((ggtj)((ggtj)this.a.e().j()).s(((Throwable)object0))).B("onRequest for %s failed", this.b);
            evqp0.b(this.a.f().a(this.d, 9).toBytesArray());
            return ibom.a;
        }
        evqp0.b(((iccs)this.e.a).o());
        return ibom.a;
    }
}

