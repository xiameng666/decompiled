import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.common.api.Status;

public final class bmtr implements View.OnClickListener {
    public final bmtu a;

    public bmtr(bmtu bmtu0) {
        this.a = bmtu0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bmtu bmtu0 = this.a;
        if(!bmtu0.c.c()) {
            bmuz bmuz0 = bmtu0.a;
            gfsx gfsx0 = gfsx.m(bmtu0.d);
            bmuz0.w(new bmuy(Status.b, gfsx0));
            bmtu0.a.l(blhf.T);
        }
    }
}

