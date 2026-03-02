import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothLeAudio;
import j..util.Optional;

public final class ezgo implements ezgl {
    public static final bboh a;
    private final BluetoothLeAudio b;

    static {
        ezgo.a = bboh.b("TrustAgent", bbcu.aR);
    }

    public ezgo(BluetoothLeAudio bluetoothLeAudio0) {
        this.b = bluetoothLeAudio0;
    }

    @Override  // ezgl
    public final int a(BluetoothDevice bluetoothDevice0) {
        return this.b.getGroupId(bluetoothDevice0);
    }

    @Override  // ezgl
    public final gged_interceptors b(int[] arr_v) {
        return (gged_interceptors)Optional.ofNullable(this.b.getDevicesMatchingConnectionStates(arr_v)).map(new ezgm()).orElseGet(new ezgn());
    }

    @Override
    public final void close() {
        this.b.close();
    }
}

