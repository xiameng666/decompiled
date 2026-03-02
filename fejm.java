import android.bluetooth.BluetoothDevice;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

public final class fejm extends fegi {
    static final UUID c;
    static final UUID d;
    static final UUID e;
    final fegf f;
    final fegf g;
    public volatile int h;
    public volatile BluetoothDevice i;
    public volatile long j;
    public volatile feii k;

    static {
        fejm.c = UUID.fromString("C9C92447-8F77-4C63-9C79-25E71B4CA9B3");
        fejm.d = UUID.fromString("ABDD3056-28FA-441D-A470-55A75A52553A");
        fejm.e = UUID.fromString("DCDB8A07-4840-4A95-A880-CFC37DA10542");
    }

    public fejm(boolean z) {
        super(fejm.c);
        this.h = 0;
        this.k = null;
        this.j = 0L;
        if(z) {
            fejj fejj0 = new fejj(this);
            fejk fejk0 = new fejk();
            this.f = new fegf(fejm.d, 6, 17, fejj0, fejk0);
        }
        else {
            fejl fejl0 = new fejl(this);
            this.f = new fegf(fejm.d, 2, 1, fejl0, null);
        }
        this.g = new fegf(fejm.e, 16, 0, null, null);
    }

    @Override  // fegi
    public final boolean b(BluetoothDevice bluetoothDevice0) {
        return this.i == null || this.i.equals(bluetoothDevice0);
    }

    @Override  // fegi
    public final void c(int v) {
        if(this.k != null) {
            feil feil0 = this.k.a;
            feil.f(("GATT client " + (v == 2 ? "connected" : "disconnected")));
            feil0.x((v == 2 ? 5 : 6));
        }
    }

    public final void d(int v) {
        ffmn.a("L2capPsmService", "PSM Changed: %d -> %d", new Object[]{((int)this.h), v});
        this.h = v;
        byte[] arr_b = fejm.f(v);
        ffmn.a("L2capPsmService", "PSM notification result: %b", new Object[]{Boolean.valueOf(this.f.b(arr_b))});
    }

    public final void e() {
        ffmn.a("L2capPsmService", "Ping client", new Object[0]);
        this.j = SystemClock.elapsedRealtime();
        this.g.b(new byte[0]);
    }

    public static byte[] f(int v) {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(2);
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer0.putShort(((short)(((char)v))));
        return byteBuffer0.array();
    }
}

