final class dnlz implements ibtw {
    final hfc a;
    final fryv b;
    final fryv c;
    final ibth d;

    public dnlz(hfc hfc0, fryv fryv0, fryv fryv1, ibth ibth0) {
        this.a = hfc0;
        this.b = fryv0;
        this.c = fryv1;
        this.d = ibth0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibth ibth2;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ibth ibth0 = ((fufv)((goz)object0).h(fugo.a)).a;
        hfc hfc0 = this.a;
        fryv fryv0 = this.b;
        fryv fryv1 = this.c;
        ibth ibth1 = this.d;
        ((goz)object0).M(0x6CFABA02);
        if(ibth1 == null) {
            ibth2 = null;
        }
        else {
            ((goz)object0).M(-1633490746);
            int v = ((goz)object0).X(ibth0) | ((goz)object0).X(ibth1);
            Object object2 = ((goz)object0).k();
            if(v != 0 || object2 == gop.a) {
                object2 = new dnly(ibth0, ibth1);
                ((goz)object0).R(object2);
            }
            ibth2 = (ibth)object2;
            ((goz)object0).A();
        }
        ((goz)object0).A();
        dnmi.c(hfc0, fryv0, fryv1, ibth2, ((goz)object0), 0);
        return ibom.a;
    }
}

