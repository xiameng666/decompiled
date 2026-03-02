import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.os.Build;
import j..util.Objects;
import java.util.Arrays;
import java.util.UUID;

final class eqtm extends BluetoothGattServerCallback {
    final eqtn a;

    public eqtm(eqtn eqtn0) {
        Objects.requireNonNull(eqtn0);
        this.a = eqtn0;
        super();
    }

    @Override  // android.bluetooth.BluetoothGattServerCallback
    public final void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice0, int v, int v1, BluetoothGattCharacteristic bluetoothGattCharacteristic0) {
        BluetoothGattServer bluetoothGattServer0 = this.a.i;
        if(bluetoothGattServer0 == null) {
            eqtn.e.m("Bluetooth Gatt Server is null.", new Object[0]);
            return;
        }
        baun baun0 = eqtn.e;
        baun0.d("onCharacteristicReadRequest()", new Object[0]);
        UUID uUID0 = bluetoothGattCharacteristic0.getUuid();
        if(eqtn.b.equals(uUID0)) {
            bluetoothGattServer0.sendResponse(bluetoothDevice0, v, 0, 0, Build.MODEL.getBytes(eqtn.d));
            baun0.d("Device Name: " + Arrays.toString(Build.MODEL.getBytes()), new Object[0]);
            return;
        }
        baun0.m("Invalid Characteristic Read: " + bluetoothGattCharacteristic0.getUuid(), new Object[0]);
        bluetoothGattServer0.sendResponse(bluetoothDevice0, v, 0x101, 0, new byte[0]);
    }

    @Override  // android.bluetooth.BluetoothGattServerCallback
    public final void onConnectionStateChange(BluetoothDevice bluetoothDevice0, int v, int v1) {
        switch(v1) {
            case 0: {
                eqtn.e.d("Disconnected from GATT server.", new Object[0]);
                return;
            }
            case 2: {
                eqtn.e.d("Connected to GATT server.", new Object[0]);
                return;
            }
            default: {
                eqtn.e.d("connection state: " + v1, new Object[0]);
            }
        }
    }
}

