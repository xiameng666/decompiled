import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.wearable.backup.phone.BackupSettingsChimeraActivity;

public final class fcic implements View.OnClickListener {
    public final BackupSettingsChimeraActivity a;

    public fcic(BackupSettingsChimeraActivity backupSettingsChimeraActivity0) {
        this.a = backupSettingsChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        BackupSettingsChimeraActivity.j.j("Backup on-off toggle clicked, showing confirmation pop-up", new Object[0]);
        fyju fyju0 = new fyju(fczo.b(this.a, this.a.x), 0x7F160DD5);  // style:ThemeOverlay.GoogleMaterial3.MaterialAlertDialog.Centered
        fyju0.O("Turn off and delete backup?");
        fyju0.D("Your watch backup will be permanently deleted from your cloud storage.");
        fyju0.z(0x7F080B68);  // drawable:quantum_gm_ic_error_outline_vd_theme_24
        fyju0.M("Turn off & delete", new fcij(this.a));
        fyju0.G("Cancel", null);
        fyju0.create().show();
    }
}

