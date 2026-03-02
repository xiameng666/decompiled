import android.location.Location;
import com.google.android.gms.tensorgps.TensorGpsMetrics;
import j..time.Duration;

public final class fvyh {
    public int a;
    public Duration b;
    public Duration c;
    public Location d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public Location l;
    public TensorGpsMetrics m;
    public byte n;

    public final int a() {
        if((this.n & 2) != 0) {
            return this.e;
        }
        throw new IllegalStateException("Property \"gnssSvsUsedInFixCount\" has not been set");
    }

    public final Duration b() {
        Duration duration0 = this.b;
        if(duration0 != null) {
            return duration0;
        }
        throw new IllegalStateException("Property \"gnssTimeToFirstFix\" has not been set");
    }

    public final void c(int v) {
        this.e = v;
        this.n = (byte)(this.n | 2);
    }

    public final void d(Duration duration0) {
        if(duration0 == null) {
            throw new NullPointerException("Null gnssTimeSinceLastFix");
        }
        this.c = duration0;
    }

    public final void e(Duration duration0) {
        if(duration0 == null) {
            throw new NullPointerException("Null gnssTimeToFirstFix");
        }
        this.b = duration0;
    }

    public final void f(int v) {
        this.h = v;
        this.n = (byte)(this.n | 16);
    }

    public final void g(int v) {
        this.k = v;
        this.n = (byte)(this.n | 0xFFFFFF80);
    }

    public final void h(int v) {
        this.j = v;
        this.n = (byte)(this.n | 0x40);
    }

    public final void i(int v) {
        this.g = v;
        this.n = (byte)(this.n | 8);
    }

    public final void j(int v) {
        this.i = v;
        this.n = (byte)(this.n | 0x20);
    }

    public final void k(int v) {
        this.f = v;
        this.n = (byte)(this.n | 4);
    }

    public final void l(int v) {
        this.a = v;
        this.n = (byte)(this.n | 1);
    }
}

