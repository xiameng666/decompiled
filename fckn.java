import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.backup.phone.RestoreFlowChimeraActivity;

public final class fckn implements evqc {
    public final RestoreFlowChimeraActivity a;

    public fckn(RestoreFlowChimeraActivity restoreFlowChimeraActivity0) {
        this.a = restoreFlowChimeraActivity0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        RestoreFlowChimeraActivity.j.g("Did not get app theme result", exception0, new Object[0]);
        AppTheme appTheme0 = fczo.d();
        this.a.a(appTheme0);
    }
}

