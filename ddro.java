import com.google.android.gms.nearby.sharing.internal.RegisterInstallCallbackParams;

public final class ddro implements azys {
    public final ddoj a;

    public ddro(ddoj ddoj0) {
        this.a = ddoj0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        RegisterInstallCallbackParams registerInstallCallbackParams0 = new RegisterInstallCallbackParams();
        registerInstallCallbackParams0.b = 1;
        registerInstallCallbackParams0.c = new ddrt(((evqp)object1));
        registerInstallCallbackParams0.a = this.a;
        ddot0.J(registerInstallCallbackParams0);
    }
}

