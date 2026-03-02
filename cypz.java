import android.bluetooth.BluetoothDevice;
import java.util.Iterator;

public final class cypz implements Runnable {
    public final cyqk a;
    public final BluetoothDevice b;

    public cypz(cyqk cyqk0, BluetoothDevice bluetoothDevice0) {
        this.a = cyqk0;
        this.b = bluetoothDevice0;
    }

    @Override
    public final void run() {
        Iterator iterator0 = this.a.d.values().iterator();
        while(iterator0.hasNext()) {
            BluetoothDevice bluetoothDevice0 = this.b;
            Object object0 = iterator0.next();
            cyqh cyqh0 = (cyqh)object0;
            if(cyqh0.j(bluetoothDevice0)) {
                ((ggtj)cyjh.a.d().ar(8034)).R("EventStreamHandler: onReceiveSessionNonce, trigger send for %s to %s", cyqh0.b(), fgjo.c(bluetoothDevice0));
                cyqh0.g();
            }
        }
    }
}

