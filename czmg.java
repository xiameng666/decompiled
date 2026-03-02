import android.os.WorkSource;
import java.net.Inet6Address;

public final class czmg {
    public String a;
    public String b;
    public String c;
    public WorkSource d;
    public gyby e;
    public Inet6Address f;
    public int g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;
    private byte n;

    public czmg() {
    }

    public czmg(czmh czmh0) {
        this.a = czmh0.a;
        this.b = czmh0.b;
        this.c = czmh0.c;
        this.h = czmh0.d;
        this.i = czmh0.e;
        this.g = czmh0.m;
        this.j = czmh0.f;
        this.d = czmh0.g;
        this.k = czmh0.h;
        this.e = czmh0.i;
        this.f = czmh0.j;
        this.l = czmh0.k;
        this.m = czmh0.l;
        this.n = 0x3F;
    }

    public final czmh a() {
        if(this.n == 0x3F) {
            int v = this.g;
            if(v != 0) {
                return new czmh(this.a, this.b, this.c, this.h, this.i, v, this.j, this.d, this.k, this.e, this.f, this.l, this.m);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if((this.n & 1) == 0) {
            stringBuilder0.append(" port");
        }
        if((this.n & 2) == 0) {
            stringBuilder0.append(" frequency");
        }
        if(this.g == 0) {
            stringBuilder0.append(" band");
        }
        if((this.n & 4) == 0) {
            stringBuilder0.append(" isDisruptiveUpgrade");
        }
        if((this.n & 8) == 0) {
            stringBuilder0.append(" connectionType");
        }
        if((this.n & 16) == 0) {
            stringBuilder0.append(" isMediumTheFirstPlaceInBandwidth");
        }
        if((this.n & 0x20) == 0) {
            stringBuilder0.append(" connectionMode");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(int v) {
        this.m = v;
        this.n = (byte)(this.n | 0x20);
    }

    public final void c(int v) {
        this.k = v;
        this.n = (byte)(this.n | 8);
    }

    public final void d(int v) {
        this.i = v;
        this.n = (byte)(this.n | 2);
    }

    public final void e(boolean z) {
        this.j = z;
        this.n = (byte)(this.n | 4);
    }

    public final void f(boolean z) {
        this.l = z;
        this.n = (byte)(this.n | 16);
    }

    public final void g(int v) {
        this.h = v;
        this.n = (byte)(this.n | 1);
    }
}

