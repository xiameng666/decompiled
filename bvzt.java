import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.growth.uiflow.ui.widget.PagerControls;

public final class bvzt implements View.OnClickListener {
    public final PagerControls a;
    public final bvzv b;

    public bvzt(PagerControls pagerControls0, bvzv bvzv0) {
        this.a = pagerControls0;
        this.b = bvzv0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fhvw fhvw0 = this.a.e;
        if(fhvw0 != null) {
            fhvw0.a(fhvv.d(), view0);
        }
        this.b.c.e(this.b.d);
    }
}

