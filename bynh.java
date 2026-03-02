final class bynh implements ibtx {
    final bynx a;
    final ibts b;

    public bynh(bynx bynx0, ibts ibts0) {
        this.a = bynx0;
        this.b = ibts0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$CredentialContainerCard");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        bynx bynx0 = this.a;
        ((goz)object1).M(-1633490746);
        ibts ibts0 = this.b;
        int v1 = ((goz)object1).X(ibts0) | ((goz)object1).Z(bynx0);
        Object object3 = ((goz)object1).k();
        if(v1 != 0 || object3 == gop.a) {
            object3 = new byng(ibts0, bynx0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        bynr.c(bynx0, ((ibth)object3), ((goz)object1), 0);
        return ibom.a;
    }
}

