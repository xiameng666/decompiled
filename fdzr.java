import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import android.util.Log;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicLong;

public final class fdzr implements Closeable {
    public Thread a;
    public final fczq b;
    private final long c;
    private final long d;
    private long e;
    private int f;
    private int g;
    private int h;
    private int i;
    private final AtomicLong j;
    private final AtomicLong k;
    private final Handler l;
    private String m;

    public fdzr(Handler handler0, fczq fczq0) {
        this.j = new AtomicLong(0L);
        this.k = new AtomicLong(0L);
        this.d = SystemClock.elapsedRealtime();
        this.c = System.currentTimeMillis();
        this.l = handler0;
        this.b = fczq0;
    }

    public final void a(bbpd bbpd0) {
        synchronized(this) {
            if(Long.compare(this.e, 0L) == 0) {
                long v1 = this.j.get();
                long v2 = this.k.get();
                long v3 = SystemClock.elapsedRealtime();
                if(Long.compare(v1, 0L) != 0) {
                    long v4 = v3 - v1;
                    if(v4 > 1000L) {
                        bbpd0.println("STUCK WHILE PROCESSING READ " + DateUtils.formatElapsedTime(v4 / 1000L));
                    }
                }
                if(v2 != 0L) {
                    long v5 = v3 - v2;
                    if(v5 > 1000L) {
                        bbpd0.println("STUCK WHILE WRITING " + DateUtils.formatElapsedTime(v5 / 1000L));
                    }
                }
                bbpd0.print("Current: ");
            }
            else {
                bbpd0.print("    Old: ");
            }
            String s = this.m == null ? "" : ", " + this.m;
            long v6 = this.e == 0L ? SystemClock.elapsedRealtime() : this.e;
            bbpd0.printf("%s: %s, writes/reads (%d/%d), bytes (%d/%d), duration %s%s", new Object[]{this.b.j, ffmi.a(this.c), ((int)this.h), ((int)this.i), ((int)this.f), ((int)this.g), DateUtils.formatElapsedTime((v6 - this.d) / 1000L), s});
            bbpd0.println();
        }
    }

    final void b(int v) {
        synchronized(this) {
            if(this.e == 0L) {
                ++this.i;
                this.g += v;
            }
        }
    }

    final void c(int v) {
        synchronized(this) {
            if(this.e == 0L) {
                ++this.h;
                this.f += v;
            }
        }
    }

    @Override
    public final void close() {
        synchronized(this) {
            if(this.e == 0L) {
                this.e = SystemClock.elapsedRealtime();
            }
        }
    }

    public final void d(boolean z) {
        long v = SystemClock.elapsedRealtime();
        if(z) {
            this.k.set(v);
            this.l.removeMessages(this.hashCode());
            long v1 = hzzi.g();
            this.l.sendMessageDelayed(this.l.obtainMessage(this.hashCode(), this), v1);
            return;
        }
        long v2 = this.k.getAndSet(0L);
        if(v2 > 0L) {
            long v3 = v - v2;
            if(v3 > 1000L) {
                Log.w("Wear_Transport", a.D(v3, "took ", " ms to perform write"));
            }
        }
    }

    public final void e(boolean z) {
        long v = SystemClock.elapsedRealtime();
        if(z) {
            this.j.set(v);
            return;
        }
        long v1 = this.j.getAndSet(0L);
        if(v1 > 0L) {
            long v2 = v - v1;
            if(v2 > 1000L) {
                Log.w("Wear_Transport", a.D(v2, "took ", " ms to process the read"));
            }
        }
    }

    public final void f(String s) {
        synchronized(this) {
            if(this.m == null) {
                this.m = s;
            }
        }
    }

    public final boolean g() {
        synchronized(this) {
            if(this.e == 0L) {
                long v1 = this.k.get();
                ffmn.a("Wear_Transport", "Write start time:  %d", new Object[]{v1});
                if(v1 > 0L) {
                    long v2 = SystemClock.elapsedRealtime() - v1;
                    ffmn.a("Wear_Transport", "Last write duration:  %d", new Object[]{v2});
                    if(v2 > hzzi.g()) {
                        Log.w("Wear_Transport", "Write has been stuck for more than " + hzzi.g() + " ms.");
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

