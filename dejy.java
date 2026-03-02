final class dejy implements ibtx {
    final gra a;

    public dejy(gra gra0) {
        this.a = gra0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((cfz)object0), "$this$SharedTransitionLayout");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((cfz)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ceq ceq0 = cef.o(fpu.b(((goz)object1)).a(), 2);
        cer cer0 = cef.p(fpu.b(((goz)object1)).a(), 2);
        Integer integer0 = dekk.b(this.a);
        ((goz)object1).M(-1633490746);
        int v1 = ((goz)object1).X(ceq0) | ((goz)object1).X(cer0);
        Object object3 = ((goz)object1).k();
        if(v1 != 0 || object3 == gop.a) {
            object3 = new dejs(ceq0, cer0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        cau.a(integer0, null, ((ibts)object3), null, null, null, gzf.e(0x64BEB2EF, new dejx(((cfz)object0)), ((goz)object1)), ((goz)object1), 0x180000, 58);
        return ibom.a;
    }
}

