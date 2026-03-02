import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;

final class cyog implements gxxt, AutoCloseable, kar {
    private final BluetoothDevice a;
    private final int b;
    private final gxxu c;
    private Runnable d;

    public cyog(BluetoothDevice bluetoothDevice0, int v, gxxu gxxu0) {
        this.a = bluetoothDevice0;
        this.b = v;
        this.c = gxxu0;
    }

    @Override  // gxxt
    public final void a(int v, int v1, int v2, BluetoothDevice bluetoothDevice0) {
        ggtj ggtj0 = (ggtj)cyjh.a.d().ar(0x1F04);
        String s = fgjo.c(bluetoothDevice0);
        ggtj0.Y("SassDeviceConnectionHelper: For profile=%d of %s, connection state change from %d to %d", Integer.valueOf(v), gxyf.b(gxye.a, s), Integer.valueOf(v1), Integer.valueOf(v2));
        if(this.a.equals(bluetoothDevice0) && v == this.b && v2 == 2) {
            Runnable runnable0 = this.d;
            if(runnable0 != null) {
                runnable0.run();
            }
        }
    }

    @Override  // kar
    public final void accept(Object object0) {
        this.d = (Runnable)object0;
    }

    @Override  // gxxt
    public final void b(BluetoothDevice bluetoothDevice0) {
    }

    @Override  // gxxt
    public final void c(BluetoothDevice bluetoothDevice0, int v) {
    }

    @Override
    public final void close() {
        this.d = null;
        this.c.n(this);
    }

    @Override  // gxxt
    public final void d(int v, BluetoothProfile bluetoothProfile0) {
    }

    final void f() {
        this.c.k(this, true);
    }

    @Override  // gxxt
    public final void jl() {
    }
}

