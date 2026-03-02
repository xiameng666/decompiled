import android.location.GnssMeasurementsEvent.Callback;
import android.location.LocationManager;
import android.os.Looper;
import android.os.WorkSource;
import android.util.ArrayMap;
import android.util.Pair;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class fvbg implements Runnable {
    public final fvbo a;
    public final fvjw b;

    public fvbg(fvbo fvbo0, fvjw fvjw0) {
        this.a = fvbo0;
        this.b = fvjw0;
    }

    @Override
    public final void run() {
        fvbo fvbo0 = this.a;
        fvbo0.f.add(this.b);
        if(!fvbo0.f.isEmpty() && !fvbo0.l) {
            batl.l(((boolean)(fvbo0.l ^ 1)));
            fvbb fvbb0 = fvbo0.g;
            batl.l(((boolean)(fvbb0.l ^ 1)));
            Looper looper0 = Looper.getMainLooper();
            WorkSource workSource0 = new WorkSource();
            fvbb0.b.i(fvbb0.o, looper0, workSource0);
            LocationRequest locationRequest0 = new LocationRequest();
            locationRequest0.k(105);
            locationRequest0.g(hunr.a.m().J());
            LocationRequestInternal locationRequestInternal0 = new LocationRequestInternal(locationRequest0, null, false, false, false, false, 0x7FFFFFFFFFFFFFFFL);
            locationRequestInternal0.b(true);
            Looper looper1 = Looper.getMainLooper();
            fvbb0.c.m(locationRequestInternal0, fvbb0.n, looper1);
            LocationManager locationManager0 = fvbb0.b.a;
            Executor executor0 = fvbb0.d;
            jym.c(locationManager0, executor0, fvbb0.m);
            if(hunr.p()) {
                fyal fyal0 = fvbb0.e;
                if(fyal0 != null) {
                    fvbb0.f = new fvaz(fvbb0);
                    GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0 = fvbb0.f;
                    __monitor_enter(fyal0);
                    int v = FIN.finallyOpen$NT();
                    Pair pair0 = new Pair(locationManager0, executor0);
                    ArrayMap arrayMap0 = fyal0.a;
                    if(pair0.equals(arrayMap0.get(gnssMeasurementsEvent$Callback0))) {
                        FIN.finallyCodeBegin$NT(v);
                    }
                    else {
                        arrayMap0.put(gnssMeasurementsEvent$Callback0, pair0);
                        if(fyal0.d.get()) {
                            locationManager0.registerGnssMeasurementsCallback(executor0, gnssMeasurementsEvent$Callback0);
                        }
                        FIN.finallyExec$NT(v);
                    }
                }
            }
            fvbb0.l = true;
            fvbo0.t = fvbo0.e.d();
            fvbo0.e.b(fvbo0.v);
            fvbo0.i.aa();
            hunr hunr0 = hunr.a;
            boolean z = hunr0.m().aq();
            fvbo0.n = z;
            if(z) {
                Object object0 = fvbo0.j;
                __monitor_enter(object0);
                int v1 = FIN.finallyOpen$NT();
                if(fvbo0.m == null) {
                    fvbo0.m = new ggca(((int)hunr0.m().H()));
                }
                FIN.finallyCodeBegin$NT(v1);
                __monitor_exit(object0);
                FIN.finallyCodeEnd$NT(v1);
            }
            ScheduledExecutorService scheduledExecutorService0 = fvbo0.k;
            if(scheduledExecutorService0 != null) {
                fvbo0.s = 0L;
                fvbo0.r = 0L;
                fvbo0.q = ((bbll)scheduledExecutorService0).b(new fvbh(fvbo0), hunr.i(), hunr.i(), TimeUnit.SECONDS);
            }
            fvbo0.l = true;
        }
    }
}

