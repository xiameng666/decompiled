import android.view.View.OnClickListener;
import android.view.View;

public final class fmve implements View.OnClickListener {
    public final fmvc a;

    public fmve(fmvc fmvc0) {
        this.a = fmvc0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fmsv fmsv0 = this.a.i;
        if(fmsv0 != null) {
            fmro.c(fmsv0.a.a);
            fmsv0.a.am.c(fmsv0.a.b);
        }
    }
}

