import android.bluetooth.BluetoothDevice;

public final class cykr implements Runnable {
    public final cylw a;
    public final BluetoothDevice b;

    public cykr(cylw cylw0, BluetoothDevice bluetoothDevice0) {
        this.a = cylw0;
        this.b = bluetoothDevice0;
    }

    @Override
    public final void run() {
        cylw cylw0 = this.a;
        BluetoothDevice bluetoothDevice0 = this.b;
        if(cylw0.B(bluetoothDevice0.getAddress())) {
            ((ggtj)cylw0.n.d().ar(7851)).B("NearbyDeviceManager: SassDevice %s onDeviceConnected", fgjo.c(bluetoothDevice0));
        }
    }
}

