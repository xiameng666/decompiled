import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsChimeraActivity;

public final class csef implements DialogInterface.OnClickListener {
    public final MobileDataPlanSettingsChimeraActivity a;

    public csef(MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity0) {
        this.a = mobileDataPlanSettingsChimeraActivity0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        crxn.c().Q(0x1F, null, null, hhct.aP, System.currentTimeMillis(), csfi.a());
        MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity0 = this.a;
        if(hvko.C()) {
            csff.c(mobileDataPlanSettingsChimeraActivity0.l, false);
        }
        mobileDataPlanSettingsChimeraActivity0.p(new aztb(new Status(0x698F)));
    }
}

