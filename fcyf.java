import android.view.View.OnClickListener;
import android.view.View;

public final class fcyf implements View.OnClickListener {
    public final fcyi a;
    public final iw b;

    public fcyf(fcyi fcyi0, iw iw0) {
        this.a = fcyi0;
        this.b = iw0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.ai.onClick(this.b, -3);
        this.a.ag.ifPresent(new fcyh());
    }
}

