import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseData.Builder;
import android.bluetooth.le.AdvertiseSettings.Builder;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.util.Log;
import java.util.concurrent.TimeUnit;

public final class feic {
    feib a;
    final AdvertiseData.Builder b;
    private final BluetoothAdapter c;

    public feic(BluetoothAdapter bluetoothAdapter0) {
        gftb.check(bluetoothAdapter0);
        this.c = bluetoothAdapter0;
        this.b = new AdvertiseData.Builder().setIncludeDeviceName(false);
    }

    public static void a(String s) {
        if(Log.isLoggable("AdvertisingHandler", 3)) {
            Log.d("AdvertisingHandler", s);
        }
    }

    public final void b() {
        feic.a("Stopping BLE advertising");
        if(this.a == null) {
            feic.a("Advertising is already inactive");
            return;
        }
        BluetoothLeAdvertiser bluetoothLeAdvertiser0 = this.c.getBluetoothLeAdvertiser();
        if(bluetoothLeAdvertiser0 == null) {
            feic.a("Bluetooth is off or BLE is unavailable");
            this.a = null;
            return;
        }
        bluetoothLeAdvertiser0.stopAdvertising(this.a);
        this.a = null;
    }

    public final boolean c(long v, int v1) {
        return this.d(v, v1, 1);
    }

    public final boolean d(long v, int v1, int v2) {
        String s1;
        String s;
        if(Log.isLoggable("AdvertisingHandler", 3)) {
            switch(v1) {
                case 0: {
                    s = "ADVERTISE_MODE_LOW_POWER";
                    break;
                }
                case 1: {
                    s = "ADVERTISE_MODE_BALANCED";
                    break;
                }
                case 2: {
                    s = "ADVERTISE_MODE_LOW_LATENCY";
                    break;
                }
                default: {
                    s = a.f(v1, "UNKNOWN(", ")");
                }
            }
            switch(v2) {
                case 0: {
                    s1 = "ADVERTISE_TX_POWER_ULTRA_LOW";
                    break;
                }
                case 1: {
                    s1 = "ADVERTISE_TX_POWER_LOW";
                    break;
                }
                case 2: {
                    s1 = "ADVERTISE_TX_POWER_MEDIUM";
                    break;
                }
                case 3: {
                    s1 = "ADVERTISE_TX_POWER_HIGH";
                    break;
                }
                default: {
                    s1 = a.f(v2, "UNKNOWN(", ")");
                }
            }
            feic.a(a.l(s1, s, "Starting BLE advertising with advertiseMode: ", ", txPowerLevel: "));
        }
        BluetoothAdapter bluetoothAdapter0 = this.c;
        if(!bluetoothAdapter0.isEnabled()) {
            feic.a("The bluetooth adapter is off");
            return false;
        }
        BluetoothLeAdvertiser bluetoothLeAdvertiser0 = bluetoothAdapter0.getBluetoothLeAdvertiser();
        if(bluetoothLeAdvertiser0 == null) {
            feic.a("Bluetooth is off or BLE is unavailable");
            return false;
        }
        if(this.a != null) {
            feic.a("Stopping current advertising first");
            bluetoothLeAdvertiser0.stopAdvertising(this.a);
        }
        this.a = new feib();
        try {
            bluetoothLeAdvertiser0.startAdvertising(new AdvertiseSettings.Builder().setAdvertiseMode(v1).setConnectable(true).setTxPowerLevel(v2).build(), this.b.build(), this.a);
        }
        catch(IllegalStateException illegalStateException0) {
            Log.e("AdvertisingHandler", "Cannot start advertising", illegalStateException0);
            return false;
        }
        feic.a("Waiting for start callback");
        try {
            if(!this.a.a.await(v, TimeUnit.MILLISECONDS)) {
                Log.e("AdvertisingHandler", "Timed out while waiting for confirmation.");
                bluetoothLeAdvertiser0.stopAdvertising(this.a);
                this.a = null;
                return false;
            }
        }
        catch(InterruptedException unused_ex) {
            Log.e("AdvertisingHandler", "Interrupted while waiting for confirmation");
            bluetoothLeAdvertiser0.stopAdvertising(this.a);
            this.a = null;
            return false;
        }
        if(!this.a.b) {
            this.a = null;
            return false;
        }
        return true;
    }
}

