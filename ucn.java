import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ucn {
    final Map a;
    public final ReferenceQueue b;
    public volatile boolean c;
    public volatile ucl d;

    public ucn() {
        ExecutorService executorService0 = Executors.newSingleThreadExecutor(new ucj());
        super();
        this.a = new HashMap();
        this.b = new ReferenceQueue();
        executorService0.execute(new uck(this));
    }

    public final udt a(uay uay0) {
        udt udt0;
        synchronized(this) {
            ucm ucm0 = (ucm)this.a.get(uay0);
            if(ucm0 == null) {
                return null;
            }
            udt0 = (udt)ucm0.get();
            if(udt0 == null) {
                this.c(ucm0);
            }
        }
        return udt0;
    }

    public final void b(uay uay0, udt udt0) {
        synchronized(this) {
            ucm ucm0 = new ucm(uay0, udt0, this.b);
            ucm ucm1 = (ucm)this.a.put(uay0, ucm0);
            if(ucm1 != null) {
                ucm1.a();
            }
        }
    }

    final void c(ucm ucm0) {
        synchronized(this) {
            this.a.remove(ucm0.a);
        }
    }

    final void d(uay uay0) {
        synchronized(this) {
            ucm ucm0 = (ucm)this.a.remove(uay0);
            if(ucm0 != null) {
                ucm0.a();
            }
        }
    }
}

