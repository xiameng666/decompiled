import android.bluetooth.BluetoothProfile;
import j..time.Instant;
import j..util.Objects;
import java.util.concurrent.atomic.AtomicReference;

final class gxxq implements gmbg {
    final AtomicReference a;
    final int b;
    final long c;
    final gxxu d;

    public gxxq(gxxu gxxu0, AtomicReference atomicReference0, int v, long v1) {
        this.a = atomicReference0;
        this.b = v;
        this.c = v1;
        Objects.requireNonNull(gxxu0);
        this.d = gxxu0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        gxxt gxxt0 = (gxxt)this.a.get();
        this.d.n(gxxt0);
        ggtj ggtj0 = (ggtj)((ggtj)((ggtj)gxxg.a.j()).s(throwable0)).ar(20063);
        long v = Instant.now().minusMillis(this.c).toEpochMilli();
        ggtj0.G("BTConnStateMgr: tryReconnectProxy reconnect profile %d failed. Latency=%dms", this.b, v);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        BluetoothProfile bluetoothProfile0 = (BluetoothProfile)object0;
        gxxt gxxt0 = (gxxt)this.a.get();
        this.d.n(gxxt0);
    }
}

