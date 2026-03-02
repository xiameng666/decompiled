import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.BluetoothLeAdvertiser;
import com.google.android.gms.chimera.modules.fido.AppContextProvider;
import java.util.concurrent.atomic.AtomicBoolean;

public final class bmkc {
    public static final bboh a;
    public final BluetoothLeAdvertiser b;
    public final AdvertiseCallback c;
    public final AtomicBoolean d;

    static {
        bmkc.a = bnaa.d("HybridBleAdvertiser");
    }

    public bmkc() {
        BluetoothLeAdvertiser bluetoothLeAdvertiser0;
        BluetoothAdapter bluetoothAdapter0 = bahu.a(AppContextProvider.a());
        if(bluetoothAdapter0 == null) {
            bmzx.c("UNKNOWN", "BLE_HARDWARE");
            bluetoothLeAdvertiser0 = null;
        }
        else {
            bluetoothLeAdvertiser0 = bluetoothAdapter0.getBluetoothLeAdvertiser();
        }
        super();
        this.d = new AtomicBoolean(false);
        gftb.z(bluetoothLeAdvertiser0, "bleAdvertiser cannot be null");
        this.b = bluetoothLeAdvertiser0;
        this.c = new bmka(this);
    }

    public final void a() {
        if(this.d.compareAndSet(true, false)) {
            bmzx.c("UNKNOWN", "BLE_ADVERTISING_STOP");
            this.b.stopAdvertising(this.c);
        }
    }
}

