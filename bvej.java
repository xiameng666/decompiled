final class bvej implements ibtx {
    final bvgw a;
    final bvek b;

    public bvej(bvgw bvgw0, bvek bvek0) {
        this.a = bvgw0;
        this.b = bvek0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        bvgw bvgw0 = this.a;
        if(!(bvgw0 instanceof bvgs)) {
            if((bvgw0 instanceof bvgv)) {
                ((goz)object1).M(0xEB4098F8);
                bvfl.f(null, ((goz)object1), 0);
                ((goz)object1).A();
                return ibom.a;
            }
            if((bvgw0 instanceof bvgu)) {
                ((goz)object1).M(0xEB420367);
                bvfl.e(this.b.a, ((bvgu)bvgw0).a, ((bvgu)bvgw0).b, null, ((goz)object1), 8);
                ((goz)object1).A();
                return ibom.a;
            }
            if((bvgw0 instanceof bvgt)) {
                ((goz)object1).M(-347764091);
                bvfl.d(((bvgt)bvgw0).b, ((bvgt)bvgw0).a, ((bvgt)bvgw0).c, null, ((goz)object1), 0);
                ((goz)object1).A();
                return ibom.a;
            }
            ((goz)object1).M(1651334080);
            ((goz)object1).A();
            throw new ibnq();
        }
        ((goz)object1).M(0xEB3EA9D1);
        ((goz)object1).A();
        throw new IllegalStateException("Empty model should not be rendered");
    }
}

