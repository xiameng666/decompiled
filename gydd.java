import android.content.Context;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class gydd implements gykt {
    public final Context a;
    public gemb b;
    public final Set c;
    public final gydl d;
    public gyim e;
    public final AtomicBoolean f;
    public final BlockingQueue g;
    final CountDownLatch h;

    public gydd(Context context0) {
        this.g = new LinkedBlockingQueue();
        this.h = new CountDownLatch(1);
        this.a = context0;
        this.d = (gydl)cusq.c(context0, gydl.class);
        this.c = new HashSet();
        this.f = new AtomicBoolean(false);
    }

    public final void a() {
        gemb gemb0 = this.b;
        if(gemb0 != null) {
            gemb0.j();
            this.b = null;
        }
        this.f(new IOException("Gatt server closed"));
        this.f.set(true);
    }

    @Override  // gykt
    public final gyjk b(gyim gyim0) {
        this.e = gyim0;
        return new gydb(this);
    }

    public static void c(Context context0) {
        gyey gyey0 = (gyey)cusq.e(context0, gyey.class);
        if(gyey0 != null && gyey0.m()) {
            return;
        }
        throw new gylc(gyey.class, gydd.class);
    }

    @Override  // gykt
    public final MessageLite d() {
        return gygi.a;
    }

    @Override  // gykt
    public final void e(gykr gykr0) {
        this.a();
        Set set0 = this.c;
        synchronized(set0) {
            for(Object object0: set0) {
                this.d.f(((gydk)object0));
            }
        }
        gykr0.b();
    }

    public final void f(IOException iOException0) {
        try {
            gydc gydc0 = new gydc(iOException0);
            this.g.put(gydc0);
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
        }
    }
}

