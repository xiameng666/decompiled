final class ftug implements ibtw {
    final hfc a;
    final ftts b;
    final fuhp c;

    public ftug(hfc hfc0, ftts ftts0, fuhp fuhp0) {
        this.a = hfc0;
        this.b = ftts0;
        this.c = fuhp0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ibth ibth0 = ((fufv)((goz)object0).h(fugo.a)).a;
        hfc hfc0 = this.a;
        ftts ftts0 = this.b;
        fuhp fuhp0 = this.c;
        ((goz)object0).M(-1633490746);
        int v = ((goz)object0).X(ibth0) | ((goz)object0).Z(ftts0);
        Object object2 = ((goz)object0).k();
        if(v != 0 || object2 == gop.a) {
            object2 = new ftuf(ibth0, ftts0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        ftuu.c(hfc0, ftts0, fuhp0, ((ibth)object2), ((goz)object0), 0);
        return ibom.a;
    }
}

