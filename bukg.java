import android.view.View.OnClickListener;
import android.view.View;

public final class bukg implements View.OnClickListener {
    public final bukv a;

    public bukg(bukv bukv0) {
        this.a = bukv0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bukv bukv0 = this.a;
        if(bukv0.aO == 2) {
            bukv0.b.a();
            bukv0.d.u(0, bukv0.d.b());
            bukv0.N(1);
            return;
        }
        bukv0.aL.d();
    }
}

