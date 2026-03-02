import com.android.settingslib.bluetooth.devicesettings.DeviceSettingsConfig;
import com.android.settingslib.bluetooth.devicesettings.DeviceSettingsConfigServiceStatus;

final class shi extends ibuo implements ibtw {
    public shi(Object object0) {
        super(2, object0, shv.class, "onResult", "onResult(Lcom/android/settingslib/bluetooth/devicesettings/DeviceSettingsConfigServiceStatus;Lcom/android/settingslib/bluetooth/devicesettings/DeviceSettingsConfig;)V", 0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ((shv)this.e).a(((DeviceSettingsConfigServiceStatus)object0), ((DeviceSettingsConfig)object1));
        return ibom.a;
    }
}

