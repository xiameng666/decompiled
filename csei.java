import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsChimeraActivity;

public final class csei implements Runnable {
    public final MobileDataPlanSettingsChimeraActivity a;
    public final Intent b;
    public final String c;

    public csei(MobileDataPlanSettingsChimeraActivity mobileDataPlanSettingsChimeraActivity0, Intent intent0, String s) {
        this.a = mobileDataPlanSettingsChimeraActivity0;
        this.b = intent0;
        this.c = s;
    }

    @Override
    public final void run() {
        Bundle bundle0 = this.b.getExtras();
        this.a.g(hhct.dE, bundle0, this.c);
    }
}

