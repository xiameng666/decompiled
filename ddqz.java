import com.google.android.gms.nearby.sharing.internal.StartQrCodeSessionParams;

public final class ddqz implements azys {
    public final ddsc a;
    public final dckg b;

    public ddqz(ddsc ddsc0, dckg dckg0) {
        this.a = ddsc0;
        this.b = dckg0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        StartQrCodeSessionParams startQrCodeSessionParams0 = new StartQrCodeSessionParams();
        startQrCodeSessionParams0.a = new ddov(this.a, ((evqp)object1));
        startQrCodeSessionParams0.c = this.b.a;
        ddot0.aa(startQrCodeSessionParams0);
    }
}

