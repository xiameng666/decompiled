import android.bluetooth.BluetoothDevice;

public final class cylm implements Runnable {
    public final cylw a;
    public final BluetoothDevice b;
    public final long c;

    public cylm(cylw cylw0, BluetoothDevice bluetoothDevice0, long v) {
        this.a = cylw0;
        this.b = bluetoothDevice0;
        this.c = v;
    }

    @Override
    public final void run() {
        cylw cylw0 = this.a;
        if(cylw0.n(this.b.getAddress()) != null) {
            cylw0.l = this.c;
        }
    }
}

