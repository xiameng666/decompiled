import android.content.Intent;
import com.google.android.gms.wearable.backup.phone.BackupOptInChimeraActivity;
import com.google.android.gms.wearable.backup.phone.BackupSettingsChimeraActivity;

public final class fcin implements evqf {
    public final BackupSettingsChimeraActivity a;

    public fcin(BackupSettingsChimeraActivity backupSettingsChimeraActivity0) {
        this.a = backupSettingsChimeraActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        BackupSettingsChimeraActivity.j.h("Backup successfully disabled", new Object[0]);
        Intent intent0 = BackupOptInChimeraActivity.a(this.a.r, null, null, this.a.y);
        this.a.startActivity(intent0);
        this.a.finish();
    }
}

