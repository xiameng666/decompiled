import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.growth.uiflow.ui.widget.PagerControls;
import com.google.android.gms.growth.uiflow.ui.widget.ViewPagerExtended;

public final class bvzu implements View.OnClickListener {
    public final PagerControls a;
    public final bvzv b;

    public bvzu(PagerControls pagerControls0, bvzv bvzv0) {
        this.a = pagerControls0;
        this.b = bvzv0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fhvw fhvw0 = this.a.e;
        if(fhvw0 != null) {
            fhvw0.a(fhvv.d(), view0);
        }
        ViewPagerExtended viewPagerExtended0 = this.b.d;
        tk tk0 = viewPagerExtended0.a.d();
        bvym bvym0 = this.b.c;
        if(tk0 != null && viewPagerExtended0.a() == tk0.b() - 1) {
            bvym0.f(viewPagerExtended0);
            return;
        }
        viewPagerExtended0.b(viewPagerExtended0.a() + 1, bvym0.b);
        viewPagerExtended0.requestFocus();
    }
}

