import android.content.Intent;
import com.google.android.gms.nearby.sharing.internal.InvalidateIntentParams;

public final class ddqp implements azys {
    public final ddsc a;
    public final Intent b;

    public ddqp(ddsc ddsc0, Intent intent0) {
        this.a = ddsc0;
        this.b = intent0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        InvalidateIntentParams invalidateIntentParams0 = new InvalidateIntentParams();
        invalidateIntentParams0.a = this.b;
        invalidateIntentParams0.b = new ddop(this.a, ((evqp)object1));
        ddot0.x(invalidateIntentParams0);
    }
}

