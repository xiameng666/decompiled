import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.SystemClock;
import com.google.android.gms.nearby.common.ble.BleSighting;
import com.google.location.nearby.direct.bluetooth.state.FastPairScanner.1;
import j..util.Objects;

public final class gyfu extends gxum {
    final ScanResult a;
    final FastPairScanner.1 b;

    public gyfu(FastPairScanner.1 fastPairScanner$10, ScanResult scanResult0) {
        this.a = scanResult0;
        Objects.requireNonNull(fastPairScanner$10);
        this.b = fastPairScanner$10;
        super("FastPairScanner_onScanResult");
    }

    @Override
    public final void run() {
        BleSighting bleSighting0;
        ScanResult scanResult0 = this.a;
        if(scanResult0.getScanRecord() == null) {
            bleSighting0 = null;
        }
        else {
            BluetoothDevice bluetoothDevice0 = scanResult0.getDevice();
            ScanRecord scanRecord0 = scanResult0.getScanRecord();
            gftb.check(scanRecord0);
            bleSighting0 = new BleSighting(bluetoothDevice0, scanRecord0.getBytes(), scanResult0.getRssi(), scanResult0.getTimestampNanos() + gyga.a);
        }
        if(bleSighting0 != null) {
            gftb.check(this.b.a.d);
            this.b.a.d.c(bleSighting0);
        }
        String s = scanResult0.getDevice().getAddress();
        Long long0 = SystemClock.elapsedRealtime();
        this.b.a.c.put(s, long0);
        this.b.a.b();
    }
}

