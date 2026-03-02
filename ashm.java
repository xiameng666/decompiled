import android.net.Uri;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import com.google.android.gms.backup.settings.component.BackupSettingsChimeraActivity;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.Collections;

public final class ashm implements MenuItem.OnMenuItemClickListener {
    public final BackupSettingsChimeraActivity a;

    public ashm(BackupSettingsChimeraActivity backupSettingsChimeraActivity0) {
        this.a = backupSettingsChimeraActivity0;
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        BackupSettingsChimeraActivity backupSettingsChimeraActivity0 = this.a;
        if(hqmi.c()) {
            backupSettingsChimeraActivity0.j = "android_backup";
            backupSettingsChimeraActivity0.k = "https://support.google.com/mobile/?p=android_backup";
        }
        GoogleHelp googleHelp0 = new GoogleHelp(backupSettingsChimeraActivity0.j);
        googleHelp0.b(backupSettingsChimeraActivity0.getContainerActivity());
        googleHelp0.s = bbhd.a();
        googleHelp0.q = Uri.parse(backupSettingsChimeraActivity0.k);
        if(hqmi.c()) {
            googleHelp0.R = new ashn(backupSettingsChimeraActivity0, bbnp.m(backupSettingsChimeraActivity0));
            backupSettingsChimeraActivity0.l.a(googleHelp0.a());
            return true;
        }
        if(bbnp.m(backupSettingsChimeraActivity0)) {
            googleHelp0.e(Collections.singletonMap("genie-eng:app_pkg_name", "com.google.android.settings.gphone"));
        }
        else {
            googleHelp0.e(Collections.singletonMap("genie-eng:app_pkg_name", "com.android.settings"));
        }
        backupSettingsChimeraActivity0.startActivity(googleHelp0.a());
        return true;
    }
}

