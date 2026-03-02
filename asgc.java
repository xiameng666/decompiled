import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

public final class asgc {
    private static final baun a;
    private final Map b;
    private int c;

    static {
        asgc.a = aqql.a("BackUpNowHelper");
    }

    public asgc() {
        this.b = new HashMap();
    }

    public final int a() {
        synchronized(this) {
        }
        return this.c;
    }

    public final void b(String s, aqgk aqgk0) {
        synchronized(this) {
            asgc.a.j("Registering callbacks, id = %s", new Object[]{s});
            this.b.put(s, aqgk0);
        }
    }

    public final void c() {
        synchronized(this) {
            ++this.c;
        }
    }

    final void d(asgb asgb0) {
        synchronized(this) {
            for(Object object0: this.b.values()) {
                aqgk aqgk0 = (aqgk)object0;
                try {
                    aqgk0.b(((float)asgb0.a()) / ((float)asgb0.c));
                }
                catch(RemoteException remoteException0) {
                    asgc.a.n("Remote exception while calling callbacks", remoteException0, new Object[0]);
                }
            }
        }
    }

    public final void e(int v) {
        synchronized(this) {
            for(Object object0: this.b.values()) {
                aqgk aqgk0 = (aqgk)object0;
                try {
                    aqgk0.a(v);
                }
                catch(RemoteException remoteException0) {
                    asgc.a.n("Remote exception while calling callbacks", remoteException0, new Object[0]);
                }
            }
        }
    }

    final void f(int v, int v1) {
        synchronized(this) {
            for(Object object0: this.b.values()) {
                aqgk aqgk0 = (aqgk)object0;
                try {
                    aqgk0.c(v, v1);
                }
                catch(RemoteException remoteException0) {
                    asgc.a.n("Remote exception while calling callbacks", remoteException0, new Object[0]);
                }
            }
        }
    }

    public final void g(float f) {
        synchronized(this) {
            for(Object object0: this.b.values()) {
                aqgk aqgk0 = (aqgk)object0;
                try {
                    aqgk0.b(f);
                }
                catch(RemoteException remoteException0) {
                    asgc.a.n("Remote exception while calling callbacks", remoteException0, new Object[0]);
                }
            }
        }
    }

    public final void h(String s) {
        synchronized(this) {
            asgc.a.j("Removing callbacks, id = %s", new Object[]{s});
            this.b.remove(s);
        }
    }

    public final void i() {
        synchronized(this) {
            batl.m(this.c > 0, "Attempted to remove an operation, but no operation is running.");
            --this.c;
        }
    }
}

