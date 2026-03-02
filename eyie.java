import com.google.android.gms.trustagent.activeunlock.primary.trustagent.ActiveUnlockRemoteIntentChimeraService;

public final class eyie extends ibsl implements ibtw {
    int a;
    final ActiveUnlockRemoteIntentChimeraService b;
    final String c;
    final exne d;

    public eyie(ActiveUnlockRemoteIntentChimeraService activeUnlockRemoteIntentChimeraService0, String s, exne exne0, ibrl ibrl0) {
        this.b = activeUnlockRemoteIntentChimeraService0;
        this.c = s;
        this.d = exne0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyie)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyie(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        Object object2 = this.b.g(this.c, this.d, this);
        return object2 == object1 ? object1 : object2;
    }
}

