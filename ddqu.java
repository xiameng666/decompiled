import com.google.android.gms.nearby.sharing.internal.UnregisterReceiveSurfaceParams;

public final class ddqu implements azys {
    public final ddul a;

    public ddqu(ddul ddul0) {
        this.a = ddul0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        UnregisterReceiveSurfaceParams unregisterReceiveSurfaceParams0 = new UnregisterReceiveSurfaceParams();
        unregisterReceiveSurfaceParams0.a = this.a;
        unregisterReceiveSurfaceParams0.b = new ddru(((evqp)object1));
        ddot0.ae(unregisterReceiveSurfaceParams0);
        this.a.c();
    }
}

