import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

public final class fuvj {
    public static final fvuu a;
    public final fuvh b;
    public final futr c;
    public final List d;
    public final futx e;
    public final fwyd f;
    public fvuu g;
    public long h;
    public boolean i;
    public long j;
    public int k;

    static {
        fuvj.a = new fvuu(3, -1.0);
    }

    public fuvj(fwyd fwyd0) {
        this.b = new fuvh();
        this.c = new futr();
        this.d = new ArrayList();
        this.g = fuvj.a;
        this.h = 0L;
        this.i = false;
        this.k = 0;
        this.j = 0L;
        this.f = fwyd0;
        this.e = new futx();
    }

    public final boolean a() {
        return this.g != null && SystemClock.elapsedRealtime() - this.h <= 360000L && this.g != fuvj.a;
    }
}

