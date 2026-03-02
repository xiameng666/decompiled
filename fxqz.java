import android.content.Context;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fxqz {
    public final ayvf a;
    private final ayud b;
    private final Context c;
    private long d;
    private long e;
    private Boolean f;
    private Boolean g;
    private long h;

    public fxqz(Context context0) {
        this.h = SystemClock.elapsedRealtime();
        Context context1 = context0.getApplicationContext();
        this.c = context1;
        ayud ayud0 = ayud.k(context1, "LE");
        this.b = ayud0;
        this.a = new ayvf(ayud0, "LE_ULR_COUNTERS", 0x400);
    }

    final void a() {
        synchronized(this) {
            ++this.e;
        }
    }

    public final void b(boolean z) {
        synchronized(this) {
            this.g(this.g, Boolean.valueOf(z));
        }
    }

    final void c(boolean z) {
        synchronized(this) {
            boolean z1 = cjer_LocationSettings.p(this.c);
            boolean z2 = false;
            boolean z3 = this.f == null || this.f.booleanValue() != z1;
            if(this.g == null || this.g.booleanValue() != z) {
                z2 = true;
            }
            if(!z2 && !z3 && SystemClock.elapsedRealtime() - this.h <= hzek.a.i().j()) {
                return;
            }
            this.g(Boolean.valueOf(z), Boolean.valueOf(z1));
        }
    }

    public final void d() {
        synchronized(this) {
            long v1 = SystemClock.elapsedRealtime();
            if(this.e <= hzek.a.i().i() && v1 - this.d <= hzek.a.i().h()) {
                return;
            }
            this.f();
        }
    }

    public final void e() {
        evql evql0 = this.a.h();
        try {
            evrg.o(evql0, hzek.a.i().k(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            fxqw.g("Clearcut: error uploading", exception0);
        }
    }

    final void f() {
        synchronized(this) {
            if(this.e == 0L) {
                return;
            }
            long v1 = SystemClock.elapsedRealtime();
            new fxqy(this).start();
            this.d = v1;
            this.e = 0L;
        }
    }

    private final void g(Boolean boolean0, Boolean boolean1) {
        Objects.toString(boolean0);
        Objects.toString(boolean1);
        this.f = boolean1;
        this.g = boolean0;
        this.h = SystemClock.elapsedRealtime();
    }
}

