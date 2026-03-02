import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class fmpe extends fmpa {
    public final Map a;
    public int b;
    private final Set c;

    public fmpe(Collection collection0) {
        this.c = new HashSet();
        this.a = new HashMap();
        for(Object object0: collection0) {
            fmpc fmpc0 = new fmpc(this, ((fmpa)object0));
            this.c.add(fmpc0);
            this.a.put(((fmpa)object0), null);
        }
    }

    public fmpe(fmpa[] arr_fmpa) {
        this.c = new HashSet();
        this.a = new HashMap();
        for(int v = 0; v < 2; ++v) {
            fmpa fmpa0 = arr_fmpa[v];
            fmpc fmpc0 = new fmpc(this, fmpa0);
            this.c.add(fmpc0);
            this.a.put(fmpa0, null);
        }
    }

    @Override  // fmpa
    protected final void a() {
        synchronized(this) {
            this.d();
        }
    }

    @Override  // fmpa
    protected final void b() {
        synchronized(this) {
            this.m();
        }
    }

    private final void d() {
        synchronized(this) {
            this.b = this.c.size();
            for(Object object0: this.c) {
                ((fmpc)object0).a();
            }
        }
    }

    private final void m() {
        synchronized(this) {
            this.b = -1;
            this.f();
            for(Object object0: this.c) {
                ((fmpc)object0).b();
            }
        }
    }
}

