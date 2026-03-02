final class bvcn implements ibtx {
    final bvgp a;

    public bvcn(bvgp bvgp0) {
        this.a = bvgp0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        bvgp bvgp0 = this.a;
        if(!(bvgp0 instanceof bvgl)) {
            if((bvgp0 instanceof bvgo)) {
                ((goz)object1).M(1738809909);
                bvfl.f(null, ((goz)object1), 0);
                ((goz)object1).A();
                return ibom.a;
            }
            if((bvgp0 instanceof bvgn)) {
                ((goz)object1).M(0x67A5AF27);
                bvfl.c(((bvgn)bvgp0).a, ((bvgn)bvgp0).b, ((bvgn)bvgp0).c, null, ((goz)object1), 0x40);
                ((goz)object1).A();
                return ibom.a;
            }
            if((bvgp0 instanceof bvgm)) {
                ((goz)object1).M(1739208507);
                bvfl.b(((bvgm)bvgp0).b, ((bvgm)bvgp0).a, ((bvgm)bvgp0).c, null, ((goz)object1), 0);
                ((goz)object1).A();
                return ibom.a;
            }
            ((goz)object1).M(-1190840957);
            ((goz)object1).A();
            throw new ibnq();
        }
        ((goz)object1).M(1738676206);
        ((goz)object1).A();
        throw new IllegalStateException("Empty model should not be rendered");
    }
}

