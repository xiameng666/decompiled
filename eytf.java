import android.view.View.OnClickListener;
import android.view.View;

public final class eytf implements View.OnClickListener {
    public final eytx a;

    public eytf(eytx eytx0) {
        this.a = eytx0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ibth ibth0 = this.a.f;
        if(ibth0 != null) {
            ibth0.a();
        }
    }
}

