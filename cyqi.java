import android.bluetooth.BluetoothDevice;
import java.util.concurrent.ScheduledExecutorService;

public final class cyqi extends cyqh {
    protected cyqi(BluetoothDevice bluetoothDevice0, kba kba0, jqt jqt0, ScheduledExecutorService scheduledExecutorService0, bbng bbng0, hfub hfub0) {
        super(bluetoothDevice0, kba0, jqt0, scheduledExecutorService0, bbng0, hfub0);
    }

    @Override  // cyqh
    protected final String b() {
        return "WaitAck";
    }

    @Override  // cyqh
    protected final void e(boolean z, int v, byte[] arr_b) {
        hfub hfub0 = this.e;
        if(((fgmh)hfub0).p != v) {
            return;
        }
        if(this.k == 3) {
            ((ggtj)cyjh.a.d().ar(0x1F5F)).Y("%s: onEventStreamResponse for %s with event %s, isAck=%b", this.a(), fgjo.c(this.a), ((Enum)hfub0).name(), Boolean.valueOf(z));
            if(z) {
                this.h(cyqm.a, arr_b);
                return;
            }
            if(fgti.b(arr_b) == 5) {
                this.h(cyqm.f, arr_b);
                return;
            }
            this.f(arr_b);
            return;
        }
        ((ggtj)cyjh.a.g().ar(0x1F60)).Y("%s: onEventStreamResponse for %s with event %s, isAck=%b, but current state is not WAIT_RESPONSE", this.a(), fgjo.c(this.a), ((Enum)hfub0).name(), Boolean.valueOf(z));
    }
}

