import android.bluetooth.BluetoothDevice;
import java.util.Iterator;

public final class cypy implements Runnable {
    public final cyqk a;
    public final BluetoothDevice b;
    public final boolean c;
    public final int d;
    public final byte[] e;

    public cypy(cyqk cyqk0, BluetoothDevice bluetoothDevice0, boolean z, int v, byte[] arr_b) {
        this.a = cyqk0;
        this.b = bluetoothDevice0;
        this.c = z;
        this.d = v;
        this.e = arr_b;
    }

    @Override
    public final void run() {
        Iterator iterator0 = this.a.d.values().iterator();
        while(iterator0.hasNext()) {
            BluetoothDevice bluetoothDevice0 = this.b;
            Object object0 = iterator0.next();
            cyqh cyqh0 = (cyqh)object0;
            if(cyqh0.j(bluetoothDevice0)) {
                byte[] arr_b = this.e;
                int v = this.d;
                boolean z = this.c;
                if(!z) {
                    ggtj ggtj0 = (ggtj)cyjh.a.g().ar(8033);
                    String s = fgjo.c(bluetoothDevice0);
                    Integer integer0 = v;
                    int v1 = fgti.b(arr_b);
                    String s1 = fgti.a(v1);
                    if(v1 == 0) {
                        throw null;
                    }
                    ggtj0.X("EventStreamHandler: onEventStreamResponse NAK for device %s, eventCode %d, reason %s", s, integer0, s1);
                }
                cyqh0.e(z, v, arr_b);
            }
        }
    }
}

