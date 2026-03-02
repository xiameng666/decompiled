import com.google.android.gms.wearable.backup.phone.BackupSettingsChimeraActivity;

public final class fchw implements evqf {
    public final BackupSettingsChimeraActivity a;

    public fchw(BackupSettingsChimeraActivity backupSettingsChimeraActivity0) {
        this.a = backupSettingsChimeraActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        String s = (String)object0;
        BackupSettingsChimeraActivity.j.j("Got watch Bluetooth alias " + s, new Object[0]);
        this.a.s = s;
    }
}

