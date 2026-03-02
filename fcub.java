import android.text.TextUtils;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInChimeraActivity;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;

public final class fcub implements acn {
    public final WearBackupSettingsChimeraActivity a;

    public fcub(WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity0) {
        this.a = wearBackupSettingsChimeraActivity0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        if(!TextUtils.isEmpty(((String)object0))) {
            WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity0 = this.a;
            gftb.check(((String)object0));
            String s = wearBackupSettingsChimeraActivity0.w;
            gftb.check(s);
            if(!gfqz.e(((String)object0), s)) {
                WearBackupSettingsChimeraActivity.j.j("User chose to change account, opening backup opt-in screen", new Object[0]);
                wearBackupSettingsChimeraActivity0.startActivity(WearBackupOptInChimeraActivity.a(((String)object0)));
            }
        }
    }
}

