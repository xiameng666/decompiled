public final class czmi {
    public String a;
    public String b;
    public gged_interceptors c;
    public int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private gywn i;
    private gged_interceptors j;
    private boolean k;
    private int l;
    private boolean m;
    private byte n;

    public czmi() {
    }

    public czmi(czmj czmj0) {
        this.a = czmj0.a;
        this.b = czmj0.b;
        this.e = czmj0.c;
        this.f = czmj0.d;
        this.g = czmj0.e;
        this.h = czmj0.f;
        this.i = czmj0.g;
        this.c = czmj0.h;
        this.j = czmj0.i;
        this.k = czmj0.j;
        this.l = czmj0.k;
        this.d = czmj0.m;
        this.m = czmj0.l;
        this.n = 0x7F;
    }

    public final czmj a() {
        if(this.n == 0x7F) {
            gywn gywn0 = this.i;
            if(gywn0 != null) {
                gged_interceptors gged0 = this.j;
                if(gged0 != null) {
                    return new czmj(this.a, this.b, this.e, this.f, this.g, this.h, gywn0, this.c, gged0, this.k, this.l, this.d, this.m);
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if((this.n & 1) == 0) {
            stringBuilder0.append(" is5GHzBandAvailable");
        }
        if((this.n & 2) == 0) {
            stringBuilder0.append(" is6GHzBandAvailable");
        }
        if((this.n & 4) == 0) {
            stringBuilder0.append(" isDisruptiveUpgrade");
        }
        if((this.n & 8) == 0) {
            stringBuilder0.append(" remoteApFrequency");
        }
        if(this.i == null) {
            stringBuilder0.append(" specifiedBandwidth");
        }
        if(this.j == null) {
            stringBuilder0.append(" wifiScanResult");
        }
        if((this.n & 16) == 0) {
            stringBuilder0.append(" forceScc");
        }
        if((this.n & 0x20) == 0) {
            stringBuilder0.append(" connectionType");
        }
        if((this.n & 0x40) == 0) {
            stringBuilder0.append(" allowWifiRadioToggling");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(boolean z) {
        this.m = z;
        this.n = (byte)(this.n | 0x40);
    }

    public final void c(int v) {
        this.l = v;
        this.n = (byte)(this.n | 0x20);
    }

    public final void d(boolean z) {
        this.k = z;
        this.n = (byte)(this.n | 16);
    }

    public final void e(boolean z) {
        this.e = z;
        this.n = (byte)(this.n | 1);
    }

    public final void f(boolean z) {
        this.f = z;
        this.n = (byte)(this.n | 2);
    }

    public final void g(boolean z) {
        this.g = z;
        this.n = (byte)(this.n | 4);
    }

    public final void h(int v) {
        this.h = v;
        this.n = (byte)(this.n | 8);
    }

    public final void i(gywn gywn0) {
        if(gywn0 == null) {
            throw new NullPointerException("Null specifiedBandwidth");
        }
        this.i = gywn0;
    }

    public final void j(gged_interceptors gged0) {
        if(gged0 == null) {
            throw new NullPointerException("Null wifiScanResult");
        }
        this.j = gged0;
    }
}

