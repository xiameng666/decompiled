final class bvde implements ibtx {
    final bvgd a;

    public bvde(bvgd bvgd0) {
        this.a = bvgd0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$RegularFixedScaffold");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        bvdp.e(this.a.b, ((goz)object1), 8);
        return ibom.a;
    }
}

