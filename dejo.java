final class dejo implements ibtx {
    final ibth a;
    final fyx b;
    final ibth c;

    public dejo(ibth ibth0, fyx fyx0, ibth ibth1) {
        this.a = ibth0;
        this.b = fyx0;
        this.c = ibth1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        goz goz0 = (goz)object1;
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        dkt dkt0 = new dkt(dmw.f(goz0), 0x20);
        dld dld0 = dmk.b(new dkt(dmw.f(goz0), 16), goz0);
        hfc hfc0 = dla.c(hfc.e, dld0);
        long v = fpu.a(goz0).D;
        gze gze0 = gzf.e(0x1D60EC17, new dejn(this.c, this.b, this.a), goz0);
        fisz.a(this.a, hfc0, this.b, 0.0f, false, null, v, 0L, 0.0f, 0L, null, dkt0, null, gze0, goz0, 0, 0xC06, 5048);
        return ibom.a;
    }
}

