import java.util.concurrent.TimeUnit;

@ibnh
public final class foua {
    public final gfsi a;
    public volatile boolean b;
    private final gfug c;
    private volatile Process d;

    public foua(gfuv gfuv0) {
        this.b = false;
        this.a = new fotz(this);
        this.c = new gfug(gfuv0);
    }

    public final void a(String s) {
        if(!s.isEmpty()) {
            if(this.d != null) {
                try {
                    if(this.d.exitValue() != 0) {
                        this.b = true;
                        this.d = null;
                    }
                }
                catch(IllegalThreadStateException unused_ex) {
                    return;
                }
            }
            if(!this.b) {
                synchronized(this) {
                    gfug gfug0 = this.c;
                    if(gfug0.a && gfug0.a(TimeUnit.MILLISECONDS) < 60000L) {
                        return;
                    }
                    gfug0.e();
                    gfug0.f();
                    this.d = (Process)this.a.apply(s);
                }
            }
        }
    }
}

