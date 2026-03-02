import android.bluetooth.le.BluetoothLeAdvertiser;
import java.util.concurrent.atomic.AtomicBoolean;

public final class fego {
    public final BluetoothLeAdvertiser a;
    public final AtomicBoolean b;
    public volatile fegn c;

    public fego(BluetoothLeAdvertiser bluetoothLeAdvertiser0) {
        this.b = new AtomicBoolean();
        this.a = bluetoothLeAdvertiser0;
    }

    public final void a() {
        if(this.c != null) {
            AtomicBoolean atomicBoolean0 = this.b;
            if(atomicBoolean0.get()) {
                ffmn.d("BleAdvertisingManager", "Stopping BLE advertising", new Object[0]);
                fegn fegn0 = this.c;
                gftb.check(fegn0);
                this.a.stopAdvertising(fegn0);
                this.c = null;
                atomicBoolean0.set(false);
            }
        }
    }
}

