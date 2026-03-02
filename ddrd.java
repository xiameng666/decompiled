import com.google.android.gms.nearby.sharing.internal.UnregisterSendSurfaceParams;

public final class ddrd implements azys {
    public final ddul a;
    public final ddmy b;

    public ddrd(ddul ddul0, ddmy ddmy0) {
        this.a = ddul0;
        this.b = ddmy0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        UnregisterSendSurfaceParams unregisterSendSurfaceParams0 = new UnregisterSendSurfaceParams();
        unregisterSendSurfaceParams0.a = this.a;
        unregisterSendSurfaceParams0.b = new ddru(((evqp)object1));
        ddot0.af(unregisterSendSurfaceParams0);
        this.a.c();
        this.b.f();
    }
}

