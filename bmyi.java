import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.common.api.Status;

public final class bmyi implements View.OnClickListener {
    public final bmym a;

    public bmyi(bmym bmym0) {
        this.a = bmym0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.ag.q(new bmvy(Status.f, "USER_CANCELED", gfqx.a, gfqx.a));
    }
}

