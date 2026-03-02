import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;

public final class eyee {
    public static final eyed a(Context context0) {
        ibuq.f(context0, "context");
        if(bbqa.c() && context0.getPackageManager().hasSystemFeature("android.software.secure_lock_screen")) {
            BluetoothManager bluetoothManager0 = (BluetoothManager)context0.getSystemService(BluetoothManager.class);
            if((bluetoothManager0 == null ? null : bluetoothManager0.getAdapter()) != null && eyef.b(context0)) {
                DevicePolicyManager devicePolicyManager0 = (DevicePolicyManager)context0.getSystemService(DevicePolicyManager.class);
                if(devicePolicyManager0 != null && (devicePolicyManager0.getKeyguardDisabledFeatures(null) & 16) != 0) {
                    return eyed.b;
                }
                KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService(KeyguardManager.class);
                if(keyguardManager0 != null && keyguardManager0.isDeviceSecure()) {
                    Intent intent0 = new Intent().setClassName(context0, "com.google.android.gms.auth.trustagent.ActiveUnlockTrustAgent");
                    ibuq.e(intent0, "setClassName(...)");
                    if(!context0.stopService(intent0)) {
                        return eyed.c;
                    }
                }
                if(cjmf.b(context0, "android.permission.BLUETOOTH_CONNECT") == 0) {
                    BluetoothManager bluetoothManager1 = (BluetoothManager)context0.getSystemService(BluetoothManager.class);
                    if(bluetoothManager1 != null) {
                        BluetoothAdapter bluetoothAdapter0 = bluetoothManager1.getAdapter();
                        if(bluetoothAdapter0 != null && bluetoothAdapter0.isEnabled()) {
                            if(homc.a.j().F()) {
                                KeyguardManager keyguardManager1 = (KeyguardManager)context0.getSystemService(KeyguardManager.class);
                                return keyguardManager1 != null && keyguardManager1.isDeviceSecure() ? eyed.g : eyed.f;
                            }
                            return eyed.g;
                        }
                    }
                    return eyed.e;
                }
                return eyed.d;
            }
        }
        return eyed.a;
    }
}

