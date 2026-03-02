import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import java.util.HashSet;
import java.util.Set;

public final class fwvc {
    protected final BluetoothAdapter a;

    public fwvc(BluetoothAdapter bluetoothAdapter0) {
        this.a = bluetoothAdapter0;
    }

    public final Set a() {
        Set set0 = this.a.getBondedDevices();
        if(set0 == null) {
            return null;
        }
        Set set1 = new HashSet();
        for(Object object0: set0) {
            fwwn.h();
            fwxv fwxv0 = fwwn.i(((BluetoothDevice)object0));
            if(fwxv0 != null) {
                set1.add(fwxv0);
            }
        }
        return set1;
    }
}

