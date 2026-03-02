import android.os.SystemClock;
import java.io.PrintWriter;

public final class fvdp implements fvdq {
    private final cmdb a;
    private long b;
    private long c;
    private int d;
    private int e;
    private long f;
    private int g;
    private int h;
    private long i;
    private int j;
    private int k;
    private long l;
    private int m;
    private int n;
    private float o;
    private int p;
    private float q;
    private int r;
    private final boolean s;
    private int t;
    private ProtoLiteBuilder u;

    public fvdp(cmdb cmdb0) {
        this.u = ((ProtoLiteMessage)hack.a).v_newBuilder();
        this.b = SystemClock.elapsedRealtime();
        boolean z = true;
        this.t = 1;
        this.r = -1;
        if(!hunr.v() && !hunr.u()) {
            z = false;
        }
        this.s = z;
        this.a = cmdb0;
    }

    @Override  // fvdq
    public final void A() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).m + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x100;
        hack0.m = v;
    }

    @Override  // fvdq
    public final void B() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).z + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x200000;
        hack0.z = v;
    }

    @Override  // fvdq
    public final void C() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).j + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x20;
        hack0.j = v;
    }

    @Override  // fvdq
    public final void D() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).k + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x40;
        hack0.k = v;
    }

    @Override  // fvdq
    public final void E() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).i + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 16;
        hack0.i = v;
    }

    @Override  // fvdq
    public final void F() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).r + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x2000;
        hack0.r = v;
    }

    @Override  // fvdq
    public final void G() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).q + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x1000;
        hack0.q = v;
    }

    @Override  // fvdq
    public final void H() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).s + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x4000;
        hack0.s = v;
    }

    @Override  // fvdq
    public final void I() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).t + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x8000;
        hack0.t = v;
    }

    @Override  // fvdq
    public final void J() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).p + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x800;
        hack0.p = v;
    }

    @Override  // fvdq
    public final void K() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).o + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x400;
        hack0.o = v;
    }

    @Override  // fvdq
    public final void L() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).n + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x200;
        hack0.n = v;
    }

    @Override  // fvdq
    public final void M() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).A + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x400000;
        hack0.A = v;
    }

    @Override  // fvdq
    public final void N() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).B + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x800000;
        hack0.B = v;
    }

    @Override  // fvdq
    public final void O() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).H + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x20000000;
        hack0.H = v;
    }

    @Override  // fvdq
    public final void P() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).I + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x40000000;
        hack0.I = v;
    }

    @Override  // fvdq
    public final void Q(int v) {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v1 = v + ((hack)hftv0).F;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x8000000;
        hack0.F = v1;
    }

    @Override  // fvdq
    public final void R(int v) {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v1 = v + ((hack)hftv0).E;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x4000000;
        hack0.E = v1;
    }

    @Override  // fvdq
    public final void S() {
        long v = SystemClock.elapsedRealtime() - this.b;
        int v1 = this.d;
        if(v1 > 0) {
            ProtoLiteBuilder hftp0 = this.u;
            long v2 = this.c / ((long)v1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hack)hftp0.b_message).c |= 0x20;
            ((hack)hftp0.b_message).P = (int)v2;
            ProtoLiteBuilder hftp1 = this.u;
            int v3 = this.e;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hack)hftp1.b_message).c |= 0x40;
            ((hack)hftp1.b_message).Q = v3;
        }
        int v4 = this.g;
        if(v4 > 0) {
            ProtoLiteBuilder hftp2 = this.u;
            long v5 = this.f / ((long)v4);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hack)hftp2.b_message).c |= 0x80;
            ((hack)hftp2.b_message).R = (int)v5;
            ProtoLiteBuilder hftp3 = this.u;
            int v6 = this.h;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((hack)hftp3.b_message).c |= 0x100;
            ((hack)hftp3.b_message).S = v6;
        }
        int v7 = this.j;
        if(v7 > 0) {
            ProtoLiteBuilder hftp4 = this.u;
            long v8 = this.i / ((long)v7);
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            ((hack)hftp4.b_message).c |= 0x200;
            ((hack)hftp4.b_message).T = (int)v8;
            ProtoLiteBuilder hftp5 = this.u;
            int v9 = this.k;
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            ((hack)hftp5.b_message).c |= 0x400;
            ((hack)hftp5.b_message).U = v9;
        }
        int v10 = this.m;
        if(v10 > 0) {
            ProtoLiteBuilder hftp6 = this.u;
            long v11 = this.l / ((long)v10);
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            ((hack)hftp6.b_message).c |= 0x800;
            ((hack)hftp6.b_message).V = (int)v11;
            ProtoLiteBuilder hftp7 = this.u;
            int v12 = this.n;
            if(!hftp7.b_message.isImmutable()) {
                hftp7.ensureMutable();
            }
            ((hack)hftp7.b_message).c |= 0x1000;
            ((hack)hftp7.b_message).W = v12;
        }
        int v13 = this.p;
        if(v13 > 0) {
            ProtoLiteBuilder hftp8 = this.u;
            float f = this.o / ((float)v13);
            if(!hftp8.b_message.isImmutable()) {
                hftp8.ensureMutable();
            }
            ((hack)hftp8.b_message).c |= 0x2000;
            ((hack)hftp8.b_message).X = f;
            ProtoLiteBuilder hftp9 = this.u;
            float f1 = this.q;
            if(!hftp9.b_message.isImmutable()) {
                hftp9.ensureMutable();
            }
            ((hack)hftp9.b_message).c |= 0x4000;
            ((hack)hftp9.b_message).Y = f1;
        }
        if(this.s) {
            int v14 = this.t;
            if(v14 != 1) {
                ProtoLiteBuilder hftp10 = this.u;
                if(!hftp10.b_message.isImmutable()) {
                    hftp10.ensureMutable();
                }
                hack hack0 = (hack)hftp10.b_message;
                if(v14 == 0) {
                    throw null;
                }
                hack0.af = v14 - 1;
                hack0.c |= 0x200000;
            }
            int v15 = this.r;
            if(v15 != -1) {
                ProtoLiteBuilder hftp11 = this.u;
                if(!hftp11.b_message.isImmutable()) {
                    hftp11.ensureMutable();
                }
                ((hack)hftp11.b_message).c |= 0x400000;
                ((hack)hftp11.b_message).ag = v15;
            }
        }
        ProtoLiteBuilder hftp12 = this.u;
        if(!hftp12.b_message.isImmutable()) {
            hftp12.ensureMutable();
        }
        hack hack1 = (hack)hftp12.b_message;
        hack1.b |= 1;
        hack1.e = (int)(v / 1000L);
        hack hack2 = (hack)hftp12.N_build();
        cfzh.v().c(((ProtoLiteMessage)hack2)).a();
    }

    @Override  // fvdq
    public final void T(int v) {
        this.a.c(v);
    }

    @Override  // fvdq
    public final void U(float f) {
        this.o += f;
        ++this.p;
        if((f > this.q)) {
            this.q = f;
        }
    }

    @Override  // fvdq
    public final void V(float f) {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        if((f > ((hack)hftv0).D)) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hack hack0 = (hack)hftp0.b_message;
            hack0.b |= 0x2000000;
            hack0.D = f;
        }
    }

    @Override  // fvdq
    public final void W(int v) {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        if(v > ((hack)hftv0).C) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hack hack0 = (hack)hftp0.b_message;
            hack0.b |= 0x1000000;
            hack0.C = v;
        }
    }

    @Override  // fvdq
    public final void X(int v) {
        this.l += (long)v;
        ++this.m;
        if(v > this.n) {
            this.n = v;
        }
    }

    @Override  // fvdq
    public final void Y(int v, int v1) {
        if(v1 > 0) {
            this.f += (long)v;
            this.g += v1;
            int v2 = v / v1;
            if(v2 > this.h) {
                this.h = v2;
            }
        }
    }

    @Override  // fvdq
    public final void Z(int v) {
        this.c += (long)v;
        ++this.d;
        if(v > this.e) {
            this.e = v;
        }
    }

    @Override  // fvdq
    public final void a(PrintWriter printWriter0) {
        String s;
        printWriter0.println("stats elapsed seconds: " + ((int)((SystemClock.elapsedRealtime() - this.b) / 1000L)));
        printWriter0.println("computations: " + ((hack)this.u.b_message).f);
        printWriter0.println("errors: " + ((hack)this.u.b_message).g);
        printWriter0.println("in geofence count: " + ((hack)this.u.b_message).h);
        printWriter0.println("outside geofence count: " + ((hack)this.u.b_message).i);
        printWriter0.println("open sky detector true: " + ((hack)this.u.b_message).k);
        printWriter0.println("open sky detector false: " + ((hack)this.u.b_message).j);
        printWriter0.println("no geo data count: " + ((hack)this.u.b_message).l);
        printWriter0.println("not enough sats count: " + ((hack)this.u.b_message).m);
        printWriter0.println("no gnss location count: " + ((hack)this.u.b_message).u);
        printWriter0.println("no flp location count: " + ((hack)this.u.b_message).v);
        printWriter0.println("need both locations count: " + ((hack)this.u.b_message).w);
        printWriter0.println("no grid center count: " + ((hack)this.u.b_message).x);
        printWriter0.println("location accuracy above threshold count: " + ((hack)this.u.b_message).y);
        printWriter0.println("not on foot count: " + ((hack)this.u.b_message).z);
        printWriter0.println("screen off count: " + ((hack)this.u.b_message).A);
        printWriter0.println("small movement count: " + ((hack)this.u.b_message).B);
        printWriter0.println("grid radius too big count: " + ((hack)this.u.b_message).G);
        printWriter0.println("stale gnss status count: " + ((hack)this.u.b_message).H);
        printWriter0.println("stale grid center count: " + ((hack)this.u.b_message).I);
        printWriter0.println("stale grid extension location count: " + ((hack)this.u.b_message).ac);
        printWriter0.println("same grid center timestamp count: " + ((hack)this.u.b_message).J);
        printWriter0.println("problos cache resets from satellite movement: " + ((hack)this.u.b_message).n);
        printWriter0.println("problos cache resets from raster: " + ((hack)this.u.b_message).o);
        printWriter0.println("problos cache resets from clear: " + ((hack)this.u.b_message).p);
        printWriter0.println("problos cache losview hits: " + ((hack)this.u.b_message).q);
        printWriter0.println("problos cache hits: " + ((hack)this.u.b_message).r);
        printWriter0.println("problos cache misses: " + ((hack)this.u.b_message).s);
        printWriter0.println("problos cache partial misses: " + ((hack)this.u.b_message).t);
        printWriter0.println("tile lookup count: " + ((hack)this.u.b_message).E);
        printWriter0.println("tile load from network count: " + ((hack)this.u.b_message).F);
        printWriter0.println("max GNSS signals observed: " + ((hack)this.u.b_message).C);
        printWriter0.println("max observed CN0: " + ((hack)this.u.b_message).D);
        printWriter0.println("decryption errors: " + ((hack)this.u.b_message).K);
        printWriter0.println("network errors: " + ((hack)this.u.b_message).L);
        printWriter0.println("decompression errors: " + ((hack)this.u.b_message).M);
        printWriter0.println("invalid clutter type errors: " + ((hack)this.u.b_message).N);
        printWriter0.println("invalid array size errors: " + ((hack)this.u.b_message).O);
        long v = 0L;
        printWriter0.println(a.u((this.d == 0 ? 0L : this.c / ((long)this.d)), "avg computation time micros: "));
        printWriter0.println("max computation time micros: " + this.e);
        printWriter0.println(a.u((this.g == 0 ? 0L : this.f / ((long)this.g)), "avg tile download time micros: "));
        printWriter0.println("max tile download time micros: " + this.h);
        printWriter0.println(a.u((this.j == 0 ? 0L : this.i / ((long)this.j)), "avg tile read time micros: "));
        printWriter0.println("max tile read time micros: " + this.k);
        int v1 = this.m;
        if(v1 != 0) {
            v = this.l / ((long)v1);
        }
        printWriter0.println(a.u(v, "avg raster construction time micros: "));
        printWriter0.println("max raster construction time micros: " + this.n);
        printWriter0.println("avg Bluesky-Gps distance meters: " + (this.p == 0 ? 0.0f : this.o / ((float)this.p)));
        printWriter0.println("max Bluesky-Gps distance meters: " + this.q);
        printWriter0.println("chipset correction injections: " + ((hack)this.u.b_message).Z);
        printWriter0.println("kalman filter missing inputs: " + ((hack)this.u.b_message).aa);
        printWriter0.println("GPS TOW computation failures: " + ((hack)this.u.b_message).ab);
        printWriter0.println("in vehicle epochs run count: " + ((hack)this.u.b_message).ah);
        printWriter0.println("in vehicle raster construction count: " + ((hack)this.u.b_message).ai);
        printWriter0.println("in vehicle chipset correction injection count: " + ((hack)this.u.b_message).aj);
        printWriter0.println("GPS-FLP distance over threshold count: " + ((hack)this.u.b_message).ao);
        printWriter0.println("invalid satellite az/el count: " + ((hack)this.u.b_message).ap);
        if(this.s) {
            printWriter0.println("DeviceML FLP grids computed: " + ((hack)this.u.b_message).ad);
            printWriter0.println("DeviceML FLP TFLite inference failures: " + ((hack)this.u.b_message).ak);
            printWriter0.println("DeviceML chipset corrections grids computed: " + ((hack)this.u.b_message).ae);
            printWriter0.println("DeviceML chipset corrections TFLite inference failures: " + ((hack)this.u.b_message).al);
            printWriter0.println("DeviceML grid outside raster count: " + ((hack)this.u.b_message).aq);
            printWriter0.println("DeviceML all grid points are indoor or unknown: " + ((hack)this.u.b_message).ar);
            printWriter0.println("DeviceML input grid size doesn\'t match the required ML grid size: " + ((hack)this.u.b_message).as);
            printWriter0.println("DeviceML error raised by TFLite infra: " + ((hack)this.u.b_message).at);
            printWriter0.println("Lc FLP grids computed: " + ((hack)this.u.b_message).am);
            printWriter0.println("LcLx chipset corrections grids computed: " + ((hack)this.u.b_message).an);
            int v2 = this.t;
            switch(v2) {
                case 1: {
                    s = "UNSPECIFIED";
                    break;
                }
                case 2: {
                    s = "ACTIVE";
                    break;
                }
                case 3: {
                    s = "TFLITE_UNUSABLE";
                    break;
                }
                case 4: {
                    s = "TFLITE_ABSENT";
                    break;
                }
                case 5: {
                    s = "MODEL_READ_FAIL";
                    break;
                }
                case 6: {
                    s = "MODEL_ABSENT";
                    break;
                }
                case 7: {
                    s = "ENABLED";
                    break;
                }
                case 8: {
                    s = "MODEL_CORRUPTED";
                    break;
                }
                default: {
                    s = "null";
                }
            }
            if(v2 == 0) {
                throw null;
            }
            printWriter0.println("DeviceML status: " + s);
            printWriter0.println("DeviceML model version number: " + this.r);
        }
    }

    @Override  // fvdq
    public final void aa() {
        this.u = ((ProtoLiteMessage)hack.a).v_newBuilder();
        this.b = SystemClock.elapsedRealtime();
        this.c = 0L;
        this.d = 0;
        this.e = 0;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0L;
        this.j = 0;
        this.k = 0;
        this.l = 0L;
        this.m = 0;
        this.n = 0;
        this.o = 0.0f;
        this.p = 0;
        this.q = 0.0f;
    }

    @Override  // fvdq
    public final void ab(int v) {
        if(this.s) {
            this.r = v;
        }
    }

    @Override  // fvdq
    public final void ac(int v) {
        if(v == 0) {
            throw null;
        }
        if(v - 1 != 0) {
            switch(v - 1) {
                case 1: {
                    ProtoLiteBuilder hftp2 = this.u;
                    ProtoLiteMessage hftv2 = hftp2.b_message;
                    int v3 = ((hack)hftv2).L + 1;
                    if(!hftv2.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ((hack)hftp2.b_message).c |= 2;
                    ((hack)hftp2.b_message).L = v3;
                    return;
                }
                case 2: {
                    ProtoLiteBuilder hftp3 = this.u;
                    ProtoLiteMessage hftv3 = hftp3.b_message;
                    int v4 = ((hack)hftv3).M + 1;
                    if(!hftv3.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ((hack)hftp3.b_message).c |= 4;
                    ((hack)hftp3.b_message).M = v4;
                    return;
                }
                default: {
                    if(v - 1 != 3) {
                        ProtoLiteBuilder hftp0 = this.u;
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        int v1 = ((hack)hftv0).O + 1;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((hack)hftp0.b_message).c |= 16;
                        ((hack)hftp0.b_message).O = v1;
                        return;
                    }
                    ProtoLiteBuilder hftp1 = this.u;
                    ProtoLiteMessage hftv1 = hftp1.b_message;
                    int v2 = ((hack)hftv1).N + 1;
                    if(!hftv1.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hack)hftp1.b_message).c |= 8;
                    ((hack)hftp1.b_message).N = v2;
                    return;
                }
            }
        }
        ProtoLiteBuilder hftp4 = this.u;
        ProtoLiteMessage hftv4 = hftp4.b_message;
        int v5 = ((hack)hftv4).K + 1;
        if(!hftv4.isImmutable()) {
            hftp4.ensureMutable();
        }
        ((hack)hftp4.b_message).c |= 1;
        ((hack)hftp4.b_message).K = v5;
    }

    @Override  // fvdq
    public final void ad(int v) {
        this.i += (long)v;
        ++this.j;
        if(v > this.k) {
            this.k = v;
        }
    }

    @Override  // fvdq
    public final void ae(int v) {
        if(this.s) {
            this.t = v;
        }
    }

    @Override  // fvdq
    public final void b() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).f + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 2;
        hack0.f = v;
    }

    @Override  // fvdq
    public final void c() {
        if(this.s) {
            ProtoLiteBuilder hftp0 = this.u;
            ProtoLiteMessage hftv0 = hftp0.b_message;
            int v = ((hack)hftv0).ar + 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hack)hftp0.b_message).d |= 2;
            ((hack)hftp0.b_message).ar = v;
        }
    }

    @Override  // fvdq
    public final void d() {
        if(this.s) {
            ProtoLiteBuilder hftp0 = this.u;
            ProtoLiteMessage hftv0 = hftp0.b_message;
            int v = ((hack)hftv0).ae + 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hack)hftp0.b_message).c |= 0x100000;
            ((hack)hftp0.b_message).ae = v;
        }
    }

    @Override  // fvdq
    public final void e() {
        if(this.s) {
            ProtoLiteBuilder hftp0 = this.u;
            ProtoLiteMessage hftv0 = hftp0.b_message;
            int v = ((hack)hftv0).al + 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hack)hftp0.b_message).c |= 0x8000000;
            ((hack)hftp0.b_message).al = v;
        }
    }

    @Override  // fvdq
    public final void f() {
        if(this.s) {
            ProtoLiteBuilder hftp0 = this.u;
            ProtoLiteMessage hftv0 = hftp0.b_message;
            int v = ((hack)hftv0).ad + 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hack)hftp0.b_message).c |= 0x80000;
            ((hack)hftp0.b_message).ad = v;
        }
    }

    @Override  // fvdq
    public final void g() {
        if(this.s) {
            ProtoLiteBuilder hftp0 = this.u;
            ProtoLiteMessage hftv0 = hftp0.b_message;
            int v = ((hack)hftv0).ak + 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hack)hftp0.b_message).c |= 0x4000000;
            ((hack)hftp0.b_message).ak = v;
        }
    }

    @Override  // fvdq
    public final void h() {
        if(this.s) {
            ProtoLiteBuilder hftp0 = this.u;
            ProtoLiteMessage hftv0 = hftp0.b_message;
            int v = ((hack)hftv0).aq + 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hack)hftp0.b_message).d |= 1;
            ((hack)hftp0.b_message).aq = v;
        }
    }

    @Override  // fvdq
    public final void i() {
        if(this.s) {
            ProtoLiteBuilder hftp0 = this.u;
            ProtoLiteMessage hftv0 = hftp0.b_message;
            int v = ((hack)hftv0).at + 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hack)hftp0.b_message).d |= 8;
            ((hack)hftp0.b_message).at = v;
        }
    }

    @Override  // fvdq
    public final void j() {
        if(this.s) {
            ProtoLiteBuilder hftp0 = this.u;
            ProtoLiteMessage hftv0 = hftp0.b_message;
            int v = ((hack)hftv0).as + 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hack)hftp0.b_message).d |= 4;
            ((hack)hftp0.b_message).as = v;
        }
    }

    @Override  // fvdq
    public final void k() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).g + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 4;
        hack0.g = v;
    }

    @Override  // fvdq
    public final void l() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).am + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hack)hftp0.b_message).c |= 0x10000000;
        ((hack)hftp0.b_message).am = v;
    }

    @Override  // fvdq
    public final void m() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).an + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hack)hftp0.b_message).c |= 0x20000000;
        ((hack)hftp0.b_message).an = v;
    }

    @Override  // fvdq
    public final void n() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).Z + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hack)hftp0.b_message).c |= 0x8000;
        ((hack)hftp0.b_message).Z = v;
    }

    @Override  // fvdq
    public final void o() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).ao + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hack)hftp0.b_message).c |= 0x40000000;
        ((hack)hftp0.b_message).ao = v;
    }

    @Override  // fvdq
    public final void p() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).ab + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hack)hftp0.b_message).c |= 0x20000;
        ((hack)hftp0.b_message).ab = v;
    }

    @Override  // fvdq
    public final void q() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).G + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x10000000;
        hack0.G = v;
    }

    @Override  // fvdq
    public final void r() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).h + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 8;
        hack0.h = v;
    }

    @Override  // fvdq
    public final void s() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).aj + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hack)hftp0.b_message).c |= 0x2000000;
        ((hack)hftp0.b_message).aj = v;
    }

    @Override  // fvdq
    public final void t() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).ah + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hack)hftp0.b_message).c |= 0x800000;
        ((hack)hftp0.b_message).ah = v;
    }

    @Override  // fvdq
    public final void u() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).ai + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hack)hftp0.b_message).c |= 0x1000000;
        ((hack)hftp0.b_message).ai = v;
    }

    @Override  // fvdq
    public final void v() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).au + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hack)hftp0.b_message).d |= 16;
        ((hack)hftp0.b_message).au = v;
    }

    @Override  // fvdq
    public final void w() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).aa + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hack)hftp0.b_message).c |= 0x10000;
        ((hack)hftp0.b_message).aa = v;
    }

    @Override  // fvdq
    public final void x() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).y + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x100000;
        hack0.y = v;
    }

    @Override  // fvdq
    public final void y() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).l + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x80;
        hack0.l = v;
    }

    @Override  // fvdq
    public final void z() {
        ProtoLiteBuilder hftp0 = this.u;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        int v = ((hack)hftv0).u + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hack hack0 = (hack)hftp0.b_message;
        hack0.b |= 0x10000;
        hack0.u = v;
    }
}

