final class dmvv implements ibtx {
    final fryv a;
    final String b;
    final dmwr c;

    public dmvv(fryv fryv0, String s, dmwr dmwr0) {
        this.a = fryv0;
        this.b = s;
        this.c = dmwr0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dnj)object0), "$this$item");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        fryv fryv0 = this.a;
        String s = this.b;
        fuat fuat0 = new fuat(fryv0, new fryu(s), null, null, 0, null, null, null, null, false, false, false, null, false, 0x3FFC);
        hey hey0 = hfc.e;
        ((goz)object1).M(0x97EA02AA);
        int v1 = ((goz)object1).Z(fryv0);
        dmwr dmwr0 = this.c;
        int v2 = v1 | ((goz)object1).Z(dmwr0) | ((goz)object1).X(s);
        Object object3 = ((goz)object1).k();
        if(v2 != 0 || object3 == gop.a) {
            object3 = new dmvu(fryv0, dmwr0, s);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        fuar.f(iuc.c(hey0, true, ((ibts)object3)), fuat0, ((goz)object1), 0x40, 0);
        return ibom.a;
    }
}

