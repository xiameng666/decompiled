final class bvdc implements ibtx {
    final bvfm a;

    public bvdc(bvfm bvfm0) {
        this.a = bvfm0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        cmhi cmhi0 = (cmhi)((goz)object1).h(cmht.a);
        ((goz)object1).M(5004770);
        boolean z = ((goz)object1).Z(((cmhw)object0));
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new bvda(((cmhw)object0));
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        ((goz)object1).M(5004770);
        boolean z1 = ((goz)object1).Z(cmhi0);
        Object object4 = ((goz)object1).k();
        if(z1 || object4 == gop.a) {
            object4 = new bvdb(cmhi0);
            ((goz)object1).R(object4);
        }
        ((goz)object1).A();
        bveh.a(this.a.b, ((ibth)object3), ((ibth)object4), ((goz)object1), 0);
        return ibom.a;
    }
}

