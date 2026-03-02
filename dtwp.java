import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.pay.GetMdlRefreshTimestampsRequest;
import com.google.android.gms.pay.StoreMdlRefreshTimestampRequest;
import j..util.Collection.-EL;
import j..util.stream.Collectors;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class dtwp extends dtwk {
    public static final bboh j;
    public final Context k;
    private static final Map l;

    static {
        dtwp.j = bboh.b("Pay", bbcu.cZ);
        dtwp.l = ggkm.k(1);
    }

    public dtwp(Context context0, Account account0, dtxm dtxm0, dtqm dtqm0, dtts dtts0, dtze dtze0, azts azts0, gmcg gmcg0) {
        super(account0, dtxm0, dtqm0, dtts0, dtze0, azts0, gmcg0);
        this.k = context0;
    }

    @Override  // dtwk
    protected final gmcd d(String s) {
        gmcd gmcd0 = super.d(s);
        gmbu.t(gmcd0, new dtwo(this, s), gmap.a);
        return gmcd0;
    }

    @Override  // dtwk
    protected final void e(Set set0) {
        AtomicLong atomicLong0;
        long v = System.currentTimeMillis();
        Map map0 = dtwp.l;
        synchronized(map0) {
            Account account0 = this.b;
            atomicLong0 = (AtomicLong)map0.get(account0.name);
            if(atomicLong0 == null) {
                atomicLong0 = new AtomicLong(0L);
                map0.put(account0.name, atomicLong0);
            }
        }
        long v2 = atomicLong0.get();
        hwly hwly0 = hwly.a;
        if(v2 <= v && atomicLong0.compareAndSet(v2, TimeUnit.SECONDS.toMillis(hwly0.j().l()) + v)) {
            Set set1 = (Set)Collection.-EL.stream(set0).map(new dtwl()).collect(Collectors.toSet());
            TimeUnit timeUnit0 = TimeUnit.SECONDS;
            GetMdlRefreshTimestampsRequest getMdlRefreshTimestampsRequest0 = new GetMdlRefreshTimestampsRequest();
            getMdlRefreshTimestampsRequest0.a = (String[])set1.toArray(new String[0]);
            getMdlRefreshTimestampsRequest0.b = System.currentTimeMillis() - timeUnit0.toMillis(hwly0.j().j());
            getMdlRefreshTimestampsRequest0.d = false;
            getMdlRefreshTimestampsRequest0.f = this.b;
            azts azts0 = this.h;
            azzc azzc0 = new azzc();
            azzc0.a = new dorj(getMdlRefreshTimestampsRequest0);
            azzc0.c = new Feature[]{dlde.ak};
            azzc0.b = false;
            azzc0.d = 7321;
            evql evql0 = azts0.iG(azzc0.a());
            evql0.b(new dtwm(this, set0, set1));
            evql0.A(new dtwn(this, set1));
        }
    }

    public final void f(String s, boolean z, long v) {
        long v1 = v - TimeUnit.SECONDS.toMillis(hwly.h());
        StoreMdlRefreshTimestampRequest storeMdlRefreshTimestampRequest0 = new StoreMdlRefreshTimestampRequest();
        storeMdlRefreshTimestampRequest0.e = z;
        storeMdlRefreshTimestampRequest0.d = this.b;
        storeMdlRefreshTimestampRequest0.a = s;
        storeMdlRefreshTimestampRequest0.b = v;
        storeMdlRefreshTimestampRequest0.c = v1;
        azzc azzc0 = new azzc();
        azzc0.a = new dopt(storeMdlRefreshTimestampRequest0);
        azzc0.c = new Feature[]{dlde.al};
        azzc0.b = false;
        azzc0.d = 7322;
        azzd azzd0 = azzc0.a();
        this.h.jn(azzd0);
    }
}

