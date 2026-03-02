import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.common.api.Status;

public final class bmtm implements View.OnClickListener {
    public final bmtp a;

    public bmtm(bmtp bmtp0) {
        this.a = bmtp0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bmtp bmtp0 = this.a;
        if(!bmtp0.c.c()) {
            bmtp0.a.l(blhf.x);
            bmtp0.a.q(new bmux(Status.f, gfqx.a, gfqx.a, gfqx.a, gfqx.a, gfqx.a));
        }
    }
}

