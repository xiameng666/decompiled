import android.view.View.OnFocusChangeListener;
import android.view.View;

public final class gbbv implements View.OnFocusChangeListener {
    public final gbbw a;

    public gbbv(gbbw gbbw0) {
        this.a = gbbw0;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        gbbw gbbw0 = this.a;
        if(gbbw0.aI()) {
            garp garp0 = gbbw0.t;
            if(garp0 != null) {
                garp0.R(z);
                if(!z) {
                    gbbw0.aX(gbbw0.t.u(), false);
                }
            }
        }
    }
}

