import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import j..time.Instant;
import j..util.Objects;

final class gxxo implements gxxt {
    final int a;
    final long b;
    final jqt c;

    public gxxo(gxxu gxxu0, int v, long v1, jqt jqt0) {
        this.a = v;
        this.b = v1;
        this.c = jqt0;
        Objects.requireNonNull(gxxu0);
        super();
    }

    @Override  // gxxt
    public final void a(int v, int v1, int v2, BluetoothDevice bluetoothDevice0) {
    }

    @Override  // gxxt
    public final void b(BluetoothDevice bluetoothDevice0) {
    }

    @Override  // gxxt
    public final void c(BluetoothDevice bluetoothDevice0, int v) {
    }

    @Override  // gxxt
    public final void d(int v, BluetoothProfile bluetoothProfile0) {
        if(v == this.a && bluetoothProfile0 != null) {
            ((ggtj)((ggtj)gxxg.a.h()).ar(20061)).A("BTConnStateMgr: tryReconnectProxy reconnect successful. Latency=%dms", Instant.now().minusMillis(this.b).toEpochMilli());
            this.c.b(bluetoothProfile0);
        }
    }

    @Override  // gxxt
    public final void jl() {
    }
}

