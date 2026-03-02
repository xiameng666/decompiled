import android.util.ArrayMap;
import com.google.android.gms.nearby.sharing.ShareTarget;
import j..util.Objects;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

public final class dfuj {
    public final ScheduledExecutorService a;
    private final Map b;
    private final List c;

    public dfuj() {
        ScheduledExecutorService scheduledExecutorService0 = cuui.f();
        super();
        this.b = new ArrayMap();
        this.c = new ArrayList();
        this.a = scheduledExecutorService0;
    }

    public final dfui a(ShareTarget shareTarget0) {
        synchronized(this) {
            if(this.n(shareTarget0)) {
                return null;
            }
        }
        return (dfui)this.b.get(Long.valueOf(shareTarget0.a));
    }

    public final List b() {
        List list0;
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(this.b.values());
            Collections.sort(arrayList0, new dfuh());
            list0 = gged_interceptors.i(arrayList0);
        }
        return list0;
    }

    public final void c(ShareTarget shareTarget0, String s, byte[] arr_b) {
        synchronized(this) {
            if(hvqz.a.b().u() && !shareTarget0.h) {
                dcvz.a.b().i("Skipped caching (%s)%s, because the target is unknown", s, shareTarget0.b);
                return;
            }
            Map map0 = this.b;
            Long long0 = (long)shareTarget0.a;
            dfui dfui0 = (dfui)map0.get(long0);
            if(dfui0 != null) {
                dfui0.a();
            }
            map0.put(long0, new dfui(shareTarget0, s, arr_b));
            dcvz.a.b().i("Added endpoint(%s)%s into cache.", s, shareTarget0.b);
            for(Object object0: this.c) {
                dfyw dfyw0 = (dfyw)object0;
            }
        }
    }

    public final void d(ShareTarget shareTarget0) {
        synchronized(this) {
            for(Object object0: this.b.values()) {
                dfui dfui0 = (dfui)object0;
                if(dfui0.a.a == shareTarget0.a) {
                    dfui0.a();
                    return;
                }
            }
        }
    }

    public final void e(PrintWriter printWriter0) {
        synchronized(this) {
            printWriter0.println("DiscoveryCachingManager cached endpoints:");
            for(Object object0: this.b.values()) {
                printWriter0.print("  ");
                printWriter0.print(((dfui)object0).b);
                printWriter0.print(" | ");
                printWriter0.println(((dfui)object0).a);
            }
        }
    }

    // Detected as a lambda impl.
    public final void f(dfui dfui0) {
        synchronized(this) {
            ShareTarget shareTarget0 = dfui0.a;
            long v1 = shareTarget0.a;
            if(((dfui)this.b.get(Long.valueOf(v1))) == dfui0) {
                dcvz.a.b().h("Process cached endpoint(%s) timeout - remove shareTarget and report expired.", dfui0.b);
                this.p(v1, dfui0.b);
                dcvz.a.b().h("Reporting share target %s expired.", shareTarget0.b);
                for(Object object0: this.c) {
                    dfyv dfyv0 = new dfyv(((dfyw)object0), shareTarget0);
                    ((dfyw)object0).a.aU(dfyv0);
                }
            }
        }
    }

    public final void g(ShareTarget shareTarget0) {
        synchronized(this) {
            this.p(shareTarget0.a, null);
        }
    }

    public final void h(ShareTarget shareTarget0, String s) {
        synchronized(this) {
            this.p(shareTarget0.a, s);
        }
    }

    public final void i() {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(this.b.keySet());
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                this.p(((Long)arrayList0.get(v2)).longValue(), null);
            }
        }
    }

    public final void j(ShareTarget shareTarget0) {
        synchronized(this) {
            long v1 = shareTarget0.a;
            if(((dfui)this.b.get(Long.valueOf(v1))) == null) {
                return;
            }
            this.q(v1, hvqs.w());
        }
    }

    public final void k() {
        synchronized(this) {
            long v1 = hvqs.w();
            for(Object object0: this.b.values()) {
                this.q(((dfui)object0).a.a, v1);
            }
        }
    }

    public final void l(ShareTarget shareTarget0) {
        synchronized(this) {
            long v1 = shareTarget0.a;
            if(((dfui)this.b.get(Long.valueOf(v1))) == null) {
                return;
            }
            this.q(v1, hvqs.v());
        }
    }

    public final void m() {
        synchronized(this) {
            for(Object object0: this.b.values()) {
                this.l(((dfui)object0).a);
            }
        }
    }

    public final boolean n(ShareTarget shareTarget0) {
        boolean z;
        synchronized(this) {
            dfui dfui0 = (dfui)this.b.get(Long.valueOf(shareTarget0.a));
            if(dfui0 == null) {
                dcvz.a.b().h("No cache info existed in %s", shareTarget0);
            }
            else {
                dcvz.a.b().i("Cache info existed in (%s)%s", dfui0.b, shareTarget0);
            }
            z = dfui0 == null || dfui0.d != null;
            dcvz.a.b().i("Cache is outdated=%s for %s", Boolean.valueOf(z), shareTarget0);
        }
        return z;
    }

    public final void o(dfyw dfyw0) {
        synchronized(this) {
            this.c.add(dfyw0);
            for(Object object0: this.b.values()) {
                dfui dfui0 = (dfui)object0;
            }
        }
    }

    private final void p(long v, String s) {
        Map map0 = this.b;
        Long long0 = v;
        dfui dfui0 = (dfui)map0.get(long0);
        if(dfui0 != null) {
            cunf cunf0 = dcvz.a;
            cunf cunf1 = cunf0.d();
            String s1 = dfui0.b;
            cunf1.i("Comparing cachedEndpoint %s with endpoint %s to check need to remove.", s1, s);
            if(s == null || Objects.equals(s1, s)) {
                map0.remove(long0);
                dfui0.a();
                for(Object object0: this.c) {
                    dfyw dfyw0 = (dfyw)object0;
                }
                cunf0.b().h("Removed endpoint %s from cache.", s1);
            }
        }
    }

    private final void q(long v, long v1) {
        dfui dfui0 = (dfui)this.b.get(Long.valueOf(v));
        if(dfui0 == null) {
            return;
        }
        dfug dfug0 = () -> synchronized(this) {
            ShareTarget shareTarget0 = dfui0.a;
            long v1 = shareTarget0.a;
            if(((dfui)this.b.get(Long.valueOf(v1))) == dfui0) {
                dcvz.a.b().h("Process cached endpoint(%s) timeout - remove shareTarget and report expired.", dfui0.b);
                this.p(v1, dfui0.b);
                dcvz.a.b().h("Reporting share target %s expired.", shareTarget0.b);
                for(Object object0: this.c) {
                    dfyv dfyv0 = new dfyv(((dfyw)object0), shareTarget0);
                    ((dfyw)object0).a.aU(dfyv0);
                }
            }
        };
        cumn cumn0 = cumn.d(dcvz.a, dfug0, v1, this.a);
        dfui0.a();
        dfui0.d = cumn0;
        dcvz.a.b().i("Set timeout alarm for cached endpoint %s with %s millis.", dfui0.b, Long.valueOf(v1));
    }
}

