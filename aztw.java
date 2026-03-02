import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
public abstract class aztw {
    public static final Set a;

    static {
        aztw.a = Collections.newSetFromMap(new WeakHashMap());
    }

    public Looper a() {
        throw new UnsupportedOperationException();
    }

    public azsz b(azss azss0) {
        throw new UnsupportedOperationException();
    }

    public azvc c(azvc azvc0) {
        throw new UnsupportedOperationException();
    }

    public azvc d(azvc azvc0) {
        throw new UnsupportedOperationException();
    }

    public static Set e() {
        synchronized(aztw.a) {
        }
        return aztw.a;
    }

    public abstract void f();

    public abstract void g();

    public abstract void h(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4);

    public void i() {
        throw new UnsupportedOperationException();
    }

    public abstract void j(aztu arg1);

    public abstract void k(aztv arg1);

    public boolean l(azta_api azta0) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean m(azta_api arg1);

    public abstract boolean n();

    public boolean o(aied aied0) {
        throw new UnsupportedOperationException();
    }
}

