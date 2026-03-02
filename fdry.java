import android.os.SystemClock;
import android.util.Log;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

final class fdry implements fduj {
    long a;
    public String b;
    public long c;
    public volatile long d;
    public long e;
    public long f;
    public boolean g;
    final fdsh h;
    private long i;
    private long j;
    private String k;
    private long[] l;
    private volatile boolean m;

    public fdry(fdsh fdsh0) {
        Objects.requireNonNull(fdsh0);
        this.h = fdsh0;
        super();
        this.c = 0L;
        this.d = -1L;
        this.e = -1L;
        this.i = -1L;
        this.f = -1L;
        this.j = -1L;
        this.g = false;
        this.m = false;
        this.a = -1L;
        this.b = "";
        long v = System.currentTimeMillis();
        this.i = fdsh0.d.getLong("cloud_last_active_connection", v);
        this.d = fdsh0.d.getLong("cloud_last_upload", v);
    }

    public final void a() {
        long v = SystemClock.elapsedRealtime();
        if(v - this.j > 300000L) {
            this.h.d.edit().putLong("cloud_last_active_connection", this.i).putLong("cloud_last_upload", this.d).commit();
            this.j = v;
        }
    }

    public final void b(String s) {
        this.a = System.currentTimeMillis();
        this.b = s;
    }

    public final boolean c() {
        if(this.g && !this.h.p()) {
            Log.d("CloudNode", "not syncing because network requires e2ee, but we don\'t have it");
            return true;
        }
        return this.a > 0L;
    }

    final boolean d() {
        long v2;
        String s = hzzi.a.i().W();
        boolean z = false;
        if(!s.equals(this.k)) {
            if(gfta.c(s)) {
                this.l = new long[]{0x7FFFFFFFFFFFFFFFL, 0L};
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                Scanner scanner0 = new Scanner(s);
                try {
                    while(scanner0.hasNextLong()) {
                        arrayList0.add(Long.valueOf(scanner0.nextLong()));
                        arrayList0.add(Long.valueOf(scanner0.nextLong()));
                    }
                    this.l = bbmt.h(arrayList0);
                }
                catch(Exception exception0) {
                    Log.e("CloudNode", "invalid setting for gms:wearable:service:cloud_sync_disconnected_throttling_schedule", exception0);
                    this.l = new long[0];
                }
            }
            this.k = s;
            if(Log.isLoggable("CloudNode", 3)) {
                Log.d("CloudNode", "cloud sync upload configuration updated to: " + Arrays.toString(this.l));
            }
        }
        long v = System.currentTimeMillis();
        this.e = (v - this.d) / 1000L;
        if(((fdue)this.h.G.get()).D()) {
            this.c = 0L;
            this.f = 0L;
            this.i = v;
            this.a();
        }
        else {
            this.f = (v - this.i) / 1000L;
            for(int v1 = 0; true; v1 += 2) {
                v2 = -1L;
                long[] arr_v = this.l;
                if(v1 >= arr_v.length) {
                    break;
                }
                long v3 = arr_v[v1];
                long v4 = arr_v[v1 + 1];
                if(this.f < v3) {
                    v2 = v4;
                    break;
                }
            }
            this.c = v2;
        }
        if(Long.compare(this.c, 0L) == 0 || this.c != -1L && this.e > this.c) {
            z = true;
        }
        if(Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "isReadyToUpload=" + z + ", timeSinceConnectedToPeer=" + this.f + ", timeSinceUpload=" + this.e + ", uploadInterval=" + this.c);
        }
        return z;
    }

    public final boolean e() {
        return !this.h.b || !this.m;
    }

    @Override  // fduj
    public final void p(Collection collection0) {
        fdsh fdsh0 = this.h;
        if(fdsh0.b) {
            boolean z = false;
            for(Object object0: collection0) {
                if(fdxu.v(((fdyo)object0).a, ((fdyo)object0).b)) {
                    z = true;
                    break;
                }
            }
            this.m = z;
        }
        if(Long.compare(this.c, 0L) != 0 && fdsh0.s && ((fdue)fdsh0.G.get()).D() && this.e()) {
            if(Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "onConnectedNodes: new connection while throttled, restarting sync");
            }
            fdsh0.i.f(2);
            return;
        }
        if(Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "onConnectedNodes: not throttled, ignoring connection event");
        }
    }

    @Override  // fduj
    public final void r(fdxn fdxn0, int v, boolean z) {
    }

    @Override  // fduj
    public final void s(fdxn fdxn0) {
    }
}

