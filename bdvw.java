import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class bdvw {
    public static final bboh a;
    public final clbs b;
    public final byk c;
    public final clbp d;

    static {
        bdvw.a = bboh.b("GmsNetworkDataFetcher", bbcu.cX);
    }

    public bdvw(clbs clbs0, clbp clbp0) {
        this.c = new byk(0x400000);
        this.b = clbs0;
        this.d = clbp0;
    }

    public final evql a(ScheduledExecutorService scheduledExecutorService0, Executor executor0, bdvu bdvu0, bdvs bdvs0) {
        bdvp bdvp0 = new bdvp(this);
        evqp evqp0 = new evqp();
        String s = bdvu0.a;
        Object object0 = this.c.d(s);
        if(object0 == null) {
            new bblp(0x7FFFFFFF, 9).execute(new bdvo(evqp0, bdvp0, s, bdvs0));
        }
        else {
            evqp0.b(gfsx.m(new bdvt(object0, true)));
        }
        bdvq bdvq0 = new bdvq(this, scheduledExecutorService0, bdvu0, bdvs0);
        return evqp0.a.f(executor0, bdvq0);
    }
}

