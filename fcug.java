import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;

public final class fcug implements View.OnClickListener {
    public final WearBackupSettingsChimeraActivity a;
    public final fext b;

    public fcug(WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity0, fext fext0) {
        this.a = wearBackupSettingsChimeraActivity0;
        this.b = fext0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        acp acp0 = this.a.s;
        gftb.check(acp0);
        acp0.b(this.b);
    }
}

