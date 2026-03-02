import android.app.Service;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.settingslib.bluetooth.devicesettings.DeviceSettingsConfig;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.List;

public final class shj extends Service {
    final bksc a;

    public shj() {
        throw null;
    }

    public shj(bksc bksc0, Context context0) {
        ibuq.f(context0, "context");
        this.a = bksc0;
        super();
        this.attachBaseContext(context0);
    }

    public final DeviceSettingsConfig a(String s) {
        DeviceDetailsLinks deviceDetailsLinks0;
        Intent intent0;
        ibuq.f(s, "bluetoothAddress");
        if(hvpp.Z()) {
            BluetoothDevice bluetoothDevice0 = this.b(s);
            if(bluetoothDevice0 != null && ibuq.m(cyan.a(bluetoothDevice0, "TEMP_BOND_TYPE"), "le_audio_sharing")) {
                bkrh.a.d().B("FastPairDeviceSettingsConfigProviderChimeraService: Device %s is a temporary bond device, return the config with only the temporary bond footer", s);
                return new DeviceSettingsConfig(bksa.j, ibps.a, null, null, 56);
            }
        }
        gxuv gxuv0 = this.a.e;
        String s1 = gxuv0.b(s);
        boolean z = bbnp.m(this.a.b);
        if(s1 != null) {
            try {
                intent0 = null;
                deviceDetailsLinks0 = gxuv0.a(s1);
            }
            catch(RemoteException remoteException0) {
                ((ggtj)bkrh.a.d().s(remoteException0)).x("FastPairDeviceSettingsConfigProviderChimeraService: Update device details failed due to RemoteException");
                deviceDetailsLinks0 = null;
            }
            if(deviceDetailsLinks0 == null) {
                bkrh.a.d().B("FastPairDeviceSettingsConfigProviderChimeraService: No data found for deviceDetailsLinks, return the AOSP config for device %s", s);
                return this.c(s, z);
            }
            String s2 = deviceDetailsLinks0.c();
            cust cust0 = bkrh.a;
            if(!ibuq.m(bktt.a(s2, cust0), "com.google.android.apps.wearables.maestro.companion")) {
                cust0.d().B("FastPairDeviceSettingsConfigProviderChimeraService: Device %s is not a Maestro device but supports Fast Pair, return the Fast Pair config", s);
                if(hvpp.K()) {
                    return shh.a(new bkrx(z, this.d(s)));
                }
                return this.d(s) ? new DeviceSettingsConfig(bksa.c, ibps.a, null, null, 56) : new DeviceSettingsConfig(bksa.d, ibps.a, null, null, 56);
            }
            String s3 = gxvy.c(deviceDetailsLinks0.c());
            Context context0 = this.a.b;
            String s4 = gxup.d(context0, s3);
            if(s3 != null) {
                intent0 = context0.getPackageManager().getLaunchIntentForPackage(s3);
            }
            boolean z1 = intent0 != null && !TextUtils.isEmpty(s4);
            cust0.d().B("FastPairDeviceSettingsConfigProviderChimeraService: Device %s is a Maestro device, return the Maestro config", s);
            if(hvpp.a.f().ak()) {
                ibuq.f(context0, "context");
                return shh.a(new bkru(z, context0, z1));
            }
            return z1 ? new DeviceSettingsConfig(bksa.e, bksa.f, bksa.g, null, 56) : new DeviceSettingsConfig(bksa.h, bksa.i, null, null, 56);
        }
        bkrh.a.g().x("FastPairDeviceSettingsConfigProviderChimeraService: No data found for device address, return the AOSP config for device %s");
        return this.c(s, z);
    }

    private final BluetoothDevice b(String s) {
        bsaq bsaq0 = cumz.e(this.a.b, "FastPairDeviceSettingsConfigProviderChimeraService");
        if(bsaq0 == null) {
            return null;
        }
        try {
            return bsaq0.g(s);
        }
        catch(IllegalArgumentException unused_ex) {
            bkrh.a.d().B("FastPairDeviceSettingsConfigProviderChimeraService: Cannot get BluetoothDevice from %s", s);
            return null;
        }
    }

    private final DeviceSettingsConfig c(String s, boolean z) {
        Integer integer0 = null;
        BluetoothDevice bluetoothDevice0 = this.b(s);
        if(bluetoothDevice0 == null) {
            return hvpp.K() ? bksa.a(false, z) : new DeviceSettingsConfig(bksa.b, ibps.a, null, null, 56);
        }
        if(hvpp.K()) {
            List list0 = bksc.a;
            BluetoothClass bluetoothClass0 = bluetoothDevice0.getBluetoothClass();
            if(bluetoothClass0 != null) {
                integer0 = bluetoothClass0.getDeviceClass();
            }
            return bksa.a(ibpo.aB(list0, integer0), z);
        }
        List list1 = bksc.a;
        BluetoothClass bluetoothClass1 = bluetoothDevice0.getBluetoothClass();
        if(bluetoothClass1 != null) {
            integer0 = bluetoothClass1.getDeviceClass();
        }
        return ibpo.aB(list1, integer0) ? new DeviceSettingsConfig(bksa.a, ibps.a, null, null, 56) : new DeviceSettingsConfig(bksa.b, ibps.a, null, null, 56);
    }

    private final boolean d(String s) {
        BluetoothDevice bluetoothDevice0 = this.b(s);
        if(bluetoothDevice0 == null) {
            return false;
        }
        byte[] arr_b = bluetoothDevice0.getMetadata(17);
        if(arr_b == null) {
            return false;
        }
        String s1 = new String(arr_b, ibyo.a);
        return ibuq.m(s1, "Headset") || ibuq.m(s1, "Untethered Headset");
    }

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent0) {
        ibuq.f(intent0, "intent");
        return new shr(this);
    }
}

