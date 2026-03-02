import com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams;

public final class ddqv implements azys {
    public final ddul a;
    public final ddmy b;
    public final dclp c;

    public ddqv(ddul ddul0, ddmy ddmy0, dclp dclp0) {
        this.a = ddul0;
        this.b = ddmy0;
        this.c = dclp0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        RegisterSendSurfaceParams registerSendSurfaceParams0 = new RegisterSendSurfaceParams();
        registerSendSurfaceParams0.a = this.a;
        registerSendSurfaceParams0.b = this.b;
        registerSendSurfaceParams0.c = this.c.c;
        registerSendSurfaceParams0.e = this.c.b;
        registerSendSurfaceParams0.f = this.c.a;
        registerSendSurfaceParams0.g = this.c.d;
        registerSendSurfaceParams0.d = new ddrt(((evqp)object1));
        ddot0.L(registerSendSurfaceParams0);
    }
}

