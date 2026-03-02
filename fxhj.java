import android.os.Vibrator.OnVibratorStateChangedListener;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public final class fxhj extends fxov implements Supplier {
    public final long a;
    public volatile boolean b;
    public static final int c;
    private final VibratorManager d;
    private ScheduledExecutorService e;
    private List f;

    static {
        bboh.c("EQMon", bbcu.g, "VibMon");
    }

    public fxhj(VibratorManager vibratorManager0, fxnw fxnw0, long v) {
        super(fxnw0);
        this.d = vibratorManager0;
        this.a = v;
    }

    public final Long a() {
        long v = -1L;
        for(Object object0: this.f) {
            v = Math.max(((fxhi)((Pair)object0).second).a(), v);
        }
        return v;
    }

    @Override  // fxov
    public final fxou b() {
        return this.b ? new fxou(2, 20) : fxou.b;
    }

    public final void c(long v) {
        ScheduledExecutorService scheduledExecutorService0 = this.e;
        if(scheduledExecutorService0 != null) {
            try {
                ((bbll)scheduledExecutorService0).g(new fxhh(this), v, TimeUnit.MILLISECONDS);
            }
            catch(RejectedExecutionException unused_ex) {
            }
        }
    }

    @Override  // fxov
    public final void f() {
        synchronized(this) {
            this.e = new bbll(1, 10);
            this.b = false;
            this.f = new ArrayList();
            VibratorManager vibratorManager0 = this.d;
            int[] arr_v = vibratorManager0.getVibratorIds();
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                Vibrator vibrator0 = vibratorManager0.getVibrator(arr_v[v1]);
                if(vibrator0 != null) {
                    fxhi fxhi0 = new fxhi(this);
                    vibrator0.addVibratorStateListener(fxhi0);
                    this.f.add(Pair.create(vibrator0, fxhi0));
                }
            }
        }
    }

    @Override  // fxov
    public final void g() {
        synchronized(this) {
            List list0 = this.f;
            if(list0 != null) {
                for(Object object0: list0) {
                    ((Vibrator)((Pair)object0).first).removeVibratorStateListener(((Vibrator.OnVibratorStateChangedListener)((Pair)object0).second));
                }
            }
            ScheduledExecutorService scheduledExecutorService0 = this.e;
            if(scheduledExecutorService0 != null) {
                scheduledExecutorService0.shutdownNow();
                this.e = null;
            }
        }
    }

    @Override
    public final Object get() {
        return this.a();
    }
}

