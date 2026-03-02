import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.backup.settings.devicedata.BackupSettingsDeviceDataFragment;

public final class asjm implements View.OnClickListener {
    public final BackupSettingsDeviceDataFragment a;

    public asjm(BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment0) {
        this.a = backupSettingsDeviceDataFragment0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fm fm0 = this.a.getChildFragmentManager();
        ibuq.e(fm0, "getChildFragmentManager(...)");
        ibuq.f(fm0, "fragmentManager");
        new askw().showNow(fm0, "how_data_is_protected_dialog");
    }
}

