import android.view.View.OnClickListener;
import android.view.View;

public final class fcyg implements View.OnClickListener {
    public final fcyi a;

    public fcyg(fcyi fcyi0) {
        this.a = fcyi0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.ah.ifPresent(new fcyh());
    }
}

