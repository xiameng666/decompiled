import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;
import j..util.Objects;

public final class fcur extends aqgj {
    final WearBackupSettingsChimeraActivity a;

    public fcur(WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity0) {
        Objects.requireNonNull(wearBackupSettingsChimeraActivity0);
        this.a = wearBackupSettingsChimeraActivity0;
        super();
    }

    @Override  // aqgk
    public final void a(int v) {
        WearBackupSettingsChimeraActivity.j.d("backup finish resultCode= " + v, new Object[0]);
        fcuq fcuq0 = new fcuq(this);
        this.a.runOnUiThread(fcuq0);
    }

    @Override  // aqgk
    public final void b(float f) {
        WearBackupSettingsChimeraActivity.j.d("backup totalProgressFraction= " + f, new Object[0]);
    }

    @Override  // aqgk
    public final void c(int v, int v1) {
        WearBackupSettingsChimeraActivity.j.d("backup totalNumberOfPackages= %d , numberOfProcessedPackages= %d", new Object[]{v, v1});
    }
}

