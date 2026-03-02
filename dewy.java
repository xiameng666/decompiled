final class dewy implements ibtx {
    final ibth a;
    final ibth b;
    final boolean c;
    final ibth d;
    final gra e;

    public dewy(ibth ibth0, ibth ibth1, boolean z, ibth ibth2, gra gra0) {
        this.a = ibth0;
        this.b = ibth1;
        this.c = z;
        this.d = ibth2;
        this.e = gra0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$DropdownMenu");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        cmig.f(0x40954, gzf.e(0x1FFDACA8, new dewx(this.a, this.b, this.e), ((goz)object1)), ((goz)object1), 54);
        return ibom.a;
    }
}

