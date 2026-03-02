import android.bluetooth.BluetoothManager;
import android.bluetooth.le.ScanCallback;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public final class feet {
    public String a;
    public ScanCallback b;
    public final BluetoothManager c;
    public final esaa d;
    public final AtomicBoolean e;

    static {
        hzzi.a.i().as();
    }

    public feet(BluetoothManager bluetoothManager0, esaa esaa0) {
        this.e = new AtomicBoolean(false);
        this.c = bluetoothManager0;
        this.d = esaa0;
        esaa0.j(false);
    }

    public static void a(String s) {
        if(Log.isLoggable("BleScanHelper", 3)) {
            Log.d("BleScanHelper", s);
        }
    }
}

