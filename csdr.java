import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity;

public final class csdr implements View.OnClickListener {
    public final MobileDataPlanDetailChimeraActivity a;

    public csdr(MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity0) {
        this.a = mobileDataPlanDetailChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        crxn.c().Q(28, this.a.l.getText().toString(), csgn.f(view0), hhct.aM, System.currentTimeMillis(), Integer.valueOf(this.a.p));
        this.a.o(false);
    }
}

