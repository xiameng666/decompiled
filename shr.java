import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.android.settingslib.bluetooth.devicesettings.DeviceInfo;
import com.android.settingslib.bluetooth.devicesettings.DeviceSettingsConfigServiceStatus;

public final class shr extends wby implements IInterface {
    final shj a;

    public shr() {
        super("com.android.settingslib.bluetooth.devicesettings.IDeviceSettingsConfigProviderService");
    }

    public shr(shj shj0) {
        this.a = shj0;
        super("com.android.settingslib.bluetooth.devicesettings.IDeviceSettingsConfigProviderService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        Object object0;
        if(v == 1) {
            DeviceInfo deviceInfo0 = (DeviceInfo)wbz.a(parcel0, DeviceInfo.CREATOR);
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                object0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.android.settingslib.bluetooth.devicesettings.IGetDeviceSettingsConfigCallback");
                object0 = (iInterface0 instanceof shv) ? ((shv)iInterface0) : new shu(iBinder0);
            }
            shr.gr(parcel0);
            ibuq.f(deviceInfo0, "device");
            ibuq.f(object0, "callback");
            shj shj0 = this.a;
            Context context0 = shj0.getBaseContext();
            ibuq.e(context0, "getBaseContext(...)");
            shp.a(context0);
            shi shi0 = new shi(object0);
            ibuq.f(deviceInfo0, "deviceInfo");
            bksc bksc0 = shj0.a;
            if(bksc0.d) {
                DeviceSettingsConfigServiceStatus deviceSettingsConfigServiceStatus0 = new DeviceSettingsConfigServiceStatus();
                ibuq.e(deviceInfo0.a, "getBluetoothAddress(...)");
                shi0.a(deviceSettingsConfigServiceStatus0, shj0.a(deviceInfo0.a));
            }
            else {
                bksc0.c.put(deviceInfo0.a, shi0);
                bkrh.a.d().x("FastPairDeviceSettingsConfigProviderChimeraService: Discovery Service hasn\'t started yet, callback will be called when it is connected");
            }
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

