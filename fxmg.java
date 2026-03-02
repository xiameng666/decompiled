import android.os.SystemClock;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fxmg {
    public final fxlu a;
    public final bbng b;
    public boolean c;
    public long d;
    public final fxmv e;
    private static volatile fxmg f;
    private final long g;
    private final boolean h;
    private Boolean i;

    private fxmg(fxlu fxlu0, bbng bbng0, long v, boolean z) {
        this.c = false;
        this.i = null;
        this.a = fxlu0;
        this.b = bbng0;
        long v1 = TimeUnit.SECONDS.toMillis(v);
        this.g = v1;
        this.d = -v1;
        this.e = new fxmv(20, new fxmf());
        this.h = z;
    }

    public static fxmg a() {
        if(fxmg.f == null) {
            Class class0 = fxmg.class;
            synchronized(class0) {
                if(fxmg.f == null) {
                    fxlu fxlu0 = fxlu.a();
                    long v1 = huqb.a.s().U();
                    boolean z = huqb.u();
                    fxmg.f = new fxmg(fxlu0, bbnk.a, v1, z);
                }
            }
            return fxmg.f;
        }
        return fxmg.f;
    }

    public final boolean b() {
        if(!this.h) {
            if(this.i == null) {
                Boolean boolean0 = Boolean.valueOf(bbmn.s(AppContextProvider.a()));
                this.i = boolean0;
                this.e.e(4, Boolean.toString(boolean0.booleanValue()));
            }
            return this.i != null && this.i.booleanValue();
        }
        return true;
    }

    public final boolean c() {
        if(huqb.w() && this.b() && !this.c) {
            long v = SystemClock.elapsedRealtime();
            if(v - this.d > this.g) {
                try {
                    boolean z = ((Boolean)((glyq)glzd.f(this.a.a.a(), new fxlq(), gmap.a)).v(3L, TimeUnit.SECONDS)).booleanValue();
                    this.c = z;
                    this.e.e(1, Boolean.toString(z));
                }
                catch(InterruptedException | ExecutionException | TimeoutException unused_ex) {
                    this.e.d(3);
                }
                this.d = v;
            }
        }
        return this.c;
    }
}

