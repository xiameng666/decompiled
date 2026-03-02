import android.bluetooth.BluetoothDevice;
import j..util.Objects;

final class cylp extends gxum {
    final cylw a;

    public cylp(cylw cylw0) {
        Objects.requireNonNull(cylw0);
        this.a = cylw0;
        super("RegisterEventStreamListener");
    }

    @Override
    public final void run() {
        cylw cylw0 = this.a;
        cylw0.o.f(cylw0);
        for(Object object0: cylw0.o.e()) {
            cylw0.u(((BluetoothDevice)object0));
        }
    }
}

