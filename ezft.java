import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService;
import j..util.Objects;

public final class ezft implements SharedPreferences.OnSharedPreferenceChangeListener {
    final BluetoothTrustletChimeraService a;

    public ezft(BluetoothTrustletChimeraService bluetoothTrustletChimeraService0) {
        Objects.requireNonNull(bluetoothTrustletChimeraService0);
        this.a = bluetoothTrustletChimeraService0;
        super();
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        if(s.startsWith("auth_trust_agent_pref_bluetooth_device_needs_security_approval_key_")) {
            String s1 = s.substring(67);
            if(s1 != null) {
                BluetoothTrustletChimeraService bluetoothTrustletChimeraService0 = this.a;
                if(bluetoothTrustletChimeraService0.d.contains("auth_trust_agent_pref_trusted_bluetooth_address" + s1) && bahu.a(bluetoothTrustletChimeraService0) != null) {
                    bluetoothTrustletChimeraService0.x(new ezgw(bahu.a(bluetoothTrustletChimeraService0).getRemoteDevice(s1)), true);
                }
            }
        }
        else {
            String s2 = ezka.a(s);
            if(s2 != null) {
                BluetoothTrustletChimeraService bluetoothTrustletChimeraService1 = this.a;
                if(bluetoothTrustletChimeraService1.d.contains(s) && bluetoothTrustletChimeraService1.d.getBoolean(s, false) && bahu.a(bluetoothTrustletChimeraService1) != null) {
                    bluetoothTrustletChimeraService1.x(new ezgw(bahu.a(bluetoothTrustletChimeraService1).getRemoteDevice(s2)), true);
                    return;
                }
                bluetoothTrustletChimeraService1.z(s2);
            }
        }
    }
}

