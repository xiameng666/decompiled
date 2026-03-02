import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

public final class fmhy implements flat {
    public fmid a;
    private static WeakReference b;
    private fmjd c;
    private final gged_interceptors d;
    private final flbe e;
    private final String f;
    private final fieo g;
    private final fmjp h;

    static {
        fmhy.b = new WeakReference(null);
    }

    private fmhy(String s, flbe flbe0, fieo fieo0, fmjp fmjp0) {
        this.d = gged_interceptors.l(Integer.valueOf(1));
        this.a = null;
        this.f = s;
        this.e = flbe0;
        this.g = fieo0;
        this.h = fmjp0;
    }

    @Override  // flat
    public final gged_interceptors a() {
        return this.d;
    }

    @Override  // flat
    public final List b(flvd flvd0, flky flky0, Context context0) {
        this.c = new fmjd(context0, flvd0, this.e, this.g);
        this.a = new fmiv(context0, this.c, flky0, this.f);
        return Arrays.asList(new flws[]{new fmhz(this.a)});
    }

    public static fmhy c(String s, flbe flbe0, fieo fieo0) {
        fmhy fmhy0;
        synchronized(fmhy.class) {
            fmhy0 = fmhy.d(s, flbe0, fieo0);
        }
        return fmhy0;
    }

    private static fmhy d(String s, flbe flbe0, fieo fieo0) {
        fmhy fmhy0;
        synchronized(fmhy.class) {
            fmhy0 = (fmhy)fmhy.b.get();
            if(fmhy0 == null) {
                fmhy fmhy1 = new fmhy(s, flbe0, fieo0, new fmjp());
                fmhy.b = new WeakReference(fmhy1);
                return fmhy1;
            }
        }
        return fmhy0;
    }
}

