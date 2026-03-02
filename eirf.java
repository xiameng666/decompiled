import android.util.LruCache;
import java.util.HashSet;
import java.util.Set;

public final class eirf {
    public static final eirf a;
    public final LruCache b;
    public final LruCache c;
    public final Set d;

    static {
        bboh.b("ExperimentTokensCache", bbcu.al);
        eirf.a = new eirf();
    }

    public eirf() {
        this.b = new eirc(this, ((int)hxln.b()));
        this.c = new eird(this, ((int)hxln.b()));
        this.d = new HashSet();
    }

    public final void a(eiox eiox0, eiog eiog0, String s) {
        this.e();
    }

    public final void b(eiox eiox0, eiog eiog0, String s) {
        this.c(eiox0, eiog0, s, ggnj.a);
    }

    public final void c(eiox eiox0, eiog eiog0, String s, ggfp ggfp0) {
        this.e();
    }

    public final void d(eiox eiox0, eiog eiog0, String s, ggfp ggfp0) {
        this.e();
    }

    public final void e() {
        if(hxln.d()) {
            synchronized(this.c) {
                this.c.evictAll();
                this.d.clear();
            }
            return;
        }
        this.b.evictAll();
    }
}

