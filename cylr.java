import android.bluetooth.BluetoothDevice;
import j..util.Objects;

final class cylr extends gxum {
    final BluetoothDevice a;
    final cylw b;

    public cylr(cylw cylw0, BluetoothDevice bluetoothDevice0) {
        this.a = bluetoothDevice0;
        Objects.requireNonNull(cylw0);
        this.b = cylw0;
        super("reconnect");
    }

    @Override
    public final void run() {
        cwrs cwrs0 = this.b.o;
        BluetoothDevice bluetoothDevice0 = this.a;
        if(!cwrs0.m(bluetoothDevice0)) {
            cwfa.a.d().B("EventStreamManager: reconnect called but device not connected, ignore, %s", gxyf.b(gxye.a, bluetoothDevice0));
            return;
        }
        cwrs0.g(bluetoothDevice0);
        cwrs0.j(bluetoothDevice0);
    }
}

