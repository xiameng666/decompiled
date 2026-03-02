final class dndp implements ibtw {
    final dndr a;

    public dndp(dndr dndr0) {
        this.a = dndr0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ((goz)object0).M(5004770);
        dndr dndr0 = this.a;
        boolean z = ((goz)object0).Z(dndr0);
        Object object2 = ((goz)object0).k();
        if(z || object2 == gop.a) {
            object2 = new dndo(dndr0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        dnno.a(null, ((ibth)object2), ((goz)object0), 0x180);
        return ibom.a;
    }
}

