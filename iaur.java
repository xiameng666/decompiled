import j..util.Objects;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class iaur implements Runnable {
    public final boolean a;
    public final boolean b;
    public final long c;
    public volatile ScheduledFuture d;
    public volatile boolean e;
    final iaux f;

    public iaur(iaux iaux0, ials ials0, boolean z) {
        Objects.requireNonNull(iaux0);
        this.f = iaux0;
        super();
        this.a = z;
        if(ials0 == null) {
            this.b = false;
            this.c = 0L;
            return;
        }
        this.b = true;
        this.c = ials0.b(TimeUnit.NANOSECONDS);
    }

    final iapk a() {
        long v = Math.abs(this.c) / TimeUnit.SECONDS.toNanos(1L);
        long v1 = Math.abs(this.c) % TimeUnit.SECONDS.toNanos(1L);
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append((this.a ? "Context" : "CallOptions"));
        stringBuilder0.append(" deadline exceeded after ");
        if(this.c < 0L) {
            stringBuilder0.append('-');
        }
        stringBuilder0.append(v);
        stringBuilder0.append(String.format(Locale.US, ".%09d", v1));
        stringBuilder0.append("s. ");
        iaux iaux0 = this.f;
        Long long0 = (Long)iaux0.g.j(ialc.f);
        stringBuilder0.append(String.format(Locale.US, "Name resolution delay %.9f seconds.", ((double)(long0 == null ? 0.0 : ((double)(((long)long0))) / iaux.a))));
        if(iaux0.h != null) {
            iayp iayp0 = new iayp();
            iaux0.h.b(iayp0);
            stringBuilder0.append(" ");
            stringBuilder0.append(iayp0);
        }
        return iapk.f.f(stringBuilder0.toString());
    }

    final void b() {
        this.e = true;
        ScheduledFuture scheduledFuture0 = this.d;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
    }

    @Override
    public final void run() {
        this.f.h.c(this.a());
    }
}

