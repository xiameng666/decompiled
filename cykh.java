import android.bluetooth.BluetoothDevice;

public final class cykh implements Runnable {
    public final cylw a;
    public final BluetoothDevice b;

    public cykh(cylw cylw0, BluetoothDevice bluetoothDevice0) {
        this.a = cylw0;
        this.b = bluetoothDevice0;
    }

    @Override
    public final void run() {
        cylw cylw0 = this.a;
        BluetoothDevice bluetoothDevice0 = this.b;
        cyna cyna0 = cylw0.n(bluetoothDevice0.getAddress());
        if(cyna0 != null) {
            cyna0.p(false);
            cylw0.b.f.b(cyna0.b, 0);
            ((ggtj)cylw0.n.d().ar(7853)).B("NearbyDeviceManager: SassDevice %s EventStream disconnected", fgjo.c(bluetoothDevice0));
        }
    }
}

