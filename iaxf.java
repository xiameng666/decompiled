import java.util.ArrayList;
import java.util.List;

final class iaxf implements iava {
    public final iava a;
    public volatile boolean b;
    public List c;

    public iaxf(iava iava0) {
        this.c = new ArrayList();
        this.a = iava0;
    }

    @Override  // iava
    public final void a(iapk iapk0, iauz iauz0, iaof_metadata iaof0) {
        this.b(new iaxe(this, iapk0, iauz0, iaof0));
    }

    private final void b(Runnable runnable0) {
        synchronized(this) {
            if(!this.b) {
                this.c.add(runnable0);
                return;
            }
        }
        runnable0.run();
    }

    @Override  // iava
    public final void c(iaof_metadata iaof0) {
        this.b(new iaxd(this, iaof0));
    }

    @Override  // ibfq
    public final void d(ibfp ibfp0) {
        if(this.b) {
            this.a.d(ibfp0);
            return;
        }
        this.b(new iaxb(this, ibfp0));
    }

    @Override  // ibfq
    public final void e() {
        if(this.b) {
            this.a.e();
            return;
        }
        this.b(new iaxc(this));
    }
}

