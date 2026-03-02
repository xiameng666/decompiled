final class ddxl implements ibtw {
    final ibtx a;
    final ibty b;
    final ibtx c;

    public ddxl(ibtx ibtx0, ibty ibty0, ibtx ibtx1) {
        this.a = ibtx0;
        this.b = ibty0;
        this.c = ibtx1;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        dig.a(null, null, false, gzf.e(0x9E85507A, new ddxk(this.a, this.b, this.c), ((goz)object0)), ((goz)object0), 0xC00, 7);
        return ibom.a;
    }
}

