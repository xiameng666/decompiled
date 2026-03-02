import android.view.View.OnClickListener;
import android.view.View;

public final class fmvd implements View.OnClickListener {
    public final fmvc a;

    public fmvd(fmvc fmvc0) {
        this.a = fmvc0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fmsw fmsw0 = this.a.j;
        if(fmsw0 != null) {
            fmsw0.a.am.c(fmsw0.a.b);
        }
    }
}

