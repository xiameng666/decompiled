import android.content.Intent;
import com.google.android.gms.backup.settings.devicedata.BackupSettingsDeviceDataFragment;

final class aska extends ibuo implements ibts {
    public aska(Object object0) {
        super(1, object0, BackupSettingsDeviceDataFragment.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Intent intent0 = (Intent)object0;
        ibuq.f(intent0, "p0");
        ((BackupSettingsDeviceDataFragment)this.e).startActivity(intent0);
        return ibom.a;
    }
}

