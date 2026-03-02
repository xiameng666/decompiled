import java.util.ArrayList;
import java.util.List;

final class iawg extends iaku {
    public final iaku a;
    public volatile boolean b;
    public List c;

    public iawg(iaku iaku0) {
        this.c = new ArrayList();
        this.a = iaku0;
    }

    @Override  // iaku
    public final void a(iapk iapk0, iaof_metadata iaof0) {
        this.e(new iawe(this, iapk0, iaof0));
    }

    @Override  // iaku
    public final void b(iaof_metadata iaof0) {
        if(this.b) {
            this.a.b(iaof0);
            return;
        }
        this.e(new iawc(this, iaof0));
    }

    @Override  // iaku
    public final void c(Object object0) {
        if(this.b) {
            this.a.c(object0);
            return;
        }
        this.e(new iawd(this, object0));
    }

    @Override  // iaku
    public final void d() {
        if(this.b) {
            this.a.d();
            return;
        }
        this.e(new iawf(this));
    }

    private final void e(Runnable runnable0) {
        synchronized(this) {
            if(!this.b) {
                this.c.add(runnable0);
                return;
            }
        }
        runnable0.run();
    }
}

