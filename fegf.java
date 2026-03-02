import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.ArrayList;
import java.util.Queue;
import java.util.UUID;

public final class fegf extends fege {
    static final UUID e;

    static {
        fegf.e = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    }

    public fegf(UUID uUID0, int v, int v1, fegd fegd0, fejk fejk0) {
        super(uUID0, v | 16, v1, fegd0, fejk0);
        this.a.addDescriptor(new BluetoothGattDescriptor(fegf.e, 16));
    }

    public final boolean b(byte[] arr_b) {
        this.a.setValue(arr_b);
        fegj fegj0 = this.d;
        if(fegj0 == null) {
            return false;
        }
        fegm fegm0 = fegj0.a;
        fege fege0 = fegj0.b;
        UUID uUID0 = fege0.a();
        synchronized(fegm0.e.a) {
            ArrayList arrayList0 = new ArrayList(fegm0.e.a.h(uUID0));
        }
        Queue queue0 = fegm0.a;
        if(arrayList0.size() + queue0.size() >= 0x200) {
            ffmn.a("GattServiceServer", "Notifications queue is congested.", new Object[0]);
            return false;
        }
        if(arrayList0.isEmpty()) {
            ffmn.a("GattServiceServer", "No target devices", new Object[0]);
        }
        for(Object object0: arrayList0) {
            queue0.add(new fegl(((BluetoothDevice)object0), fege0.a));
        }
        if(!queue0.isEmpty()) {
            if(fegm0.g.getAndSet(true)) {
                return true;
            }
            fegm0.d();
        }
        return true;
    }
}

