import android.view.View.OnClickListener;
import android.view.View;

public final class cbpw implements View.OnClickListener {
    public final cbpz a;
    public final cbpv b;

    public cbpw(cbpz cbpz0, cbpv cbpv0) {
        this.a = cbpz0;
        this.b = cbpv0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.e.a(this.b);
    }
}

