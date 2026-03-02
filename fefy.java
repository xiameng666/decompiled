import android.bluetooth.BluetoothGattCharacteristic;
import android.util.Log;

public final class fefy implements Runnable {
    public final fefz a;
    public final BluetoothGattCharacteristic b;

    public fefy(fefz fefz0, BluetoothGattCharacteristic bluetoothGattCharacteristic0) {
        this.a = fefz0;
        this.b = bluetoothGattCharacteristic0;
    }

    @Override
    public final void run() {
        Log.d("BleClientConnection", "Start reading PSM characteristic.");
        Log.d("BleClientConnection", "PSM read result: " + this.a.a.j.readCharacteristic(this.b));
        this.a.a.z(7, 35000L);
    }
}

