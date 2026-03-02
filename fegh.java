import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattServer;
import android.util.Log;

public final class fegh {
    private final BluetoothGattServer a;
    private final BluetoothDevice b;
    private final int c;
    private final boolean d;

    public fegh(BluetoothGattServer bluetoothGattServer0, BluetoothDevice bluetoothDevice0, int v, boolean z) {
        this.a = bluetoothGattServer0;
        this.b = bluetoothDevice0;
        this.c = v;
        this.d = z;
    }

    public final void a() {
        this.c(0x101, null);
    }

    public final void b(byte[] arr_b) {
        this.c(0, arr_b);
    }

    private final void c(int v, byte[] arr_b) {
        if(this.d && !this.a.sendResponse(this.b, this.c, v, 0, arr_b)) {
            Log.e("GattServiceServer", "Failed to send GATT response");
        }
    }
}

