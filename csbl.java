import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity;

public final class csbl implements View.OnClickListener {
    public final cscb a;

    public csbl(cscb cscb0) {
        this.a = cscb0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        cscb cscb0;
        try {
            cscb0 = this.a;
            ((MobileDataPlanDetailChimeraActivity)cscb0.a).p();
        }
        catch(IllegalStateException unused_ex) {
            cscb0.z(hhct.dE);
        }
    }
}

