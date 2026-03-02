import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.backup.BackUpNowConfig;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;

public final class fcuj implements View.OnClickListener {
    public final WearBackupSettingsChimeraActivity a;
    public final View b;
    public final View c;

    public fcuj(WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity0, View view0, View view1) {
        this.a = wearBackupSettingsChimeraActivity0;
        this.b = view0;
        this.c = view1;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.b.setEnabled(false);
        this.c.setVisibility(0);
        aqdy aqdy0 = new aqdy();
        aqdy0.d = true;
        BackUpNowConfig backUpNowConfig0 = new BackUpNowConfig(aqdy0);
        this.a.u.b(backUpNowConfig0);
    }
}

