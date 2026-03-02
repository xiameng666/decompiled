import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.location.nearby.direct.bluetooth.BluetoothNameScan.1;
import java.util.concurrent.atomic.AtomicBoolean;

public final class gydu implements gyjd {
    public final gyey a;
    public final AtomicBoolean b;
    public final gyhe c;
    public gyim d;
    public final BroadcastReceiver e;

    public gydu(Context context0, gyhe gyhe0) {
        this.e = new BluetoothNameScan.1(this);
        this.a = (gyey)cusq.c(context0, gyey.class);
        this.c = gyhe0;
        this.b = new AtomicBoolean(false);
    }

    @Override  // gyjd
    public final MessageLite a() {
        return gyic.a;
    }

    @Override  // gyjd
    public final void b(gyim gyim0, gykr gykr0) {
        this.d = gyim0;
        gydt gydt0 = new gydt(this, gykr0);
        this.a.g(gydt0);
    }

    @Override  // gyjd
    public final void c(gykr gykr0) {
        if(this.b.compareAndSet(true, false)) {
            this.a.i.unregisterReceiver(this.e);
            this.a.a();
        }
        this.a.e(gykr0);
    }

    public static void d(Context context0, gyhx gyhx0) {
        gyhe gyhe0 = gyhx0.d == null ? gyhe.a : gyhx0.d;
        if(gyhe0 == null || (gyhe0.c == null ? gyhd.a : gyhe0.c).c.length() <= 0) {
            throw new gyla("Data to advertise on bluetooth name is not correctly set");
        }
        gyey gyey0 = (gyey)cusq.e(context0, gyey.class);
        if(gyey0 != null && gyey0.o()) {
            return;
        }
        throw new gylc(gyey.class, gyds.class);
    }
}

