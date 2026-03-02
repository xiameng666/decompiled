import android.os.SystemClock;
import j..util.Optional;

public final class fvzw {
    public long a;
    public Optional b;
    public final int c;

    public fvzw(int v) {
        this.b = Optional.empty();
        this.c = v;
    }

    final void a(fvzs_BatchInfo fvzs0) {
        if(this.b.isEmpty()) {
            return;
        }
        Object object0 = this.b.get();
        ((fvzu)object0).a(SystemClock.elapsedRealtime());
        ((fvzu)object0).e = fvzs0;
    }
}

