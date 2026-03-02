import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.RejectParams;

public final class ddpv implements azys {
    public final ShareTarget a;

    public ddpv(ShareTarget shareTarget0) {
        this.a = shareTarget0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        RejectParams rejectParams0 = new RejectParams();
        rejectParams0.a = this.a;
        rejectParams0.b = new ddrt(((evqp)object1));
        ddot0.O(rejectParams0);
    }
}

