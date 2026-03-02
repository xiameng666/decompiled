import android.view.View.OnClickListener;
import android.view.View;

public final class zou implements View.OnClickListener {
    public final zow a;
    public final grug b;

    public zou(zow zow0, grug grug0) {
        this.a = zow0;
        this.b = grug0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        grug grug0 = this.b;
        zow zow0 = this.a;
        if(!zhz.c((grug0.e == null ? grwp.a : grug0.e))) {
            zow0.u.e.performClick();
            return;
        }
        if(hoju.p()) {
            zow0.u.f.c(zow0.t);
            zow0.u.h.a((grug0.e == null ? grwp.a : grug0.e));
            return;
        }
        zow0.u.h.a((grug0.e == null ? grwp.a : grug0.e));
    }
}

