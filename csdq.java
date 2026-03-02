import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity;

public final class csdq implements View.OnClickListener {
    public final MobileDataPlanDetailChimeraActivity a;

    public csdq(MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity0) {
        this.a = mobileDataPlanDetailChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity0 = this.a;
        crxn.c().Q(29, mobileDataPlanDetailChimeraActivity0.k.getText().toString(), csgn.f(view0), hhct.aN, System.currentTimeMillis(), Integer.valueOf(mobileDataPlanDetailChimeraActivity0.p));
        if(!mobileDataPlanDetailChimeraActivity0.m.pageDown(false)) {
            mobileDataPlanDetailChimeraActivity0.n(true);
        }
    }
}

