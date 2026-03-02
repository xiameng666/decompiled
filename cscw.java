import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity;

public final class cscw implements View.OnClickListener {
    public final csdd a;

    public cscw(csdd csdd0) {
        this.a = csdd0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        MobileDataPlanDetailChimeraActivity.q(this.a.a);
    }
}

