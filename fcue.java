import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;

public final class fcue implements View.OnClickListener {
    public final WearBackupSettingsChimeraActivity a;

    public fcue(WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity0) {
        this.a = wearBackupSettingsChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        WearBackupSettingsChimeraActivity.j.j("Backup on-off toggle clicked, showing confirmation pop-up", new Object[0]);
        acp acp0 = this.a.r;
        gftb.check(acp0);
        acp0.b(new fctb("Turn off and delete backup?", "Your watch backup will be permanently deleted from your cloud storage.", 0, false));
    }
}

