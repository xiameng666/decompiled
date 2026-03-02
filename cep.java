public final class cep extends cew {
    public clj a;
    public clb b;
    public clb c;
    public clb d;
    public ceq e;
    public cer f;
    public ibth g;
    public hel h;
    public cdf i;
    private long j;
    private final ibts k;
    private final ibts l;

    public cep(clj clj0, clb clb0, clb clb1, clb clb2, ceq ceq0, cer cer0, ibth ibth0, cdf cdf0) {
        this.a = clj0;
        this.b = clb0;
        this.c = clb1;
        this.d = clb2;
        this.e = ceq0;
        this.f = cer0;
        this.g = ibth0;
        this.i = cdf0;
        this.j = 0x8000000080000000L;
        jkq.k(0, 0, 0, 15);
        this.k = new cen(this);
        this.l = new ceo(this);
    }

    public final hel a() {
        cco cco1;
        if(this.a.e().h(cde.a, cde.b)) {
            cco cco0 = this.e.b.c;
            if(cco0 != null) {
                hel hel0 = cco0.a;
                if(hel0 != null) {
                    return hel0;
                }
            }
            cco1 = this.f.b.c;
            return cco1 == null ? null : cco1.a;
        }
        cco cco2 = this.f.b.c;
        if(cco2 != null) {
            hel hel1 = cco2.a;
            if(hel1 != null) {
                return hel1;
            }
        }
        cco1 = this.e.b.c;
        return cco1 == null ? null : cco1.a;
    }

    @Override  // ifk
    public final iav b(iax iax0, ias ias0, long v) {
        long v7;
        long v6;
        gui gui3;
        hnd hnd0;
        gui gui0 = null;
        if(this.a.f() == this.a.g()) {
            this.h = null;
        }
        else if(this.h == null) {
            hel hel0 = this.a();
            if(hel0 == null) {
                hel0 = hei.a;
            }
            this.h = hel0;
        }
        if(iax0.ep()) {
            ibq ibq0 = ias0.e(v);
            long v1 = ((long)ibq0.a) << 0x20 | ((long)ibq0.b) & 0xFFFFFFFFL;
            this.j = v1;
            return iaw.b(iax0, ((int)(v1 >> 0x20)), ((int)(0xFFFFFFFFL & v1)), new ceg(ibq0));
        }
        if(((Boolean)this.g.a()).booleanValue()) {
            clb clb0 = this.i.a;
            clb clb1 = this.i.b;
            clj clj0 = this.i.c;
            ceq ceq0 = this.i.d;
            cer cer0 = this.i.e;
            clb clb2 = this.i.f;
            gui gui1 = clb0 == null ? null : clb0.b(new cdi(ceq0, cer0), new cdj(ceq0, cer0));
            gui gui2 = clb1 == null ? null : clb1.b(new cdl(ceq0, cer0), new cdm(ceq0, cer0));
            if(clj0.f() == cde.a) {
                cez cez0 = ceq0.b.d;
                if(cez0 == null) {
                    cez cez1 = cer0.b.d;
                    hnd0 = cez1 == null ? null : new hnd(cez1.b);
                }
                else {
                    hnd0 = new hnd(cez0.b);
                }
            }
            else {
                cez cez2 = cer0.b.d;
                if(cez2 == null) {
                    cez cez3 = ceq0.b.d;
                    hnd0 = cez3 == null ? null : new hnd(cez3.b);
                }
                else {
                    hnd0 = new hnd(cez2.b);
                }
            }
            if(clb2 == null) {
                gui3 = null;
            }
            else {
                cdo cdo0 = new cdo(hnd0, ceq0, cer0);
                gui3 = clb2.b(cdn.a, cdo0);
            }
            cdk cdk0 = new cdk(gui1, gui2, gui3);
            ibq ibq1 = ias0.e(v);
            long v2 = this.j;
            long v3 = ((long)ibq1.a) << 0x20 | ((long)ibq1.b) & 0xFFFFFFFFL;
            if(!cci.a(v2)) {
                v2 = v3;
            }
            clb clb3 = this.b;
            if(clb3 != null) {
                cej cej0 = new cej(this, v2);
                gui0 = clb3.b(this.k, cej0);
            }
            if(gui0 != null) {
                v3 = ((jlk)gui0.a()).a;
            }
            long v4 = jkq.e(v, v3);
            clb clb4 = this.c;
            long v5 = 0L;
            if(clb4 == null) {
                v6 = 0L;
            }
            else {
                cel cel0 = new cel(this, v2);
                v6 = ((jlf)clb4.b(cek.a, cel0).a()).a;
            }
            clb clb5 = this.d;
            if(clb5 == null) {
                v7 = 0L;
            }
            else {
                cem cem0 = new cem(this, v2);
                v7 = ((jlf)clb5.b(this.l, cem0).a()).a;
            }
            hel hel1 = this.h;
            if(hel1 != null) {
                v5 = hel1.a(v2, v4, jlm.a);
            }
            return iaw.b(iax0, ((int)(v4 >> 0x20)), ((int)(v4 & 0xFFFFFFFFL)), new ceh(ibq1, jlf.d(v5, v7), v6, cdk0));
        }
        ibq ibq2 = ias0.e(v);
        return iaw.b(iax0, ibq2.a, ibq2.b, new cei(ibq2));
    }

    @Override  // hfb
    public final void dO() {
        this.j = 0x8000000080000000L;
    }
}

