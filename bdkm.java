final class bdkm implements ibtw {
    final bdku a;
    final gui b;

    public bdkm(bdku bdku0, gui gui0) {
        this.a = bdku0;
        this.b = gui0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        bdsg bdsg0 = (bdsg)this.b.a();
        bdku bdku0 = this.a;
        ((goz)object0).M(5004770);
        boolean z = ((goz)object0).Z(bdku0);
        Object object2 = ((goz)object0).k();
        if(z || object2 == gop.a) {
            object2 = new bdkk(bdku0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        bdla bdla0 = bdku0.y();
        ((goz)object0).M(5004770);
        boolean z1 = ((goz)object0).Z(bdla0);
        Object object3 = ((goz)object0).k();
        if(z1 || object3 == gop.a) {
            object3 = new bdkl(bdla0);
            ((goz)object0).R(object3);
        }
        ((goz)object0).A();
        bdsa.g(bdsg0, ((ibth)(((ibwx)object2))), ((ibth)(((ibwx)object3))), ((goz)object0), 0);
        return ibom.a;
    }
}

