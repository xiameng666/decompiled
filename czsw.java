import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import j..util.concurrent.ConcurrentHashMap;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

public final class czsw {
    public int a;
    public final gmcg b;
    public final ScheduledExecutorService c;
    public BluetoothServerSocket d;
    public final Map e;
    public final bsaq f;
    public final Map g;
    public final czts h;
    private final List i;

    public czsw(bsaq bsaq0, Map map0, czts czts0) {
        this.a = 0;
        this.b = cuui.c(4);
        this.c = cuui.f();
        this.i = new ArrayList();
        this.e = new ConcurrentHashMap();
        this.f = bsaq0;
        this.g = map0;
        this.h = czts0;
    }

    public final void a(BluetoothSocket bluetoothSocket0) {
        synchronized(this) {
            this.i.add(bluetoothSocket0);
        }
    }

    public final void b() {
        synchronized(this) {
            List list0 = this.i;
            for(Object object0: list0) {
                bbpb.b(((BluetoothSocket)object0));
            }
            list0.clear();
            bbpb.b(this.d);
            this.d = null;
            cuui.h(this.b, "BleL2capServer.socketHandlerThreadPool");
            cuui.h(this.c, "BleL2capServer.timeoutAlarmExecutor");
        }
    }

    public static void c(BluetoothSocket bluetoothSocket0) {
        new czsv(bluetoothSocket0).start();
    }

    public static void d(DataOutputStream dataOutputStream0, byte[] arr_b) {
        dataOutputStream0.writeInt(arr_b.length);
        dataOutputStream0.write(arr_b);
        dataOutputStream0.flush();
    }
}

