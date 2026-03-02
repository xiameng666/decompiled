import android.bluetooth.BluetoothDevice;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothTrustletChimeraService;
import j..util.Objects;

public final class ezfu implements Runnable {
    final BluetoothDevice a;
    final BluetoothTrustletChimeraService b;

    public ezfu(BluetoothTrustletChimeraService bluetoothTrustletChimeraService0, BluetoothDevice bluetoothDevice0) {
        this.a = bluetoothDevice0;
        Objects.requireNonNull(bluetoothTrustletChimeraService0);
        this.b = bluetoothTrustletChimeraService0;
        super();
    }

    @Override
    public final void run() {
        BluetoothDevice bluetoothDevice0 = this.a;
        if(bluetoothDevice0.isConnected()) {
            bluetoothDevice0.getAddress();
            ezck ezck0 = this.b.e;
            String s = ezka.g(bluetoothDevice0.getAddress());
            boolean z = ezka.i(bluetoothDevice0);
            ((ezcg)ezck0).a.putBoolean(s, z);
            this.b.e.c();
            this.b.B();
        }
        this.b.f.remove(bluetoothDevice0);
    }
}

