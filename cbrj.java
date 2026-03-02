import android.view.View.OnClickListener;
import android.view.View;

public final class cbrj implements View.OnClickListener {
    public final cbrl a;
    public final cbqc b;

    public cbrj(cbrl cbrl0, cbqc cbqc0) {
        this.a = cbrl0;
        this.b = cbqc0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.e.a(this.b);
    }
}

