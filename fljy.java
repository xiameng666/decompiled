import android.os.Handler;
import android.os.Looper;
import j..util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class fljy {
    public final Set a;
    public final AtomicBoolean b;
    public int c;
    public int d;
    private final Handler e;

    public fljy() {
        this.c = 0;
        this.d = 0;
        this.a = DesugarCollections.synchronizedSet(new HashSet());
        this.e = new Handler(Looper.getMainLooper());
        this.b = new AtomicBoolean(false);
    }

    public final void a() {
        AtomicBoolean atomicBoolean0 = this.b;
        if(atomicBoolean0.get()) {
            return;
        }
        atomicBoolean0.set(true);
        fljx fljx0 = new fljx(this);
        this.e.postDelayed(fljx0, 500L);
    }
}

