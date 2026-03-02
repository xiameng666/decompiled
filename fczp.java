import java.util.List;

public final class fczp {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public List f;
    public ffaz g;
    public feym h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private short v;

    public fczp() {
    }

    public fczp(fczq fczq0) {
        this.a = fczq0.b;
        this.b = fczq0.c;
        this.i = fczq0.d;
        this.j = fczq0.e;
        this.k = fczq0.f;
        this.l = fczq0.g;
        this.c = fczq0.h;
        this.m = fczq0.i;
        this.d = fczq0.j;
        this.e = fczq0.k;
        this.n = fczq0.l;
        this.f = fczq0.m;
        this.o = fczq0.n;
        this.p = fczq0.o;
        this.g = fczq0.p;
        this.q = fczq0.q;
        this.h = fczq0.r;
        this.r = fczq0.s;
        this.s = fczq0.u;
        this.t = fczq0.v;
        this.u = fczq0.t;
        this.v = 0x1FFF;
    }

    public final fczq a() {
        if(this.v != 0x1FFF) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.v & 1) == 0) {
                stringBuilder0.append(" type");
            }
            if((this.v & 2) == 0) {
                stringBuilder0.append(" role");
            }
            if((this.v & 4) == 0) {
                stringBuilder0.append(" connectionEnabled");
            }
            if((this.v & 8) == 0) {
                stringBuilder0.append(" isConnected");
            }
            if((this.v & 16) == 0) {
                stringBuilder0.append(" btlePriority");
            }
            if((this.v & 0x20) == 0) {
                stringBuilder0.append(" connectionRetryStrategy");
            }
            if((this.v & 0x40) == 0) {
                stringBuilder0.append(" isMigrating");
            }
            if((this.v & 0x80) == 0) {
                stringBuilder0.append(" dataItemSyncEnabled");
            }
            if((this.v & 0x100) == 0) {
                stringBuilder0.append(" removeConnectionWhenBondRemovedByUser");
            }
            if((this.v & 0x200) == 0) {
                stringBuilder0.append(" maxSupportedRemoteAndroidSdkVersion");
            }
            if((this.v & 0x400) == 0) {
                stringBuilder0.append(" runtimeType");
            }
            if((this.v & 0x800) == 0) {
                stringBuilder0.append(" peerSupportsBle");
            }
            if((this.v & 0x1000) == 0) {
                stringBuilder0.append(" skipConnectingIfDeviceNotBonded");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new fczq(this.a, this.b, this.i, this.j, this.k, this.l, this.c, this.m, this.d, this.e, this.n, this.f, this.o, this.p, this.g, this.q, this.h, this.r, this.s, this.t, this.u);
    }

    public final void b(boolean z) {
        this.m = z;
        this.v = (short)(this.v | 16);
    }

    public final void c(boolean z) {
        this.k = z;
        this.v = (short)(this.v | 4);
    }

    public final void d(int v) {
        this.n = v;
        this.v = (short)(this.v | 0x20);
    }

    public final void e(boolean z) {
        this.p = z;
        this.v = (short)(this.v | 0x80);
    }

    public final void f(boolean z) {
        this.l = z;
        this.v = (short)(this.v | 8);
    }

    public final void g(boolean z) {
        this.o = z;
        this.v = (short)(this.v | 0x40);
    }

    public final void h(int v) {
        this.r = v;
        this.v = (short)(this.v | 0x200);
    }

    public final void i(boolean z) {
        this.t = z;
        this.v = (short)(this.v | 0x800);
    }

    public final void j(boolean z) {
        this.q = z;
        this.v = (short)(this.v | 0x100);
    }

    public final void k(int v) {
        this.j = v;
        this.v = (short)(this.v | 2);
    }

    public final void l(int v) {
        this.s = v;
        this.v = (short)(this.v | 0x400);
    }

    public final void m(boolean z) {
        this.u = z;
        this.v = (short)(this.v | 0x1000);
    }

    public final void n(int v) {
        this.i = v;
        this.v = (short)(this.v | 1);
    }
}

