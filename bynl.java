final class bynl implements ibtw {
    final ibts a;
    final bynx b;

    public bynl(ibts ibts0, bynx bynx0) {
        this.a = ibts0;
        this.b = bynx0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        String s = isq.c(0x7F152F7B, ((goz)object0));  // string:string_continue "Continue"
        ((goz)object0).M(-1633490746);
        ibts ibts0 = this.a;
        int v = ((goz)object0).X(ibts0);
        bynx bynx0 = this.b;
        int v1 = v | ((goz)object0).Z(bynx0);
        Object object2 = ((goz)object0).k();
        if(v1 != 0 || object2 == gop.a) {
            object2 = new bynk(ibts0, bynx0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        byjo.a(s, ((ibth)object2), ((goz)object0), 0);
        return ibom.a;
    }
}

