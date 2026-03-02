final class ehzn implements ibtx {
    final hfc a;
    final gui b;
    final chb c;
    final qox d;
    final qnu e;

    public ehzn(qnu qnu0, hfc hfc0, gui gui0, chb chb0, qox qox0) {
        this.e = qnu0;
        this.a = hfc0;
        this.b = gui0;
        this.c = chb0;
        this.d = qox0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((ccg)object0), "$this$AnimatedVisibility");
        qnu qnu0 = this.e;
        qkb qkb0 = qnu0.h();
        ((goz)object1).M(5004770);
        boolean z = ((goz)object1).X(qnu0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new ehzl(qnu0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        hfc hfc0 = this.a;
        ((goz)object1).M(-1633490746);
        gui gui0 = this.b;
        int v = ((goz)object1).X(gui0);
        chb chb0 = this.c;
        int v1 = v | ((goz)object1).Z(chb0);
        Object object4 = ((goz)object1).k();
        if(v1 != 0 || object4 == gop.a) {
            object4 = new ehzm(chb0, gui0);
            ((goz)object1).R(object4);
        }
        ((goz)object1).A();
        qob.c(qkb0, ((ibth)object3), iqn.a(hlv.a(hfc0, ((ibts)object4)), "OUTER_STAR_TAG"), false, false, false, 0, false, this.d, null, null, false, 0, ((goz)object1), 0x8000000, 0, 0xFEF8);
        return ibom.a;
    }
}

