import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import android.util.Log;
import j..util.Objects;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public final class fegk extends BluetoothGattServerCallback {
    final fegm a;

    public fegk(fegm fegm0) {
        Objects.requireNonNull(fegm0);
        this.a = fegm0;
        super();
    }

    private final void a(fegh fegh0, boolean z, BluetoothGattCharacteristic bluetoothGattCharacteristic0) {
        UUID uUID0 = bluetoothGattCharacteristic0.getService().getUuid();
        UUID uUID1 = bluetoothGattCharacteristic0.getUuid();
        fege fege0 = this.a.a(uUID0, uUID1);
        if(fege0 == null) {
            Log.e("GattServiceServer", "Can\'t find characteristic " + bluetoothGattCharacteristic0.getUuid());
            fegh0.a();
            return;
        }
        if(((z ? 2 : 12) & bluetoothGattCharacteristic0.getProperties()) == 0) {
            Log.e("GattServiceServer", "Incorrect permission for characteristic" + bluetoothGattCharacteristic0.getUuid());
            fegh0.a();
            return;
        }
        if(z) {
            fegd fegd0 = fege0.b;
            if(fegd0 != null) {
                fegd0.a(fegh0);
                return;
            }
        }
        else if(fege0.c != null) {
            ffmn.f("L2capPsmService", "Ignoring write request from old client", new Object[0]);
            fegh0.a();
            return;
        }
        Log.e("GattServiceServer", "Unexpected GATT request");
        fegh0.a();
    }

    @Override  // android.bluetooth.BluetoothGattServerCallback
    public final void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice0, int v, int v1, BluetoothGattCharacteristic bluetoothGattCharacteristic0) {
        ffmn.a("GattServiceServer", "onCharacteristicReadRequest", new Object[0]);
        fegm fegm0 = this.a;
        BluetoothGattServer bluetoothGattServer0 = fegm0.i;
        if(bluetoothGattServer0 == null) {
            ffmn.a("GattServiceServer", "Service server is closed.", new Object[0]);
            return;
        }
        fegh fegh0 = new fegh(bluetoothGattServer0, bluetoothDevice0, v, true);
        UUID uUID0 = bluetoothGattCharacteristic0.getService().getUuid();
        if(fegm0.f.A(uUID0, bluetoothDevice0)) {
            ffmn.a("GattServiceServer", "Ignoring device.", new Object[0]);
            fegh0.a();
            return;
        }
        this.a(fegh0, true, bluetoothGattCharacteristic0);
    }

    @Override  // android.bluetooth.BluetoothGattServerCallback
    public final void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice0, int v, BluetoothGattCharacteristic bluetoothGattCharacteristic0, boolean z, boolean z1, int v1, byte[] arr_b) {
        ffmn.a("GattServiceServer", "onCharacteristicWriteRequest", new Object[0]);
        fegm fegm0 = this.a;
        BluetoothGattServer bluetoothGattServer0 = fegm0.i;
        if(bluetoothGattServer0 == null) {
            ffmn.a("GattServiceServer", "Service server is closed.", new Object[0]);
            return;
        }
        fegh fegh0 = new fegh(bluetoothGattServer0, bluetoothDevice0, v, z1);
        UUID uUID0 = bluetoothGattCharacteristic0.getService().getUuid();
        if(fegm0.f.A(uUID0, bluetoothDevice0)) {
            ffmn.a("GattServiceServer", "Ignoring device.", new Object[0]);
            fegh0.a();
            return;
        }
        this.a(fegh0, false, bluetoothGattCharacteristic0);
    }

    @Override  // android.bluetooth.BluetoothGattServerCallback
    public final void onConnectionStateChange(BluetoothDevice bluetoothDevice0, int v, int v1) {
        if(v1 == 2) {
            fegm fegm0 = this.a;
            for(Object object0: fegm0.b) {
                fegi fegi0 = (fegi)object0;
                if(fegi0.b(bluetoothDevice0)) {
                    UUID uUID0 = fegi0.a();
                    fegm0.f.E(uUID0, bluetoothDevice0);
                }
                else {
                    UUID uUID1 = fegi0.a();
                    fegm0.f.v(uUID1, bluetoothDevice0);
                }
            }
            v1 = 2;
        }
        fegm fegm1 = this.a;
        for(Object object1: fegm1.b) {
            fegi fegi1 = (fegi)object1;
            UUID uUID2 = fegi1.a();
            if(!fegm1.f.A(uUID2, bluetoothDevice0)) {
                fegi1.c(v1);
            }
        }
    }

    @Override  // android.bluetooth.BluetoothGattServerCallback
    public final void onDescriptorReadRequest(BluetoothDevice bluetoothDevice0, int v, int v1, BluetoothGattDescriptor bluetoothGattDescriptor0) {
        boolean z;
        ffmn.a("GattServiceServer", "onDescriptorReadRequest", new Object[0]);
        fegm fegm0 = this.a;
        BluetoothGattServer bluetoothGattServer0 = fegm0.i;
        if(bluetoothGattServer0 == null) {
            ffmn.a("GattServiceServer", "Service server is closed.", new Object[0]);
            return;
        }
        fegh fegh0 = new fegh(bluetoothGattServer0, bluetoothDevice0, v, true);
        UUID uUID0 = bluetoothGattDescriptor0.getCharacteristic().getService().getUuid();
        if(fegm0.f.A(uUID0, bluetoothDevice0)) {
            ffmn.a("GattServiceServer", "Ignoring device.", new Object[0]);
            fegh0.a();
            return;
        }
        UUID uUID1 = bluetoothGattDescriptor0.getUuid();
        if(!fegf.e.equals(uUID1)) {
            Log.e("GattServiceServer", "Handling only CCCD descriptors.");
            fegh0.a();
            return;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic0 = bluetoothGattDescriptor0.getCharacteristic();
        if(bluetoothGattCharacteristic0 == null) {
            ffmn.a("GattServiceServer", "Descriptor has no characteristic", new Object[0]);
            fegh0.a();
            return;
        }
        fege fege0 = fegm0.a(bluetoothGattCharacteristic0.getService().getUuid(), bluetoothGattCharacteristic0.getUuid());
        if(fege0 == null) {
            ffmn.a("GattServiceServer", "Unknown characteristic: %s", new Object[]{bluetoothGattCharacteristic0.getUuid()});
            fegh0.a();
            return;
        }
        if(!(fege0 instanceof fegf)) {
            Log.e("GattServiceServer", "Characteristic " + fege0.a() + " is not notifiable");
            fegh0.a();
            return;
        }
        UUID uUID2 = fege0.a();
        synchronized(fegm0.e.a) {
            z = fegm0.e.a.A(uUID2, bluetoothDevice0);
        }
        fegh0.b((z ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE));
    }

    @Override  // android.bluetooth.BluetoothGattServerCallback
    public final void onDescriptorWriteRequest(BluetoothDevice bluetoothDevice0, int v, BluetoothGattDescriptor bluetoothGattDescriptor0, boolean z, boolean z1, int v1, byte[] arr_b) {
        ffmn.a("GattServiceServer", "onDescriptorWriteRequest", new Object[0]);
        fegm fegm0 = this.a;
        BluetoothGattServer bluetoothGattServer0 = fegm0.i;
        if(bluetoothGattServer0 == null) {
            ffmn.a("GattServiceServer", "Service server is closed.", new Object[0]);
            return;
        }
        fegh fegh0 = new fegh(bluetoothGattServer0, bluetoothDevice0, v, z1);
        UUID uUID0 = bluetoothGattDescriptor0.getCharacteristic().getService().getUuid();
        if(fegm0.f.A(uUID0, bluetoothDevice0)) {
            ffmn.a("GattServiceServer", "Ignoring device.", new Object[0]);
            fegh0.a();
            return;
        }
        UUID uUID1 = bluetoothGattDescriptor0.getUuid();
        if(!fegf.e.equals(uUID1)) {
            ffmn.a("GattServiceServer", "Handling only CCCD descriptors.", new Object[0]);
            fegh0.a();
            return;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic0 = bluetoothGattDescriptor0.getCharacteristic();
        if(bluetoothGattCharacteristic0 == null) {
            ffmn.a("GattServiceServer", "Descriptor has no characteristic", new Object[0]);
            fegh0.a();
            return;
        }
        fege fege0 = fegm0.a(bluetoothGattCharacteristic0.getService().getUuid(), bluetoothGattCharacteristic0.getUuid());
        if(fege0 == null) {
            ffmn.a("GattServiceServer", "Unknown characteristic: %s", new Object[]{bluetoothGattCharacteristic0.getUuid()});
            fegh0.a();
            return;
        }
        if(!(fege0 instanceof fegf)) {
            Log.e("GattServiceServer", "Characteristic " + fege0.a() + " is not notifiable");
            fegh0.a();
            return;
        }
        UUID uUID2 = fege0.a();
        if(Arrays.equals(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE, arr_b)) {
            synchronized(fegm0.e.a) {
                fegm0.e.a.v(uUID2, bluetoothDevice0);
            }
            fegh0.b(null);
            return;
        }
        if(Arrays.equals(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE, arr_b)) {
            synchronized(this.a.e.a) {
                this.a.e.a.E(uUID2, bluetoothDevice0);
            }
            fegh0.b(null);
            return;
        }
        ffmn.a("GattServiceServer", "Not an acceptable value for the CCCD on characteristic: %s", new Object[]{fege0.a()});
        fegh0.a();
    }

    @Override  // android.bluetooth.BluetoothGattServerCallback
    public final void onNotificationSent(BluetoothDevice bluetoothDevice0, int v) {
        fegm fegm0 = this.a;
        AtomicBoolean atomicBoolean0 = fegm0.g;
        atomicBoolean0.set(false);
        if(fegm0.i == null) {
            ffmn.a("GattServiceServer", "The notification was sent but the server closed.", new Object[0]);
            return;
        }
        ffmn.a("GattServiceServer", "Notification sent.", new Object[0]);
        if(!fegm0.a.isEmpty() && !atomicBoolean0.getAndSet(true)) {
            fegm0.d();
        }
    }

    @Override  // android.bluetooth.BluetoothGattServerCallback
    public final void onServiceAdded(int v, BluetoothGattService bluetoothGattService0) {
        ffmn.a("GattServiceServer", "Added service %s", new Object[]{bluetoothGattService0.getUuid()});
        this.a.b();
    }
}

