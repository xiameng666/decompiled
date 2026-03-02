import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.common.api.Status;

public final class bmyp implements View.OnClickListener {
    public final bmyr a;

    public bmyp(bmyr bmyr0) {
        this.a = bmyr0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bmwt bmwt0 = this.a.a;
        if(!bmcn.e) {
            bmwt0.m();
            return;
        }
        bmwt0.q(new bmvy(Status.f, "USER_CANCELED", gfqx.a, gfqx.a));
    }
}

