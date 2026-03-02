import android.bluetooth.BluetoothDevice;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class cyqn implements Runnable {
    public final cyqq a;
    public final BluetoothDevice b;

    public cyqn(cyqq cyqq0, BluetoothDevice bluetoothDevice0) {
        this.a = cyqq0;
        this.b = bluetoothDevice0;
    }

    @Override
    public final void run() {
        Iterator iterator0 = this.a.d.values().iterator();
        while(iterator0.hasNext()) {
            BluetoothDevice bluetoothDevice0 = this.b;
            Object object0 = iterator0.next();
            cyqh cyqh0 = (cyqh)object0;
            if(!cyqh0.j(bluetoothDevice0)) {
            }
            else if((cyqh0 instanceof cyqp)) {
                ((ggtj)cyjh.a.d().ar(8043)).R("EventStreamHandler: onReceiveSessionNonce, schedule send for %s to %s", cyqh0.b(), fgjo.c(bluetoothDevice0));
                if(hvpg.aq() > 0L) {
                    ((cyqp)cyqh0).c();
                    ((cyqp)cyqh0).j = ((cuuh)((cyqp)cyqh0).c).g(new cyqo(((cyqp)cyqh0)), hvpg.aq(), TimeUnit.MILLISECONDS);
                }
                else {
                    ((cyqp)cyqh0).g();
                }
            }
            else {
                ((ggtj)cyjh.a.d().ar(8042)).R("EventStreamHandler: onReceiveSessionNonce, trigger send for %s to %s", cyqh0.b(), fgjo.c(bluetoothDevice0));
                cyqh0.g();
            }
        }
    }
}

