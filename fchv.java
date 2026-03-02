import android.content.Intent;
import com.google.android.gms.wearable.backup.phone.BackupOptInChimeraActivity;
import com.google.android.gms.wearable.backup.phone.BackupSettingsChimeraActivity;

public final class fchv implements evqf {
    public final BackupSettingsChimeraActivity a;
    public final fexr b;
    public final fext c;

    public fchv(BackupSettingsChimeraActivity backupSettingsChimeraActivity0, fexr fexr0, fext fext0) {
        this.a = backupSettingsChimeraActivity0;
        this.b = fexr0;
        this.c = fext0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        if(!gfqz.e(((fexs)object0).c, this.b.c)) {
            BackupSettingsChimeraActivity.j.j("User chose to change account, opening backup opt-in screen", new Object[0]);
            Intent intent0 = BackupOptInChimeraActivity.a(this.a.r, ((fexs)object0).c, this.c, this.a.y);
            this.a.startActivity(intent0);
        }
    }
}

