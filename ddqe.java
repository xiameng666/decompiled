import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.InstallParams;

public final class ddqe implements azys {
    public final ShareTarget a;
    public final long b;

    public ddqe(ShareTarget shareTarget0, long v) {
        this.a = shareTarget0;
        this.b = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        InstallParams installParams0 = new InstallParams();
        installParams0.a = this.a;
        installParams0.b = this.b;
        installParams0.c = new ddrt(((evqp)object1));
        ddot0.w(installParams0);
    }
}

