import android.view.View.OnClickListener;
import android.view.View;

public final class bukt implements View.OnClickListener {
    public final bukv a;
    public final cmeb b;

    public bukt(bukv bukv0, cmeb cmeb0) {
        this.a = bukv0;
        this.b = cmeb0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fhvu fhvu0 = buqr.b(this.a.aF.a);
        this.b.b(gltz.e, fhvu0);
        this.a.ax.setVisibility(4);
        this.a.ay.setVisibility(0);
        this.a.aF.c();
        this.a.H(hgeg.l);
    }
}

