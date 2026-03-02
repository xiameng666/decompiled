import androidx.preference.TwoStatePreference;
import com.google.android.gms.backup.settings.devicedata.BackupSettingsDeviceDataFragment;
import com.google.android.gms.backup.settings.devicedata.storagemeter.StorageMeterPreference;

final class askb implements icih {
    final BackupSettingsDeviceDataFragment a;

    public askb(BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment0) {
        this.a = backupSettingsDeviceDataFragment0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if((((aqqh)object0) instanceof aqqf)) {
            aspy aspy0 = this.a.R();
            askk askk0 = (askk)((aqqf)(((aqqh)object0))).a;
            ibuq.f(aspy0, "<this>");
            ((TwoStatePreference)aspy0.a).k(askk0.a);
            StorageMeterPreference storageMeterPreference0 = this.a.P();
            ibuq.f(askk0.b, "storageInfo");
            storageMeterPreference0.a = askk0.b;
            storageMeterPreference0.d();
            StorageMeterPreference storageMeterPreference1 = this.a.P();
            storageMeterPreference1.b = new aska(this.a);
            this.a.U(true);
            return ibom.a;
        }
        this.a.U(false);
        return ibom.a;
    }
}

