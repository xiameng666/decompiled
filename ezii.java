import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.google.android.gms.trustagent.trustlet.device.ui.TrustedUiDevice.DeviceReference;
import com.google.android.gms.trustagent.trustlet.device.ui.TrustedUiDevice;
import j..util.Optional;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ezii implements Function {
    public final BluetoothAdapter a;
    public final ezck b;

    public ezii(BluetoothAdapter bluetoothAdapter0, ezck ezck0) {
        this.a = bluetoothAdapter0;
        this.b = ezck0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        String s2;
        ggdy ggdy0 = new ggdy();
        ezck ezck0 = this.b;
        BluetoothAdapter bluetoothAdapter0 = this.a;
        if(bluetoothAdapter0 != null && bluetoothAdapter0.getState() == 12) {
            BluetoothDevice bluetoothDevice0 = bluetoothAdapter0.getRemoteDevice(((String)object0));
            if(bluetoothDevice0 == null) {
                ((ggtj)TrustedUiDevice.a.i()).B("Failed to add Bluetooth device as trusted device, invalid Bluetooth address specified: %s", ((String)object0));
                return Optional.empty();
            }
            ggdy0.i(new TrustedUiDevice.DeviceReference(bluetoothDevice0.getAddress(), bluetoothDevice0));
            String s = ezka.b(bluetoothDevice0);
            if(bluetoothDevice0.isConnected()) {
                return ezck0.m("auth_trust_agent_pref_bluetooth_device_needs_security_approval_key_" + ((String)object0)) ? Optional.of(new TrustedUiDevice(ggdy0.h(), s, 2)) : Optional.of(new TrustedUiDevice(ggdy0.h(), s, 1));
            }
            return Optional.of(new TrustedUiDevice(ggdy0.h(), s, 0));
        }
        ggdy0.i(new TrustedUiDevice.DeviceReference(((String)object0), null));
        for(Object object1: ezck0.b()) {
            String s1 = (String)object1;
            if(((String)object0).equals(((String)Optional.of(s1).filter(new ezjk()).map(new ezjl()).orElse(null)))) {
                synchronized(((ezbn)ezck0).b) {
                    s2 = ((ezbn)ezck0).d.getString(s1, ((String)object0));
                }
                return Optional.of(new TrustedUiDevice(ggdy0.h(), s2, 3));
            }
        }
        return Optional.of(new TrustedUiDevice(ggdy0.h(), ((String)object0), 3));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

