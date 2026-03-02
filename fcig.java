import android.widget.TextView;
import com.google.android.gms.wearable.backup.phone.BackupSettingsChimeraActivity;

public final class fcig implements evqc {
    public final BackupSettingsChimeraActivity a;

    public fcig(BackupSettingsChimeraActivity backupSettingsChimeraActivity0) {
        this.a = backupSettingsChimeraActivity0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        BackupSettingsChimeraActivity.j.g("Failed to get size and time stats data", exception0, new Object[0]);
        this.a.findViewById(0x7F0B0C5C).setVisibility(8);  // id:backup_details_section
        ((TextView)this.a.findViewById(0x7F0B0CA3)).setText(0x7F1504F7);  // id:bbg1_overall_stats_text
    }
}

