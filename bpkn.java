public final class bpkn {
    public gfsx a;
    public gfsx b;
    private ByteString c;
    private boolean d;
    private fqus e;
    private long f;
    private long g;
    private haea h;
    private double i;
    private boolean j;
    private boolean k;
    private byte l;

    public bpkn() {
        throw null;
    }

    public bpkn(bpko bpko0) {
        this.a = gfqx.a;
        this.b = gfqx.a;
        this.c = bpko0.a;
        this.d = bpko0.b;
        this.a = bpko0.c;
        this.e = bpko0.d;
        this.b = bpko0.e;
        this.f = bpko0.f;
        this.g = bpko0.g;
        this.h = bpko0.h;
        this.i = bpko0.i;
        this.j = bpko0.j;
        this.k = bpko0.k;
        this.l = 0x3F;
    }

    public bpkn(byte[] arr_b) {
        this.a = gfqx.a;
        this.b = gfqx.a;
    }

    public final bpko a() {
        if(this.l == 0x3F) {
            ByteString hfsf0 = this.c;
            if(hfsf0 != null) {
                fqus fqus0 = this.e;
                if(fqus0 != null) {
                    haea haea0 = this.h;
                    if(haea0 != null) {
                        return new bpko(hfsf0, this.d, this.a, fqus0, this.b, this.f, this.g, haea0, this.i, this.j, this.k);
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.c == null) {
            stringBuilder0.append(" eid");
        }
        if((this.l & 1) == 0) {
            stringBuilder0.append(" selfSighting");
        }
        if(this.e == null) {
            stringBuilder0.append(" componentSetOrComponentless");
        }
        if((this.l & 2) == 0) {
            stringBuilder0.append(" sightingTimeSecsForComparison");
        }
        if((this.l & 4) == 0) {
            stringBuilder0.append(" sightingTimeSecsForReporting");
        }
        if(this.h == null) {
            stringBuilder0.append(" source");
        }
        if((this.l & 8) == 0) {
            stringBuilder0.append(" lastAggregatedLocationAccuracy");
        }
        if((this.l & 16) == 0) {
            stringBuilder0.append(" unwantedTrackingPreventionModeActive");
        }
        if((this.l & 0x20) == 0) {
            stringBuilder0.append(" sightingOfALostDevice");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(fqus fqus0) {
        if(fqus0 == null) {
            throw new NullPointerException("Null componentSetOrComponentless");
        }
        this.e = fqus0;
    }

    public final void c(ByteString hfsf0) {
        if(hfsf0 == null) {
            throw new NullPointerException("Null eid");
        }
        this.c = hfsf0;
    }

    public final void d(double f) {
        this.i = f;
        this.l = (byte)(this.l | 8);
    }

    public final void e(boolean z) {
        this.d = z;
        this.l = (byte)(this.l | 1);
    }

    public final void f(boolean z) {
        this.k = z;
        this.l = (byte)(this.l | 0x20);
    }

    public final void g(long v) {
        this.f = v;
        this.l = (byte)(this.l | 2);
    }

    public final void h(long v) {
        this.g = v;
        this.l = (byte)(this.l | 4);
    }

    public final void i(haea haea0) {
        if(haea0 == null) {
            throw new NullPointerException("Null source");
        }
        this.h = haea0;
    }

    public final void j(boolean z) {
        this.j = z;
        this.l = (byte)(this.l | 16);
    }
}

