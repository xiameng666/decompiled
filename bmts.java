import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.common.api.Status;

public final class bmts implements View.OnClickListener {
    public final bmtu a;

    public bmts(bmtu bmtu0) {
        this.a = bmtu0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bmtu bmtu0 = this.a;
        if(!bmtu0.c.c()) {
            bmtu0.a.l(blhf.S);
            bmtu0.a.w(new bmuy(Status.f, gfqx.a));
        }
    }
}

