import android.text.TextUtils;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInChimeraActivity;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;

public final class fctk implements acn {
    public final WearBackupOptInChimeraActivity a;

    public fctk(WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity0) {
        this.a = wearBackupOptInChimeraActivity0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        if(TextUtils.isEmpty(((String)object0))) {
            return;
        }
        WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity0 = this.a;
        gftb.z(wearBackupOptInChimeraActivity0.q, "BackupStatus cache is null.");
        fext fext0 = wearBackupOptInChimeraActivity0.q;
        if(fext0.c) {
            String s = (fext0.e == null ? fexr.a : fext0.e).c;
            gftb.check(((String)object0));
            if(gfqz.e(s, ((String)object0))) {
                WearBackupOptInChimeraActivity.j.j("Backup already enabled for %s, opening backup settings", new Object[]{baun.q(((String)object0))});
                wearBackupOptInChimeraActivity0.startActivity(WearBackupSettingsChimeraActivity.b());
                wearBackupOptInChimeraActivity0.finish();
                return;
            }
        }
        wearBackupOptInChimeraActivity0.g(((String)object0), wearBackupOptInChimeraActivity0.q);
    }
}

