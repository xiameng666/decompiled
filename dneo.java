final class dneo implements ibtx {
    final dnfc a;

    public dneo(dnfc dnfc0) {
        this.a = dnfc0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dld)object0), "contentPadding");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dld)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        jks jks0 = (jks)((goz)object1).h(ipa.d);
        irc irc0 = (irc)((goz)object1).h(ipa.n);
        ((goz)object1).M(0x6E3C21FE);
        Object object3 = ((goz)object1).k();
        if(object3 == gop.a) {
            object3 = new jkv(jks0.ec(((int)(irc0.a() >> 0x20))));
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        if(jkv.a(((jkv)object3).a, 600.0f) >= 0) {
            ((goz)object1).M(1220129461);
            this.a.D(((dld)object0), ((goz)object1), v & 14);
            ((goz)object1).A();
            return ibom.a;
        }
        ((goz)object1).M(1220179061);
        this.a.I(((dld)object0), ((goz)object1), v & 14);
        ((goz)object1).A();
        return ibom.a;
    }
}

