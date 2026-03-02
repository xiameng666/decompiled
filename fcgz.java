import com.google.android.gms.wearable.backup.phone.BackupOptInChimeraActivity;

public final class fcgz implements evqc {
    public final BackupOptInChimeraActivity a;

    public fcgz(BackupOptInChimeraActivity backupOptInChimeraActivity0) {
        this.a = backupOptInChimeraActivity0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        BackupOptInChimeraActivity.j.g("Failed to get connected nodes", exception0, new Object[0]);
        fcgr.b(this.a, 0x7F1508E3, this.a.w);  // string:common_something_went_wrong "Something went wrong"
    }
}

