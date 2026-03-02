import android.bluetooth.BluetoothDevice;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public class cyqk {
    public final ScheduledExecutorService a;
    protected final bbng b;
    public cyqd c;
    protected final HashMap d;
    protected int e;

    public cyqk(ScheduledExecutorService scheduledExecutorService0, bbng bbng0) {
        this.d = new HashMap();
        this.a = scheduledExecutorService0;
        this.b = bbng0;
    }

    public static void a(gmcd gmcd0, kar kar0, Executor executor0) {
        gmbu.t(gmcd0, new cyqc(kar0), executor0);
    }

    public final void b(BluetoothDevice bluetoothDevice0, boolean z, int v, byte[] arr_b) {
        if(hvpg.bJ()) {
            ggtj ggtj0 = (ggtj)cyjh.a.d().ar(8035);
            String s = bluetoothDevice0.getAddress();
            ggtj0.Y("EventStreamHandler: onEventStreamResponse called for %s with isAck=%s, eventCode=%s, additionalData=%s", gxyf.b(gxye.a, s), Boolean.valueOf(z), Integer.valueOf(v), arr_b);
        }
        cypy cypy0 = new cypy(this, bluetoothDevice0, z, v, arr_b);
        this.a.execute(cypy0);
    }
}

