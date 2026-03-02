import android.view.View.OnClickListener;
import android.view.View;

public final class eytn implements View.OnClickListener {
    public final eytx a;

    public eytn(eytx eytx0) {
        this.a = eytx0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        ibth ibth0 = this.a.d;
        if(ibth0 != null) {
            ibth0.a();
        }
    }
}

