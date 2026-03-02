import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.GetActionsParams;

public final class ddrl implements azys {
    public final ddsc a;
    public final ShareTarget b;

    public ddrl(ddsc ddsc0, ShareTarget shareTarget0) {
        this.a = ddsc0;
        this.b = shareTarget0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        GetActionsParams getActionsParams0 = new GetActionsParams();
        getActionsParams0.a = this.b;
        getActionsParams0.b = new ddoy(this.a, ((evqp)object1));
        ddot0.g(getActionsParams0);
    }
}

