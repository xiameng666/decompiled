import android.os.Build;
import android.util.Log;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

final class ggvk extends gguy {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final AtomicReference d;
    private static final AtomicLong e;
    private static final ConcurrentLinkedQueue f;
    private volatile ggtx g;

    static {
        boolean z = false;
        ggvk.a = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        ggvk.b = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        if("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) {
            z = true;
        }
        ggvk.c = z;
        ggvk.d = new AtomicReference();
        ggvk.e = new AtomicLong();
        ggvk.f = new ConcurrentLinkedQueue();
    }

    public ggvk(String s) {
        super(s);
        if(!ggvk.a && !ggvk.b) {
            if(ggvk.c) {
                this.g = new ggvm(ggvo.c.a, ggvo.c.b, 2, Level.OFF, ggvo.c.d, ggvo.c.e).a(this.d());
                return;
            }
            this.g = null;
            return;
        }
        this.g = new gguz().a(this.d());
    }

    @Override  // gguy
    public final void a(RuntimeException runtimeException0, ggtu ggtu0) {
        if(this.g != null) {
            this.g.a(runtimeException0, ggtu0);
            return;
        }
        Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException0);
    }

    @Override  // ggtx
    public final void b(ggtu ggtu0) {
        if(this.g != null) {
            this.g.b(ggtu0);
            return;
        }
        if(ggvk.e.incrementAndGet() > 20L) {
            ggvk.f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        ggvj ggvj0 = new ggvj(this, ggtu0);
        ggvk.f.offer(ggvj0);
        if(this.g != null) {
            ggvk.f();
        }
    }

    @Override  // ggtx
    public final boolean c(Level level0) {
        return this.g == null || this.g.c(level0);
    }

    public static void e() {
        ggvk ggvk0;
        while((ggvk0 = (ggvk)ggvi.a.poll()) != null) {
            ggvk0.g = ((ggva)ggvk.d.get()).a(ggvk0.d());
        }
        ggvk.f();
    }

    private static void f() {
        ggvj ggvj0;
        while((ggvj0 = (ggvj)ggvk.f.poll()) != null) {
            ggvk.e.getAndDecrement();
            ggtu ggtu0 = ggvj0.b;
            ggtx ggtx0 = ggvj0.a;
            if(ggtu0.h() || ggtx0.c(ggtu0.g())) {
                ggtx0.b(ggtu0);
            }
        }
    }
}

