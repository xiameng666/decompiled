public final class bppm implements gfsi {
    public final bpqt a;
    public final gsyz b;
    public final long c;
    public final long d;

    public bppm(bpqt bpqt0, gsyz gsyz0, long v, long v1) {
        this.a = bpqt0;
        this.b = gsyz0;
        this.c = v;
        this.d = v1;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        long v1;
        long v = this.c;
        if((((gtaz)object0).b & 0x20) == 0) {
            v1 = this.d;
        }
        else {
            hfwn hfwn0 = ((gtaz)object0).k;
            if(hfwn0 == null) {
                hfwn0 = hfwn.a;
            }
            v1 = Math.min(hfyn.d(hfwn0), fqvq.a + v);
        }
        bpqt bpqt0 = this.a;
        gsyz gsyz0 = ((gtaz)object0).c;
        if(gsyz0 == null) {
            gsyz0 = gsyz.a;
        }
        gtap gtap0 = ((gtaz)object0).d;
        if(gtap0 == null) {
            gtap0 = gtap.a;
        }
        gtad gtad0 = ((gtaz)object0).h;
        if(gtad0 == null) {
            gtad0 = gtad.a;
        }
        gdta gdta0 = bpqt0.d.a(gsyz0, gtap0, gtad0);
        gsyz gsyz1 = ((gtaz)object0).c;
        if(gsyz1 == null) {
            gsyz1 = gsyz.a;
        }
        if(((ProtoLiteMessage)gsyz1).equals(this.b)) {
            return gdta0.i(new bppt(bpqt0, ((gtaz)object0), v, v1), bpqt0.b);
        }
        gdta gdta1 = gdta0.h(new bppu(bpqt0, ((gtaz)object0), v, v1), bpqt0.b);
        bppv bppv0 = new bppv(((gtaz)object0));
        return gdta1.e(Throwable.class, bppv0, bpqt0.b);
    }
}

