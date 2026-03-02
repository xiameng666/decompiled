import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsChimeraActivity;

public final class csem implements View.OnClickListener {
    private final csdj a;

    public csem(csdj csdj0) {
        this.a = csdj0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        csdj csdj0 = this.a;
        MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity0 = csdj0.f;
        if(mobileDataPlanSettingsChimeraActivity0 != null) {
            mobileDataPlanSettingsChimeraActivity0.l();
        }
        crxn.c().Q(70, null, "R.id.error_layout", hhct.cl, System.currentTimeMillis(), csfi.a());
        csdj0.t(true);
        csff.c(csdj0, true);
    }
}

