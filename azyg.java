import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

public final class azyg {
    public final Set a;

    public azyg() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    public static azyd_linstner a(Object object0, String s) {
        batl.t(object0, "Listener must not be null");
        batl.t(s, "Listener type must not be null");
        batl.r(s, "Listener type must not be empty");
        return new azyd_linstner(object0, s);
    }

    public static azyf b(Object object0, Looper looper0, String s) {
        batl.t(object0, "Listener must not be null");
        batl.t(looper0, "Looper must not be null");
        batl.t(s, "Listener type must not be null");
        return new azyf(looper0, object0, s);
    }

    public static azyf c(Object object0, Executor executor0, String s) {
        batl.t(object0, "Listener must not be null");
        batl.t(executor0, "Executor must not be null");
        batl.t(s, "Listener type must not be null");
        return new azyf(executor0, object0, s);
    }
}

