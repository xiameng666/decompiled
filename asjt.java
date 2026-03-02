import androidx.preference.Preference;
import com.google.android.gms.backup.settings.devicedata.BackupSettingsDeviceDataFragment;

public final class asjt implements ohi {
    public final BackupSettingsDeviceDataFragment a;

    public asjt(BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment0) {
        this.a = backupSettingsDeviceDataFragment0;
    }

    @Override  // ohi
    public final boolean b(Preference preference0, Object object0) {
        ibuq.f(preference0, "<unused var>");
        this.a.Q().a(0x406FE, new aspn());
        askr askr0 = this.a.N();
        grjo grjo0 = BackupSettingsDeviceDataFragment.X(false);
        ibuq.f(grjo0, "androidBackupSettingsFragmentTextDetails");
        asdv asdv0 = (asdv)((aqqh)askr0.i.b()).b();
        if(!(asdv0 instanceof asdu)) {
            ((ggtj)askr.a.i()).x("Tried to enable device data backup without an account.");
            return true;
        }
        askq askq0 = new askq(askr0, asdv0, grjo0, null);
        icbb.b(askr0.f, null, null, askq0, 3);
        return true;
    }
}

