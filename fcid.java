import android.widget.TextView;
import com.google.android.gms.wearable.backup.phone.BackupSettingsChimeraActivity;
import com.google.android.material.progressindicator.LinearProgressIndicator;

public final class fcid implements evqf {
    public final BackupSettingsChimeraActivity a;

    public fcid(BackupSettingsChimeraActivity backupSettingsChimeraActivity0) {
        this.a = backupSettingsChimeraActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        fexu fexu0 = (fexu)object0;
        TextView textView0 = (TextView)this.a.findViewById(0x7F0B0A9C);  // id:account_storage_quota_text
        Object[] arr_object = {fcgd.a(this.a, fexu0.d), fcgd.b(this.a, fexu0.c)};
        textView0.setText(this.a.getString(0x7F1504B5, arr_object));  // string:backup_quota_label "%1$s of %2$s used"
        ((LinearProgressIndicator)this.a.findViewById(0x7F0B0A9A)).g(((int)(((double)fexu0.d) / ((double)fexu0.c) * 100.0)), true);  // id:account_storage_progress_bar
    }
}

