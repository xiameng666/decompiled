import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.DeadObjectException;
import android.util.Log;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public final class fegm {
    final Queue a;
    public final List b;
    public final BluetoothManager c;
    public final Context d;
    public final fegg e;
    public final ggns f;
    public final AtomicBoolean g;
    public fegk h;
    public volatile BluetoothGattServer i;
    public volatile Deque j;

    public fegm(Context context0, BluetoothManager bluetoothManager0, List list0) {
        this.d = context0;
        this.c = bluetoothManager0;
        this.b = new ArrayList(list0);
        this.j = new ArrayDeque();
        this.e = new fegg();
        this.a = new ConcurrentLinkedQueue();
        this.f = new ggdi();
        this.g = new AtomicBoolean(false);
    }

    public final fege a(UUID uUID0, UUID uUID1) {
        for(Object object0: this.b) {
            fegi fegi0 = (fegi)object0;
            if(uUID0.equals(fegi0.a())) {
                for(Object object1: fegi0.b) {
                    fege fege0 = (fege)object1;
                    if(uUID1.equals(fege0.a())) {
                        return fege0;
                    }
                }
            }
        }
        return null;
    }

    public final void b() {
        BluetoothGattServer bluetoothGattServer0 = this.i;
        if(bluetoothGattServer0 == null) {
            ffmn.a("GattServiceServer", "Service server is closed, no need to add services.", new Object[0]);
            return;
        }
        if(!this.j.isEmpty()) {
            fegi fegi0 = (fegi)this.j.pop();
            if(bluetoothGattServer0.addService(fegi0.a)) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: fegi0.b) {
                    fege fege0 = (fege)object0;
                    if((fege0.a.getProperties() & 0x30) > 0) {
                        arrayList0.add(fege0);
                    }
                }
                for(Object object1: arrayList0) {
                    ((fege)object1).d = new fegj(this, ((fege)object1));
                }
                return;
            }
            Log.e("GattServiceServer", "Failed to add the service " + fegi0.a());
            return;
        }
        ffmn.a("GattServiceServer", "All services added to GATT server.", new Object[0]);
    }

    public final void c() {
        BluetoothGattServer bluetoothGattServer0 = this.i;
        if(bluetoothGattServer0 == null) {
            ffmn.a("GattServiceServer", "Service server is already closed", new Object[0]);
            return;
        }
        this.a.clear();
        this.f.s();
        synchronized(this.e.a) {
            this.e.a.s();
        }
        this.g.set(false);
        bluetoothGattServer0.clearServices();
        bluetoothGattServer0.close();
        this.i = null;
        this.h = null;
    }

    public final void d() {
        BluetoothGattServer bluetoothGattServer0 = this.i;
        if(bluetoothGattServer0 == null) {
            ffmn.a("GattServiceServer", "Service server is closed. Clearing up notifications", new Object[0]);
            this.a.clear();
            this.g.set(false);
            return;
        }
        fegl fegl0 = (fegl)this.a.poll();
        if(fegl0 != null) {
            try {
                BluetoothGattCharacteristic bluetoothGattCharacteristic0 = fegl0.b;
                if(!bluetoothGattServer0.notifyCharacteristicChanged(fegl0.a, bluetoothGattCharacteristic0, false)) {
                    Log.e("GattServiceServer", "Failed to send notification for characteristic  " + bluetoothGattCharacteristic0.getUuid());
                    this.d();
                }
            }
            catch(RuntimeException runtimeException0) {
                if(!(runtimeException0.getCause() instanceof DeadObjectException)) {
                    throw runtimeException0;
                }
                ffmn.a("GattServiceServer", "Bluetooth process died when sending notification.", new Object[0]);
            }
            return;
        }
        ffmn.a("GattServiceServer", "Sent all notifications.", new Object[0]);
    }
}

