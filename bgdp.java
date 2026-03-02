final class bgdp implements ibtx {
    final bgdu a;
    final ibth b;
    final ibtw c;

    public bgdp(bgdu bgdu0, ibth ibth0, ibtw ibtw0) {
        this.a = bgdu0;
        this.b = ibth0;
        this.c = ibtw0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dld)object0), "innerPadding");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dld)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        gze gze0 = gzf.e(0x5A150332, new bgdo(this.c, ((dld)object0)), ((goz)object1));
        gmv.b(this.a.a, this.b, null, null, null, null, gze0, ((goz)object1), 0x180000, 60);
        return ibom.a;
    }
}

