import android.content.Intent;
import com.google.android.gms.backup.settings.devicedata.BackupSettingsDeviceDataFragment;

public final class asjx implements ibth {
    public final BackupSettingsDeviceDataFragment a;
    public final asdv b;

    public asjx(BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment0, asdv asdv0) {
        this.a = backupSettingsDeviceDataFragment0;
        this.b = asdv0;
    }

    @Override  // ibth
    public final Object a() {
        asdv asdv0 = this.b;
        if(asdv0 != null) {
            BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment0 = this.a;
            Intent intent0 = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.backup.SetBackupAccountActivity");
            ibuq.e(intent0, "setClassName(...)");
            asmv asmv0 = (asmv)((aqqh)backupSettingsDeviceDataFragment0.N().g.b()).b();
            if((asdv0 instanceof asdu) && (asmv0 != null && asmv0.a)) {
                intent0.putExtra("currentBackupAccount", ((asdu)asdv0).a).putExtra("showConfirmationDialogOnAccountChange", true);
            }
            else {
                intent0.putExtra("returnBackupAccountWithIntent", true);
            }
            backupSettingsDeviceDataFragment0.ak.b(intent0);
        }
        return ibom.a;
    }
}

