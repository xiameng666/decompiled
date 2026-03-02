import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

public final class bcrg {
    private static WeakReference a;

    static {
        bcrg.a = new WeakReference(null);
    }

    public static final int a(hofs hofs0) {
        if(hofs0 == null) {
            return 2;
        }
        return hofr.b(hofs0.f) != 5 || hofs0.c != 3 || !((hofu)hofs0.d).c.isEmpty() ? 1 : 3;
    }

    public static final List b(String s) {
        if(!TextUtils.isEmpty(s)) {
            try {
                return gged_interceptors.i(ggia.h(gfud.e(',').n(s), new bcre()));
            }
            catch(NumberFormatException unused_ex) {
                return ggna.a;
            }
        }
        return ggna.a;
    }

    public static final boolean c(hofs hofs0) {
        return hofs0 != null && bcrg.a(hofs0) == 1 && hofr.b(hofs0.f) == 4;
    }

    public static final boolean d(hofs hofs0) {
        return hofs0 != null && bcrg.a(hofs0) == 1 && hofr.b(hofs0.f) == 5;
    }

    public static void e() {
        synchronized(bcrg.class) {
            if(((bcrg)bcrg.a.get()) == null) {
                bcrg.a = new WeakReference(new bcrg());
            }
        }
    }
}

