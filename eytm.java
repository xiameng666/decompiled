import android.view.View.OnClickListener;
import android.view.View;

public final class eytm implements View.OnClickListener {
    public final eytx a;

    public eytm(eytx eytx0) {
        this.a = eytx0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        eytx eytx0 = this.a;
        ibth ibth0 = eytx0.i;
        if(ibth0 != null) {
            ibth0.a();
        }
        ibth ibth1 = eytx0.f;
        if(ibth1 != null) {
            ibth1.a();
        }
    }
}

