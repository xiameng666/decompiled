import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity;

public final class csbk implements View.OnClickListener {
    public final cscb a;

    public csbk(cscb cscb0) {
        this.a = cscb0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        MobileDataPlanDetailChimeraActivity.r(this.a.a, this.a.b);
    }
}

