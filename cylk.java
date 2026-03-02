import android.bluetooth.BluetoothDevice;

public final class cylk implements Runnable {
    public final cylw a;
    public final BluetoothDevice b;
    public final int c;
    public final int d;
    public final int e;

    public cylk(cylw cylw0, BluetoothDevice bluetoothDevice0, int v, int v1, int v2) {
        this.a = cylw0;
        this.b = bluetoothDevice0;
        this.c = v;
        this.d = v1;
        this.e = v2;
    }

    @Override
    public final void run() {
        cylw cylw0 = this.a;
        BluetoothDevice bluetoothDevice0 = this.b;
        if(cylw0.B(bluetoothDevice0.getAddress())) {
            ggtj ggtj0 = (ggtj)cylw0.n.d().ar(7850);
            String s = fgjo.c(bluetoothDevice0);
            String s1 = cylw.q(this.d);
            String s2 = cylw.q(this.e);
            ggtj0.Y("NearbyDeviceManager: SassDevice %s profile %d onConnectionStatusChanged from %s to %s", s, Integer.valueOf(this.c), s1, s2);
        }
    }
}

