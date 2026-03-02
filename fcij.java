import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.widget.Switch;
import com.google.android.gms.wearable.backup.phone.BackupSettingsChimeraActivity;

public final class fcij implements DialogInterface.OnClickListener {
    public final BackupSettingsChimeraActivity a;

    public fcij(BackupSettingsChimeraActivity backupSettingsChimeraActivity0) {
        this.a = backupSettingsChimeraActivity0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        BackupSettingsChimeraActivity.j.j("User confirmed disabling backup", new Object[0]);
        Switch switch0 = (Switch)this.a.findViewById(0x7F0B0CA4);  // id:bbg1_switch
        switch0.setEnabled(false);
        this.a.w.setClickable(false);
        evql evql0 = this.a.t.a(this.a.r, BackupSettingsChimeraActivity.k);
        evql0.b(new fcin(this.a));
        evql0.A(new fcio(this.a, switch0));
    }
}

