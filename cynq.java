import android.bluetooth.BluetoothProfile;
import java.util.concurrent.atomic.AtomicInteger;

public final class cynq implements jqv {
    public final cyoi a;
    public final int b;
    public final AtomicInteger c;
    public final boolean d;
    public final BluetoothProfile e;
    public final boolean f;
    public final short g;
    public final boolean h;
    public final boolean i;

    public cynq(cyoi cyoi0, int v, AtomicInteger atomicInteger0, boolean z, BluetoothProfile bluetoothProfile0, boolean z1, short v1, boolean z2, boolean z3) {
        this.a = cyoi0;
        this.b = v;
        this.c = atomicInteger0;
        this.d = z;
        this.e = bluetoothProfile0;
        this.f = z1;
        this.g = v1;
        this.h = z2;
        this.i = z3;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        cynt cynt0 = new cynt(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, jqt0, this.i);
        this.a.m.execute(cynt0);
        return "SassDeviceConnectionHelper.connectProfile";
    }
}

