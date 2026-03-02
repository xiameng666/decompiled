final class dxlh implements ibtw {
    final gep a;
    final dxlm b;

    public dxlh(gep gep0, dxlm dxlm0) {
        this.a = gep0;
        this.b = dxlm0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gej gej0 = fiuq.d(0L, ((goz)object0), 0x3F);
        gze gze0 = gzf.e(0xFE8C214, new dxle(this.b), ((goz)object0));
        gze gze1 = gzf.e(0xD650D90B, new dxlg(this.b), ((goz)object0));
        fiqk.a(dxhy.a, null, gze0, gze1, 0.0f, null, gej0, this.a, ((goz)object0), 0xD86, 50);
        return ibom.a;
    }
}

