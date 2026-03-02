import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;

public final class eydb extends BluetoothGattCallback {
    final eydc a;
    final icbi b;

    public eydb(eydc eydc0, icbi icbi0) {
        this.a = eydc0;
        this.b = icbi0;
        super();
    }

    @Override  // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt0, int v, int v1) {
        ibuq.f(bluetoothGatt0, "gatt");
        switch(v1) {
            case 0: {
                this.a.b = false;
                bluetoothGatt0.close();
                ((ggtj)this.a.a.h()).z("GattConnector GATT disconnected, status %d.", v);
                return;
            }
            case 2: {
                this.a.b = true;
                ((ggtj)this.a.a.h()).z("GattConnector GATT connected, status %d.", v);
                icbi icbi0 = this.b;
                if(!icbi0.i()) {
                    icbi0.w(ibom.a);
                }
            }
        }
    }
}

