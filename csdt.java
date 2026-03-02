import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity;

public final class csdt implements View.OnClickListener {
    public final MobileDataPlanDetailChimeraActivity a;

    public csdt(MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity0) {
        this.a = mobileDataPlanDetailChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        crxn.c().Q(30, this.a.k.getText().toString(), csgn.f(view0), hhct.aO, System.currentTimeMillis(), Integer.valueOf(this.a.p));
        this.a.o(true);
    }
}

