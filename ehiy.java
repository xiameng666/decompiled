import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class ehiy {
    public static final ehiy a;
    private final Map b;

    static {
        ehiy.a = new ehiy();
    }

    private ehiy() {
        this.b = new HashMap();
    }

    public final ehix a(String s) {
        ehix ehix3;
        synchronized(this) {
            if(hwyp.i() && hwyp.a.c().n()) {
                if(!this.b.containsKey(s)) {
                    synchronized(this) {
                        Map map0 = this.b;
                        if(!map0.containsKey(s)) {
                            map0.put(s, new ehix());
                        }
                    }
                }
                ehix ehix0 = (ehix)this.b.get(s);
                if(ehix0.c()) {
                    return ehix0;
                }
                if(hxdo.a.b().y() && ehix0.a()) {
                    ehix ehix1 = new ehix();
                    this.c(s, ehix1);
                    if(ehix1.c()) {
                        return ehix1;
                    }
                }
                return new ehix();
            }
            ehix3 = new ehix();
            ehix3.c();
        }
        return ehix3;
    }

    public final ehix b(String s, long v) {
        ehix ehix0;
        synchronized(this) {
            ehix0 = this.a(s);
            gfug gfug0 = gfug.c(gfqs.a);
            while(true) {
                try {
                    hxdo hxdo0 = hxdo.a;
                    if(!hxdo0.b().A() || ehix0.b() || gfug0.a(TimeUnit.MILLISECONDS) > v) {
                        break;
                    }
                    ehix0 = this.a(s);
                    TimeUnit.MILLISECONDS.sleep(hxdo0.b().c());
                }
                catch(InterruptedException unused_ex) {
                    egig.k("AccountSyncResourceManager", "Waiting sync resource get interrupted");
                    break;
                }
            }
            gfug0.g();
            gfug0.a(TimeUnit.MILLISECONDS);
        }
        return ehix0;
    }

    private final void c(String s, ehix ehix0) {
        synchronized(this) {
            this.b.put(s, ehix0);
        }
    }
}

