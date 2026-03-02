import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.common.api.Status;

public final class bmsn implements View.OnClickListener {
    public final bmsp a;

    public bmsn(bmsp bmsp0) {
        this.a = bmsp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.b.l(blhf.c);
        this.a.b.q(new bmux(Status.f, gfqx.a, gfqx.a, gfqx.a, gfqx.a, gfqx.a));
    }
}

