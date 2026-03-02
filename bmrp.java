import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.common.api.Status;

public final class bmrp implements View.OnClickListener {
    public final bmrs a;

    public bmrp(bmrs bmrs0) {
        this.a = bmrs0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.b.l(blhf.j);
        this.a.b.q(new bmux(Status.f, gfqx.a, gfqx.a, gfqx.a, gfqx.a, gfqx.a));
    }
}

