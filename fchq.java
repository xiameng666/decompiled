import android.os.Bundle;
import android.widget.ImageView;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.backup.phone.BackupSettingsChimeraActivity;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class fchq implements Consumer {
    public final BackupSettingsChimeraActivity a;
    public final Bundle b;

    public fchq(BackupSettingsChimeraActivity backupSettingsChimeraActivity0, Bundle bundle0) {
        this.a = backupSettingsChimeraActivity0;
        this.b = bundle0;
    }

    @Override
    public final void accept(Object object0) {
        BackupSettingsChimeraActivity backupSettingsChimeraActivity0 = this.a;
        backupSettingsChimeraActivity0.x = (AppTheme)object0;
        fczo.g(((AppTheme)object0), backupSettingsChimeraActivity0.getIntent(), backupSettingsChimeraActivity0);
        backupSettingsChimeraActivity0.setContentView(fczo.c(((AppTheme)object0), backupSettingsChimeraActivity0.getLayoutInflater()).inflate(0x7F0E021E, null, false));  // layout:companion_backup_settings_activity
        if(this.b == null && hzyp.a.b().s()) {
            backupSettingsChimeraActivity0.recreate();
        }
        if(backupSettingsChimeraActivity0.z && hzyp.d()) {
            ((ImageView)backupSettingsChimeraActivity0.findViewById(0x7F0B0C42)).setImageResource(0x7F080B26);  // id:back_icon
        }
        evql evql0 = backupSettingsChimeraActivity0.u.f();
        evql0.b(new fcht(backupSettingsChimeraActivity0));
        evql0.A(new fchu(backupSettingsChimeraActivity0));
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

