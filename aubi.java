import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class aubi {
    protected final avij a;
    protected final String b;
    protected final String c;
    protected final int d;
    public CastDevice e;
    protected final ScheduledExecutorService f;
    public final auxc g;
    private static final AtomicInteger h;

    static {
        aubi.h = new AtomicInteger(0);
    }

    public aubi(CastDevice castDevice0, auxc auxc0, ScheduledExecutorService scheduledExecutorService0, String s, String s1) {
        this.e = castDevice0;
        this.f = scheduledExecutorService0;
        this.a = avij.e();
        int v = aubi.h.incrementAndGet();
        this.d = v;
        String s2 = String.format(Locale.ROOT, "%s-%04d", s, v);
        this.b = s2;
        String s3 = String.format(Locale.ROOT, "%s-%s", s2, s1);
        this.c = s3;
        if(auxc0 == null) {
            auxb auxb0 = new auxb(castDevice0);
            auxb0.a = scheduledExecutorService0;
            auxb0.g = s3;
            auxc0 = new auxc(auxb0);
        }
        this.g = auxc0;
    }

    public abstract CastDevice a();

    public abstract String b();

    public abstract void c();

    public abstract void d(boolean arg1);

    public abstract void e(String arg1, String arg2, JoinOptions arg3);

    public abstract void f(String arg1, LaunchOptions arg2);

    public abstract void g();

    public abstract void h(String arg1, String arg2);

    public abstract void i(String arg1);

    public abstract void j();

    public abstract void k(String arg1, byte[] arg2, long arg3);

    public abstract void l(String arg1, String arg2, long arg3);

    public abstract void m(String arg1, String arg2, long arg3, String arg4);

    public abstract void n(String arg1);

    public abstract void o(String arg1);

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract boolean s(boolean arg1, double arg2, boolean arg3);

    public abstract boolean t(double arg1, double arg2, boolean arg3);

    public abstract void u(EqualizerSettings arg1);
}

