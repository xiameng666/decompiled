import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class fwxa implements fwxg {
    public final ReentrantLock a;
    public final Condition b;
    public Boolean c;
    public List d;
    private final fwxh e;

    public fwxa(fwxh fwxh0) {
        ReentrantLock reentrantLock0 = new ReentrantLock();
        this.a = reentrantLock0;
        this.b = reentrantLock0.newCondition();
        this.c = null;
        this.d = Collections.EMPTY_LIST;
        this.e = fwxh0;
        fwxh0.e = this;
    }

    public final void a() {
        if(this.c == null) {
            try {
                if(this.d()) {
                    for(long v = TimeUnit.SECONDS.toNanos(1L); this.c == null && v > 0L; v = this.b.awaitNanos(v)) {
                    }
                }
            }
            catch(InterruptedException throwable0) {
                if(this.c == null) {
                    this.c = Boolean.valueOf(false);
                    this.d = Collections.EMPTY_LIST;
                }
                throw throwable0;
            }
            catch(Throwable unused_ex) {
            }
            if(this.c == null) {
                this.c = Boolean.valueOf(false);
                this.d = Collections.EMPTY_LIST;
            }
        }
    }

    public final void b() {
        this.a.lock();
        this.c = null;
        this.d = Collections.EMPTY_LIST;
        this.a.unlock();
    }

    public final boolean c() {
        boolean z;
        this.a.lock();
        try {
            this.a();
            z = this.c.booleanValue();
        }
        finally {
            this.a.unlock();
        }
        return z;
    }

    public final boolean d() {
        gwww gwww0 = fwwz.a(gwwv.c);
        return this.e.c(gwww0);
    }

    public final int[] e() {
        huou huou0 = huou.a;
        if(huou0.c().q()) {
            return fwyt.o;
        }
        fwxh fwxh0 = this.e;
        if(fwxh0.b() < 0) {
            return huou0.c().r() ? fwyt.o : fwyt.n;
        }
        return ((long)fwxh0.b()) < huou.b() ? fwyt.n : fwyt.o;
    }
}

