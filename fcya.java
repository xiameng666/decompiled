import android.view.View.OnClickListener;
import android.view.View;

public final class fcya implements View.OnClickListener {
    public final fcyb a;
    public final iw b;

    public fcya(fcyb fcyb0, iw iw0) {
        this.a = fcyb0;
        this.b = iw0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.ag.onClick(this.b, -2);
    }
}

