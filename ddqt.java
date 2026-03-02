import com.google.android.gms.nearby.sharing.internal.RegisterReceiveSurfaceParams;

public final class ddqt implements azys {
    public final ddul a;
    public final dcky b;

    public ddqt(ddul ddul0, dcky dcky0) {
        this.a = ddul0;
        this.b = dcky0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        RegisterReceiveSurfaceParams registerReceiveSurfaceParams0 = new RegisterReceiveSurfaceParams();
        registerReceiveSurfaceParams0.a = this.a;
        registerReceiveSurfaceParams0.b = this.b.a;
        registerReceiveSurfaceParams0.c = new ddrt(((evqp)object1));
        registerReceiveSurfaceParams0.d = this.b.c;
        registerReceiveSurfaceParams0.e = this.b.b;
        registerReceiveSurfaceParams0.f = this.b.d;
        ddot0.K(registerReceiveSurfaceParams0);
    }
}

