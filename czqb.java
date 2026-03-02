import android.bluetooth.le.ScanResult;
import com.google.android.gms.nearby.common.ble.BleSighting;
import com.google.android.gms.nearby.mediums.bluetooth.BluetoothLowEnergy.3;

public final class czqb implements Runnable {
    public final BluetoothLowEnergy.3 a;
    public final ScanResult b;

    public czqb(BluetoothLowEnergy.3 bluetoothLowEnergy$30, ScanResult scanResult0) {
        this.a = bluetoothLowEnergy$30;
        this.b = scanResult0;
    }

    @Override
    public final void run() {
        BleSighting bleSighting0 = BleSighting.a(this.b);
        if(bleSighting0 == null) {
            czkq.a.e().p("Failed to doScanResult due to invalid scanResult.", new Object[0]);
            return;
        }
        this.a.b.p(bleSighting0);
    }
}

