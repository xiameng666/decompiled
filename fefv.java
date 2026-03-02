import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.util.Log;
import j..util.Objects;

final class fefv extends BluetoothGattCallback {
    final fegb a;

    public fefv(fegb fegb0) {
        Objects.requireNonNull(fegb0);
        this.a = fegb0;
        super();
    }

    @Override  // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt0, BluetoothGattCharacteristic bluetoothGattCharacteristic0, byte[] arr_b) {
        Log.d("BleClientConnection", "onCharacteristicChanged callback");
        fegb fegb0 = this.a;
        if(bluetoothGatt0 != fegb0.j) {
            Log.w("BleClientConnection", "Gatt onCharacteristicChanged callback from non-matching gatt is called.");
            return;
        }
        fegb0.y(5, new fefu(bluetoothGattCharacteristic0, arr_b));
    }

    @Override  // android.bluetooth.BluetoothGattCallback
    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt0, BluetoothGattCharacteristic bluetoothGattCharacteristic0, byte[] arr_b, int v) {
        Log.d("BleClientConnection", "onCharacteristicRead callback - status: " + v);
        fegb fegb0 = this.a;
        if(bluetoothGatt0 != fegb0.j) {
            Log.w("BleClientConnection", "Gatt onCharacteristicRead callback from non-matching gatt is called.");
            return;
        }
        if(v == 0) {
            fegb0.v(7);
            fegb0.y(5, new fefu(bluetoothGattCharacteristic0, arr_b));
            return;
        }
        Log.w("BleClientConnection", "Gatt onCharacteristicRead failed.");
    }

    @Override  // android.bluetooth.BluetoothGattCallback
    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt0, int v, int v1) {
        Log.d("BleClientConnection", a.z(v1, v, "onConnectionStateChange operation status: ", " connection status: "));
        fegb fegb0 = this.a;
        if(bluetoothGatt0 != fegb0.j) {
            Log.w("BleClientConnection", "Gatt onConnectionStateChange callback from non-matching gatt is called.");
            return;
        }
        switch(v1) {
            case 0: {
                fegb0.x(0);
                return;
            }
            case 2: {
                fegb0.x(2);
                return;
            }
            default: {
                Log.d("BleClientConnection", a.z(v1, v, "Gatt unexpected status change, operation status: ", " connection status: "));
            }
        }
    }

    @Override  // android.bluetooth.BluetoothGattCallback
    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt0, BluetoothGattDescriptor bluetoothGattDescriptor0, int v) {
        Integer integer0 = v;
        ffmn.a("BleClientConnection", "onDescriptorWrite, status: %d", new Object[]{integer0});
        fegb fegb0 = this.a;
        if(bluetoothGatt0 != fegb0.j) {
            Log.w("BleClientConnection", "Gatt onDescriptorWrite callback from non-matching gatt is called.");
            return;
        }
        gmcu gmcu0 = fegb0.m;
        if(gmcu0 != null) {
            fegb0.m = null;
            gmcu0.q(integer0);
        }
    }

    @Override  // android.bluetooth.BluetoothGattCallback
    public final void onMtuChanged(BluetoothGatt bluetoothGatt0, int v, int v1) {
        Integer integer0 = v1;
        ffmn.a("BleClientConnection", "MTU is changed to %d, status: %d", new Object[]{v, integer0});
        fegb fegb0 = this.a;
        fegb0.l = v;
        gmcu gmcu0 = fegb0.n;
        if(gmcu0 != null) {
            fegb0.n = null;
            gmcu0.q(integer0);
        }
    }

    @Override  // android.bluetooth.BluetoothGattCallback
    public final void onServiceChanged(BluetoothGatt bluetoothGatt0) {
        Log.d("BleClientConnection", "onServiceChanged callback");
        fegb fegb0 = this.a;
        if(bluetoothGatt0 != fegb0.j) {
            Log.w("BleClientConnection", "Gatt onServiceChanged callback from non-matching gatt is called.");
            return;
        }
        fegb0.x(4);
    }

    @Override  // android.bluetooth.BluetoothGattCallback
    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt0, int v) {
        Log.d("BleClientConnection", a.h(v, "onServicesDiscovered callback - status: "));
        fegb fegb0 = this.a;
        if(bluetoothGatt0 != fegb0.j) {
            Log.w("BleClientConnection", "Gatt onServicesDiscovered callback from non-matching gatt is called.");
            return;
        }
        fegb0.x(3);
    }
}

