import android.bluetooth.BluetoothDevice;

public final class cykq implements bbqb {
    public final cylw a;

    public cykq(cylw cylw0) {
        this.a = cylw0;
    }

    @Override  // bbqb
    public final boolean a(Object object0) {
        gged_interceptors gged0 = gxuo.v(this.a.e.b);
        return gged0 != null && !gged0.isEmpty() && gged0.contains(((BluetoothDevice)object0));
    }
}

