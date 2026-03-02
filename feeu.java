import android.os.SystemClock;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.Log;

public final class feeu {
    private final long a;
    private final long b;
    private long c;
    private long d;
    private long e;
    private long f;

    public feeu() {
        this.b = SystemClock.elapsedRealtime();
        this.a = System.currentTimeMillis();
    }

    final void a() {
        synchronized(this) {
            if(this.c != 0L) {
                Log.w("BtleSessionStats", "Ignoring; close() was called already");
                return;
            }
            this.c = SystemClock.elapsedRealtime();
        }
    }

    final void b(bbpd bbpd0) {
        synchronized(this) {
            if(this.c == 0L) {
                bbpd0.print("Current: ");
            }
            else {
                bbpd0.print("    Old: ");
            }
            long v1 = this.c == 0L ? SystemClock.elapsedRealtime() : this.c;
            Time time0 = new Time();
            time0.set(this.a);
            bbpd0.printf("%s, scans: %d, min scan duration: %s, max scan duration: %s, avg scan duration: %s, connection duration: %s", new Object[]{time0.format("%Y-%m-%d %H:%M:%S"), ((int)0), ((long)this.d), ((long)this.e), ((long)this.f), DateUtils.formatElapsedTime((v1 - this.b) / 1000L)});
            bbpd0.println();
        }
    }

    final void c() {
        synchronized(this) {
            long v1 = SystemClock.elapsedRealtime();
            this.f = (this.f + v1) / 0L;
            if(v1 < this.d || this.d == 0L) {
                this.d = v1;
            }
            if(v1 > this.e) {
                this.e = v1;
            }
        }
    }
}

