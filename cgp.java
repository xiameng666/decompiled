import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class cgp extends cew {
    public chl a;
    public hel b;
    private long c;
    private long d;
    private boolean e;
    private final gra f;

    public cgp(chl chl0, hel hel0) {
        this.a = chl0;
        this.b = hel0;
        this.c = 0x8000000080000000L;
        this.d = jkq.k(0, 0, 0, 15);
        this.f = new ParcelableSnapshotMutableState(null, gul.a);
    }

    public final void a(cgm cgm0) {
        this.f.b(cgm0);
    }

    @Override  // ifk
    public final iav b(iax iax0, ias ias0, long v) {
        cgm cgm2;
        cgm cgm1;
        cgp cgp0;
        ibq ibq0;
        boolean z = true;
        if(iax0.ep()) {
            this.d = v;
            this.e = true;
            ibq0 = ias0.e(v);
        }
        else {
            ibq0 = ias0.e((this.e ? this.d : v));
        }
        long v1 = ((long)ibq0.b) & 0xFFFFFFFFL | ((long)ibq0.a) << 0x20;
        if(iax0.ep()) {
            this.c = v1;
            return iaw.b(iax0, ((int)(v1 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)), new cgo(this, v1, ((int)(v1 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)), iax0, ibq0));
        }
        long v2 = cci.a(this.c) ? this.c : v1;
        cgm cgm0 = (cgm)this.f.a();
        if(cgm0 == null) {
            cgp0 = this;
            jlk jlk0 = new jlk(v2);
            jlk jlk1 = new jlk(0x100000001L);
            cgm2 = new cgm(new chb(jlk0, cmv.h, jlk1, 8), v2);
        }
        else {
            chb chb0 = cgm0.a;
            if(jlk.c(v2, ((jlk)chb0.d()).a) || chb0.j()) {
                z = false;
            }
            if(jlk.c(v2, ((jlk)chb0.c()).a) && !z) {
                cgp0 = this;
                cgm1 = cgm0;
            }
            else {
                cgm0.b = ((jlk)chb0.d()).a;
                cgm1 = cgm0;
                cgp0 = this;
                icbb.b(this.J(), null, null, new cgn(cgm1, v2, cgp0, null), 3);
            }
            cgm2 = cgm1;
        }
        cgp0.a(cgm2);
        long v3 = jkq.e(v, ((jlk)cgm2.a.d()).a);
        return iaw.b(iax0, ((int)(v3 >> 0x20)), ((int)(v3 & 0xFFFFFFFFL)), new cgo(cgp0, v1, ((int)(v3 >> 0x20)), ((int)(v3 & 0xFFFFFFFFL)), iax0, ibq0));
    }

    @Override  // hfb
    public final void dM() {
        this.a(null);
    }

    @Override  // hfb
    public final void dO() {
        this.c = 0x8000000080000000L;
        this.e = false;
    }
}

