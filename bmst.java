import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.common.api.Status;

public final class bmst implements View.OnClickListener {
    public final bmsw a;

    public bmst(bmsw bmsw0) {
        this.a = bmsw0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.b.l(blhf.m);
        this.a.b.q(new bmux(Status.f, gfqx.a, gfqx.a, gfqx.a, gfqx.a, gfqx.a));
    }
}

