import android.widget.TextView;
import com.google.android.gms.wearable.backup.phone.BackupOptInChimeraActivity;

public final class fchg implements evqf {
    public final BackupOptInChimeraActivity a;

    public fchg(BackupOptInChimeraActivity backupOptInChimeraActivity0) {
        this.a = backupOptInChimeraActivity0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        long v = ((fexu)object0).c;
        BackupOptInChimeraActivity backupOptInChimeraActivity0 = this.a;
        TextView textView0 = (TextView)backupOptInChimeraActivity0.findViewById(0x7F0B20F1);  // id:storage_header
        if(textView0 == null) {
            return;
        }
        textView0.setText(backupOptInChimeraActivity0.getString(0x7F1504A7, new Object[]{fcgd.b(backupOptInChimeraActivity0, v)}));  // string:backup_opt_in_storage_header "Use your %1$s of Google Account storage to 
                                                                                                                                     // back up:"
    }
}

