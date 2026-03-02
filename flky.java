import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class flky {
    private final ConcurrentMap a;
    private final ConcurrentMap b;
    private final ConcurrentMap c;
    private final ConcurrentMap d;
    private final Context e;
    private final gfsx f;
    private final gfsx g;
    private final flsl h;

    public flky(Context context0, flsl flsl0, gfsx gfsx0, gfsx gfsx1) {
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = context0;
        this.h = flsl0;
        this.f = gfsx0;
        this.g = gfsx1;
    }

    public final flkx a(long v) {
        flkx flkx2;
        synchronized(this) {
            ConcurrentMap concurrentMap0 = this.d;
            Long long0 = v;
            if(concurrentMap0.containsKey(long0)) {
                return (flkx)concurrentMap0.get(long0);
            }
            flkx flkx1 = new flkx(this.e, v);
            flkx2 = (flkx)gfsx.l(((flkx)concurrentMap0.putIfAbsent(long0, flkx1))).f(flkx1);
        }
        return flkx2;
    }

    public final fmou b(AccountContext accountContext0) {
        fmou fmou1;
        synchronized(this) {
            long v1 = accountContext0.a();
            Long long0 = v1;
            ConcurrentMap concurrentMap0 = this.a;
            if(concurrentMap0.containsKey(long0)) {
                return (fmou)concurrentMap0.get(long0);
            }
            long0.getClass();
            flkx flkx0 = this.a(v1);
            long0.getClass();
            flnc flnc0 = this.c(v1);
            long0.getClass();
            flmu flmu0 = new flmu(this.e, accountContext0, this.h, flkx0, flnc0, v1);
            fmou1 = (fmou)gfsx.l(((fmou)concurrentMap0.putIfAbsent(long0, flmu0))).f(flmu0);
        }
        return fmou1;
    }

    public final flnc c(long v) {
        flnc flnc2;
        synchronized(this) {
            ConcurrentMap concurrentMap0 = this.c;
            Long long0 = v;
            if(concurrentMap0.containsKey(long0)) {
                return (flnc)concurrentMap0.get(long0);
            }
            flnc flnc1 = new flnc(this.a(v));
            flnc2 = (flnc)gfsx.l(((flnc)concurrentMap0.putIfAbsent(long0, flnc1))).f(flnc1);
        }
        return flnc2;
    }

    public final flla d(AccountContext accountContext0) {
        flla flla2;
        synchronized(this) {
            long v1 = accountContext0.a();
            Long long0 = v1;
            ConcurrentMap concurrentMap0 = this.b;
            if(concurrentMap0.containsKey(long0)) {
                return (flla)concurrentMap0.get(long0);
            }
            long0.getClass();
            flnc flnc0 = this.c(v1);
            long0.getClass();
            flla flla1 = new flla(this.e, flnc0, v1);
            flla2 = (flla)gfsx.l(((flla)concurrentMap0.putIfAbsent(long0, flla1))).f(flla1);
        }
        return flla2;
    }
}

