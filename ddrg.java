import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.CancelParams;

public final class ddrg implements azys {
    public final ShareTarget a;

    public ddrg(ShareTarget shareTarget0) {
        this.a = shareTarget0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        CancelParams cancelParams0 = new CancelParams();
        cancelParams0.a = this.a;
        cancelParams0.b = new ddrt(((evqp)object1));
        ddot0.d(cancelParams0);
    }
}

