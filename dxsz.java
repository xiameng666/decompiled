public final class dxsz {
    public gfsx a;
    public gfsx b;
    public gfsx c;
    private int d;
    private byte e;

    public dxsz() {
        throw null;
    }

    public dxsz(byte[] arr_b) {
        this.a = gfqx.a;
        this.b = gfqx.a;
        this.c = gfqx.a;
    }

    public final dxta a() {
        boolean z = true;
        if(this.e != 1) {
            throw new IllegalStateException("Missing required properties: drawableLogoRes");
        }
        dxta dxta0 = new dxta(this.a, this.b, this.d, this.c);
        if(!dxta0.a.i() && !dxta0.b.i()) {
            z = false;
        }
        gftb.q(z);
        return dxta0;
    }

    public final void b(int v) {
        this.d = v;
        this.e = 1;
    }
}

