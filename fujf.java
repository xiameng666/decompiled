final class fujf implements ibtx {
    final fujl a;

    public fujf(fujl fujl0) {
        this.a = fujl0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dih)object0), "$this$BoxWithConstraints");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dih)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        fujl fujl0 = this.a;
        fuig fuig0 = fujl0.b;
        fujj.a(fuig0, fujl0.a, ((goz)object1), 0);
        if((fuig0 instanceof fuia)) {
            ((goz)object1).M(0xDE3913AA);
            fujj.d(((dih)object0), ((fuia)fuig0), ((goz)object1), v & 14);
            ((goz)object1).A();
            return ibom.a;
        }
        if((fuig0 instanceof fuib)) {
            ((goz)object1).M(0xDE391C6E);
            fujj.e(((dih)object0), ((fuib)fuig0), ((goz)object1), v & 14);
            ((goz)object1).A();
            return ibom.a;
        }
        if((fuig0 instanceof fuic)) {
            ((goz)object1).M(-566680266);
            fujj.f(((dih)object0), ((fuic)fuig0), fujl0.f, ((goz)object1), v & 14);
            ((goz)object1).A();
            return ibom.a;
        }
        if((fuig0 instanceof fuie)) {
            ((goz)object1).M(0xDE392F5D);
            fujj.h(((dih)object0), ((fuie)fuig0), fujl0.f, ((goz)object1), v & 14);
            ((goz)object1).A();
            return ibom.a;
        }
        if((fuig0 instanceof fuid)) {
            ((goz)object1).M(0xDE393BA7);
            fujj.g(((dih)object0), ((fuid)fuig0), ((goz)object1), v & 14);
            ((goz)object1).A();
            return ibom.a;
        }
        if((fuig0 instanceof fuif)) {
            ((goz)object1).M(0xDE39449E);
            fujj.i(((dih)object0), ((fuif)fuig0), fujl0.f, ((goz)object1), v & 14);
            ((goz)object1).A();
            return ibom.a;
        }
        if((fuig0 instanceof fuhz)) {
            ((goz)object1).M(0xDE394F14);
            fujj.c(((dih)object0), ((fuhz)fuig0), fujl0.f, ((goz)object1), v & 14);
            ((goz)object1).A();
            return ibom.a;
        }
        if(fuig0 == null) {
            ((goz)object1).M(0xE8F173F0);
            ((goz)object1).A();
            return ibom.a;
        }
        ((goz)object1).M(0xDE390E72);
        ((goz)object1).A();
        throw new ibnq();
    }
}

