import android.bluetooth.BluetoothDevice;

public final class cykj implements Runnable {
    public final cylw a;
    public final BluetoothDevice b;
    public final int c;

    public cykj(cylw cylw0, BluetoothDevice bluetoothDevice0, int v) {
        this.a = cylw0;
        this.b = bluetoothDevice0;
        this.c = v;
    }

    @Override
    public final void run() {
        cylw cylw0 = this.a;
        BluetoothDevice bluetoothDevice0 = this.b;
        if(cylw0.B(bluetoothDevice0.getAddress())) {
            ((ggtj)cylw0.n.d().ar(7852)).R("NearbyDeviceManager: SassDevice %s onDeviceDisconnected, reason:%s", fgjo.c(bluetoothDevice0), gxxu.f(this.c));
        }
    }
}

