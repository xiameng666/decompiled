import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;

public final class czoz implements Runnable {
    public final czpa a;
    public final czvg b;
    public final BluetoothSocket c;

    public czoz(czpa czpa0, czvg czvg0, BluetoothSocket bluetoothSocket0) {
        this.a = czpa0;
        this.b = czvg0;
        this.c = bluetoothSocket0;
    }

    @Override
    public final void run() {
        BluetoothDevice bluetoothDevice0 = this.c.getRemoteDevice();
        this.a.g.g(this.b, bluetoothDevice0);
    }
}

