final class sje implements ibtw {
    final sip a;
    final sip b;

    public sje(sip sip0, sip sip1) {
        this.a = sip0;
        this.b = sip1;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ((goz)object0).M(0x24928701);
        gze gze0 = gzf.e(1705322438, new sjc(this.a), ((goz)object0));
        fcm.c(this.a.b, null, false, null, null, null, null, gze0, ((goz)object0), 0x30000000, 510);
        ((goz)object0).A();
        sip sip0 = this.b;
        ((goz)object0).M(5004770);
        boolean z = ((goz)object0).X(sip0);
        Object object2 = ((goz)object0).k();
        if(z || object2 == gop.a) {
            object2 = new sjb(sip0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        fcm.a(((ibth)object2), null, false, null, null, null, null, null, gzf.e(0x943A61FB, new sjd(sip0), ((goz)object0)), ((goz)object0), 0x30000000, 510);
        return ibom.a;
    }
}

