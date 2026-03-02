import com.google.android.gms.wearable.backup.phone.BackupSettingsChimeraActivity;

public final class fcil implements evqc {
    public final BackupSettingsChimeraActivity a;

    public fcil(BackupSettingsChimeraActivity backupSettingsChimeraActivity0) {
        this.a = backupSettingsChimeraActivity0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        BackupSettingsChimeraActivity.j.g("Failed to start backup now", exception0, new Object[0]);
        fcgr.b(this.a, 0x7F1508E3, this.a.x);  // string:common_something_went_wrong "Something went wrong"
    }
}

