import j..time.Duration;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class fvze implements Runnable {
    public final fvzk a;
    public final Collection b;
    public final long c;
    public final Double d;
    public final long e;

    public fvze(fvzk fvzk0, Collection collection0, long v, Double double0, long v1) {
        this.a = fvzk0;
        this.b = collection0;
        this.c = v;
        this.d = double0;
        this.e = v1;
    }

    @Override
    public final void run() {
        fvzk fvzk1;
        long v5;
        int v4;
        Integer integer0;
        long v2;
        cjgh cjgh0;
        Iterator iterator0;
        fvzk fvzk0 = this.a;
        long v = this.c;
        Double double0 = this.d;
        long v1 = this.e;
        __monitor_enter(fvzk0);
        try {
            iterator0 = this.b.iterator();
            while(true) {
            label_6:
                if(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    cjgh0 = (cjgh)object0;
                    v2 = cjgh0.a;
                    int v3 = fvzk0.b.a(v2);
                    Map map0 = fvzk0.j;
                    integer0 = v3;
                    Double double1 = (Double)map0.get(integer0);
                    v4 = (int)cjgh0.f;
                    double f = fvzm.a(fvzk0.i, 0L, v4);
                    Double double2 = f;
                    if(double1 != null) {
                        double2.getClass();
                        if(f <= ((double)double1)) {
                            v = v;
                            continue;
                        }
                    }
                    map0.put(integer0, double2);
                    v5 = Duration.ofNanos(v).toMillis();
                    fvzk1 = fvzk0;
                    goto label_29;
                }
                goto label_34;
            }
        }
        catch(Throwable throwable0) {
            try {
                fvzk1 = fvzk0;
                goto label_39;
            label_29:
                fvzk0.k.put(integer0, new fvzj(v5, ((double)double0), new fvzf(v2, v4, ((double)cjgh0.g)), v1));
                iterator0 = iterator0;
                v = v;
                fvzk0 = fvzk1;
                goto label_6;
            label_34:
                fvzk1 = fvzk0;
                __monitor_exit(fvzk1);
                return;
            label_39:
                __monitor_exit(fvzk1);
            }
            catch(Throwable throwable0) {
                goto label_39;
            }
        }
        throw throwable0;
    }
}

