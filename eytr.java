import android.view.View.OnClickListener;
import android.view.View;

public final class eytr implements View.OnClickListener {
    public final eytx a;
    public final eytv b;

    public eytr(eytx eytx0, eytv eytv0) {
        this.a = eytx0;
        this.b = eytv0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ibth ibth0 = this.a.e;
        if(ibth0 != null) {
            ibth0.a();
        }
        this.b.dismissNow();
    }
}

