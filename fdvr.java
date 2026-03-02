import android.os.SystemClock;
import android.text.format.DateUtils;
import android.text.format.Time;

final class fdvr {
    public int a;
    public int b;
    public int c;
    private long d;
    private long e;
    private long f;
    private long g;

    final void a(bbpd bbpd0) {
        long v = this.f == 0L ? SystemClock.elapsedRealtime() : this.f;
        bbpd0.printf("Session: (%s/%s), (%d/%d/%d), duration %s", new Object[]{fdvr.g(this.d), (this.g == 0L ? "N/A" : fdvr.g(this.g)), ((int)this.a), ((int)this.b), ((int)this.c), DateUtils.formatElapsedTime((v - this.e) / 1000L)});
    }

    public final void b() {
        ++this.b;
    }

    public final void c() {
        ++this.a;
    }

    public final void d() {
        ++this.c;
    }

    public final void e() {
        if(this.g == 0L) {
            this.g = System.currentTimeMillis();
        }
    }

    public final void f(boolean z) {
        if(z) {
            this.b = 0;
            this.a = 0;
            this.c = 0;
            this.e = SystemClock.elapsedRealtime();
            this.f = 0L;
            this.d = System.currentTimeMillis();
            return;
        }
        this.f = SystemClock.elapsedRealtime();
    }

    static final String g(long v) {
        Time time0 = new Time();
        time0.set(v);
        return time0.format("%Y-%m-%d %H:%M:%S");
    }
}

