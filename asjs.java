import androidx.preference.Preference;
import com.google.android.gms.backup.settings.devicedata.BackupSettingsDeviceDataFragment;

public final class asjs implements ohi {
    public final BackupSettingsDeviceDataFragment a;

    public asjs(BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment0) {
        this.a = backupSettingsDeviceDataFragment0;
    }

    @Override  // ohi
    public final boolean b(Preference preference0, Object object0) {
        ibuq.f(preference0, "<unused var>");
        fm fm0 = this.a.getChildFragmentManager();
        ibuq.e(fm0, "getChildFragmentManager(...)");
        ibuq.f(fm0, "fragmentManager");
        new aslc().showNow(fm0, "turn_off_backup_dialog");
        return true;
    }
}

