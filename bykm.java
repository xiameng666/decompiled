final class bykm implements ibtx {
    final String a;

    public bykm(String s) {
        this.a = s;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$XButtonTopAppBarInternal");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dlp)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        String s = this.a;
        hfc hfc0 = dlo.a(((dlp)object0), dla.j(hfc.e, 0.0f, 24.0f, 0.0f, 0.0f, 13), 1.0f);
        ((goz)object1).M(0x6E3C21FE);
        Object object3 = ((goz)object1).k();
        if(object3 == gop.a) {
            object3 = new bykl();
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        byml.b(s, iuc.d(hfc0, ((ibts)object3)), ((goz)object1), 0, 0);
        return ibom.a;
    }
}

