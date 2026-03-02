final class bvdg implements ibtx {
    final bvgx a;

    public bvdg(bvgx bvgx0) {
        this.a = bvgx0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$HeaderPage");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        bvgb bvgb0 = this.a.c;
        if(bvgb0 != null) {
            bvdp.b(bvgb0, ((goz)object1), 8);
        }
        return ibom.a;
    }
}

