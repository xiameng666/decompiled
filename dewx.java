final class dewx implements ibtx {
    final ibth a;
    final ibth b;
    final gra c;

    public dewx(ibth ibth0, ibth ibth1, gra gra0) {
        this.a = ibth0;
        this.b = ibth1;
        this.c = gra0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        ((goz)object1).M(-1633490746);
        ibth ibth0 = this.a;
        boolean z = ((goz)object1).X(ibth0);
        Object object3 = ((goz)object1).k();
        gra gra0 = this.c;
        if(z || object3 == gop.a) {
            object3 = new dewv(ibth0, gra0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        dexb.e(((ibth)object3), ((goz)object1), 0);
        ((goz)object1).M(-1633490746);
        ibth ibth1 = this.b;
        boolean z1 = ((goz)object1).X(ibth1);
        Object object4 = ((goz)object1).k();
        if(z1 || object4 == gop.a) {
            object4 = new deww(ibth1, gra0);
            ((goz)object1).R(object4);
        }
        ((goz)object1).A();
        dexb.c(((ibth)object4), ((goz)object1), 0);
        return ibom.a;
    }
}

