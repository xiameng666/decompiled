import android.content.Context;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class aywm {
    private static final Random a;
    private static aywm b;
    private final bbku c;
    private gmcf d;
    private boolean e;
    private long f;
    private long g;

    static {
        aywm.a = new Random();
    }

    private aywm() {
        this.c = new bbll(1, 10);
        this.e = false;
        this.f = 0L;
        this.g = 0L;
    }

    public static aywm a() {
        synchronized(aywm.class) {
            if(aywm.b == null) {
                aywm.b = new aywm();
            }
        }
        return aywm.b;
    }

    public final void b(Context context0) {
        synchronized(this) {
            if(this.g()) {
                this.d();
                this.e(context0);
                this.f();
            }
        }
    }

    final boolean c() {
        synchronized(this) {
            if(this.d != null && !this.d.isCancelled()) {
                return true;
            }
        }
        return false;
    }

    private final void d() {
        synchronized(this) {
            gmcf gmcf0 = this.d;
            if(gmcf0 != null && !gmcf0.isCancelled()) {
                gmcf0.cancel(false);
            }
        }
    }

    private final void e(Context context0) {
        synchronized(this) {
            if(hqzp.e() && !this.c()) {
                double f = (double)hqzp.c();
                double f1 = (double)hqzp.c();
                double f2 = aywm.a.nextDouble() * (f1 * 1.2 - f * 0.8);
                aywl aywl0 = new aywl(context0);
                long v1 = hqzp.b();
                gmcf gmcf0 = this.c.a(aywl0, v1, ((long)(f * 0.8 + f2)), TimeUnit.MILLISECONDS);
                this.d = gmcf0;
                gmbu.t(gmcf0, new aywi(this), gmap.a);
            }
        }
    }

    private final void f() {
        synchronized(this) {
            this.e = hqzp.e();
            this.f = hqzp.b();
            this.g = hqzp.c();
        }
    }

    private final boolean g() {
        synchronized(this) {
            if(this.e == hqzp.e() && this.f == hqzp.b() && this.g == hqzp.c()) {
                return false;
            }
        }
        return true;
    }
}

