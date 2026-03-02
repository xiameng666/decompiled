import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

public final class ini extends iccd {
    public static final ibnn a;
    public static final ThreadLocal b;
    public final Choreographer c;
    public final Handler d;
    public final Object e;
    public List f;
    public List g;
    public boolean h;
    public final inh i;
    public final gqt j;
    private final ibpf m;
    private boolean n;

    static {
        ini.a = new ibnz(ine.a);
        ini.b = new inf();
    }

    public ini(Choreographer choreographer0, Handler handler0) {
        this.c = choreographer0;
        this.d = handler0;
        this.e = new Object();
        this.m = new ibpf();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = new inh(this);
        this.j = new inn(choreographer0, this);
    }

    @Override  // iccd
    public final void a(ibrt ibrt0, Runnable runnable0) {
        synchronized(this.e) {
            this.m.addLast(runnable0);
            if(!this.n) {
                this.n = true;
                inh inh0 = this.i;
                this.d.post(inh0);
                if(!this.h) {
                    this.h = true;
                    this.c.postFrameCallback(inh0);
                }
            }
        }
    }

    public final void b() {
        boolean z;
        do {
            for(Runnable runnable0 = this.e(); runnable0 != null; runnable0 = this.e()) {
                runnable0.run();
            }
            synchronized(this.e) {
                if(this.m.isEmpty()) {
                    z = false;
                    this.n = false;
                }
                else {
                    z = true;
                }
            }
        }
        while(z);
    }

    private final Runnable e() {
        Runnable runnable0;
        synchronized(this.e) {
            runnable0 = (Runnable)this.m.g();
        }
        return runnable0;
    }
}

