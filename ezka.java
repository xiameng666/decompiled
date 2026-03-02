import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;

public final class ezka {
    public static final int a;

    static {
        bboh.b("TrustAgent", bbcu.aR);
    }

    public static String a(String s) {
        return s.startsWith("auth_trust_agent_pref_trusted_bluetooth_address") ? s.substring(0x2F) : null;
    }

    public static String b(BluetoothDevice bluetoothDevice0) {
        String s = bluetoothDevice0.getAlias();
        return TextUtils.isEmpty(s) ? bluetoothDevice0.getAddress() : s;
    }

    public static String c(BluetoothDevice bluetoothDevice0) {
        return ezka.d(bluetoothDevice0.getAddress());
    }

    public static String d(String s) {
        return "auth_trust_agent_pref_trusted_bluetooth_address" + s;
    }

    public static String e(BluetoothDevice bluetoothDevice0) {
        return ezka.f(bluetoothDevice0.getAddress());
    }

    public static String f(String s) {
        return "auth_trust_agent_pref_trusted_bluetooth_title" + s;
    }

    public static String g(String s) {
        return "is_bluetooth_device_connection_secure_" + s;
    }

    public static String h(String s) {
        return "auth_trust_agent_pref_bluetooth_device_needs_security_approval_key_" + s;
    }

    public static boolean i(BluetoothDevice bluetoothDevice0) {
        return bluetoothDevice0.isEncrypted() && bluetoothDevice0.isConnected();
    }

    public static boolean j() {
        return ezcn.a().a && ezka.k();
    }

    public static boolean k() {
        return bahu.a(AppContextProvider.a()) != null && hzca.c();
    }
}

