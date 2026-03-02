import android.bluetooth.BluetoothDevice;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.model.TrustableDevice;

public final class ezhj implements evpo {
    public final ggdy a;
    public final BluetoothDevice b;

    public ezhj(ggdy ggdy0, BluetoothDevice bluetoothDevice0) {
        this.a = ggdy0;
        this.b = bluetoothDevice0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        boolean z = evql0.n() && ((Boolean)evql0.j()).booleanValue();
        TrustableDevice trustableDevice0 = new TrustableDevice(this.b, z);
        this.a.i(trustableDevice0);
        return this.a;
    }
}

