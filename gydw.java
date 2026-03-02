import android.bluetooth.BluetoothServerSocket;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class gydw implements gykt {
    public final bsaq a;
    public final gyey b;
    public final gyea c;
    public final Set d;
    public final AtomicBoolean e;
    BluetoothServerSocket f;
    public gyim g;

    public gydw(Context context0) {
        this.e = new AtomicBoolean(false);
        this.b = (gyey)cusq.c(context0, gyey.class);
        this.c = (gyea)cusq.c(context0, gyea.class);
        this.d = new HashSet();
        bsaq bsaq0 = cumz.e(context0, "BluetoothRfcommAccept");
        batl.s(bsaq0);
        this.a = bsaq0;
    }

    public static void a(Context context0) {
        gyey gyey0 = (gyey)cusq.e(context0, gyey.class);
        if(gyey0 != null && gyey0.o()) {
            return;
        }
        throw new gylc(gyey.class, gydw.class);
    }

    @Override  // gykt
    public final gyjk b(gyim gyim0) {
        this.g = gyim0;
        return new gydv(this);
    }

    @Override  // gykt
    public final MessageLite d() {
        return gygi.a;
    }

    @Override  // gykt
    public final void e(gykr gykr0) {
        Set set0 = this.d;
        synchronized(set0) {
            for(Object object0: set0) {
                this.c.f(((gydz)object0));
            }
        }
        this.b.e(gykr0);
    }
}

