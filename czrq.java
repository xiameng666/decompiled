import android.content.Intent;
import com.google.android.gms.nearby.mediums.bluetooth.classic.BluetoothClassicScanner.1;

public final class czrq implements Runnable {
    public final BluetoothClassicScanner.1 a;
    public final Intent b;

    public czrq(BluetoothClassicScanner.1 bluetoothClassicScanner$10, Intent intent0) {
        this.a = bluetoothClassicScanner$10;
        this.b = intent0;
    }

    @Override
    public final void run() {
        this.a.a.d(this.b);
    }
}

