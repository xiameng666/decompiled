import j..util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class bdvq implements evpo {
    public final bdvw a;
    public final ScheduledExecutorService b;
    public final bdvu c;
    public final bdvs d;

    public bdvq(bdvw bdvw0, ScheduledExecutorService scheduledExecutorService0, bdvu bdvu0, bdvs bdvs0) {
        this.a = bdvw0;
        this.b = scheduledExecutorService0;
        this.c = bdvu0;
        this.d = bdvs0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.i() == null && ((gfsx)evql0.j()).i()) {
            return evrg.d(((bdvt)((gfsx)evql0.j()).d()));
        }
        bdvv bdvv0 = new bdvv(this.c.a, this.d, this.a.c);
        clcf clcf0 = clcg.f(this.c.a, ckdb.b, clbk.a, clbj.a);
        clcn clcn0 = this.a.b.f(clcf0, bdvv0, this.b, this.a.d).e();
        Objects.requireNonNull(clcn0);
        bdvr bdvr0 = new bdvr(clcn0);
        ((bbll)this.b).g(bdvr0, this.c.b, TimeUnit.MILLISECONDS);
        clcn0.a();
        return bdvv0.a.a;
    }
}

