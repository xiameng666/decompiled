import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.List;

public final class flzt implements flat {
    public flzz a;
    private static WeakReference b;
    private final gged_interceptors c;

    static {
        flzt.b = new WeakReference(null);
    }

    private flzt() {
        this.c = ggna.a;
        this.a = null;
    }

    @Override  // flat
    public final gged_interceptors a() {
        return this.c;
    }

    @Override  // flat
    public final List b(flvd flvd0, flky flky0, Context context0) {
        this.a = new flzz(flky0, new fmac(flvd0));
        return gged_interceptors.l(new flzu());
    }

    public static flzt c() {
        flzt flzt0;
        synchronized(flzt.class) {
            flzt0 = flzt.d();
        }
        return flzt0;
    }

    public static flzt d() {
        flzt flzt0;
        synchronized(flzt.class) {
            flzt0 = (flzt)flzt.b.get();
            if(flzt0 == null) {
                flzt flzt1 = new flzt();
                flzt.b = new WeakReference(flzt1);
                return flzt1;
            }
        }
        return flzt0;
    }
}

