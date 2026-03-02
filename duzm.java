final class duzm implements ibtw {
    final duzo a;
    final hkas b;
    final gtxf c;

    public duzm(duzo duzo0, hkas hkas0, gtxf gtxf0) {
        this.a = duzo0;
        this.b = hkas0;
        this.c = gtxf0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        duzo duzo0 = this.a;
        hkas hkas0 = this.b;
        ((goz)object0).M(0x97EA02AA);
        int v = ((goz)object0).Z(duzo0);
        gtxf gtxf0 = this.c;
        int v1 = ((goz)object0).X(hkas0);
        Object object2 = ((goz)object0).k();
        if((v | ((goz)object0).V(gtxf0.ordinal()) | v1) != 0 || object2 == gop.a) {
            object2 = new duzi(duzo0, gtxf0, hkas0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        ((goz)object0).M(5004770);
        boolean z = ((goz)object0).Z(duzo0);
        Object object3 = ((goz)object0).k();
        if(z || object3 == gop.a) {
            object3 = new duzl(duzo0);
            ((goz)object0).R(object3);
        }
        ((goz)object0).A();
        ((goz)object0).M(-1633490746);
        int v2 = ((goz)object0).Z(duzo0) | ((goz)object0).X(hkas0);
        Object object4 = ((goz)object0).k();
        if(v2 != 0 || object4 == gop.a) {
            object4 = new duzj(duzo0, hkas0);
            ((goz)object0).R(object4);
        }
        ((goz)object0).A();
        ((goz)object0).M(-1633490746);
        int v3 = ((goz)object0).Z(duzo0) | ((goz)object0).X(hkas0);
        Object object5 = ((goz)object0).k();
        if(v3 != 0 || object5 == gop.a) {
            object5 = new duzk(duzo0, hkas0);
            ((goz)object0).R(object5);
        }
        ((goz)object0).A();
        duzo0.z(null, hkas0, ((ibth)object2), ((ibth)(((ibwx)object3))), ((ibth)object4), ((ibth)object5), ((goz)object0), 0);
        return ibom.a;
    }
}

