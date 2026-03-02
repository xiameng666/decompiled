final class dxpe implements ibtw {
    final dxpm a;

    public dxpe(dxpm dxpm0) {
        this.a = dxpm0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        dxpm dxpm0 = this.a;
        gui gui0 = ltd.c(dxpm0.y().b.a, new dxpn(null), ((goz)object0));
        jks jks0 = (jks)((goz)object0).h(ipa.d);
        irc irc0 = (irc)((goz)object0).h(ipa.n);
        ((goz)object0).M(0x6E3C21FE);
        Object object2 = ((goz)object0).k();
        if(object2 == gop.a) {
            object2 = new jkv(jks0.ec(((int)(irc0.a() >> 0x20))));
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        ibuq.f(dxpm.a, "<set-?>");
        dxpm0.d = dxpm.a;
        dxpn dxpn0 = (dxpn)gui0.a();
        dxpm0.G(((jkv)object2).a, dxpn0, ((goz)object0), 6);
        return ibom.a;
    }
}

