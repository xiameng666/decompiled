final class ftvf implements ibtx {
    final ftvk a;

    public ftvf(ftvk ftvk0) {
        this.a = ftvk0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        long v1;
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$Card");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hfc hfc0 = dla.e(hfc.e, 12.0f, 4.0f);
        ftvk ftvk0 = this.a;
        fryv fryv0 = ftvk0.a();
        jbn jbn0 = fpu.d(((goz)object1)).n;
        if((ftvk0 instanceof ftvi)) {
            ((goz)object1).M(0x47706E79);
            ftvi ftvi0 = (ftvi)ftvk0;
            ((goz)object1).M(0xA69FB588);
            v1 = fsbs.d(fpu.a(((goz)object1)), ((goz)object1));
            ((goz)object1).A();
            ((goz)object1).A();
            ftzd.a(fryv0, hfc0, v1, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, ((goz)object1), 0, 0, 0x1FFF8);
            return ibom.a;
        }
        if((ftvk0 instanceof ftvj)) {
            ((goz)object1).M(0x47709225);
            ibuq.f(fpu.a(((goz)object1)), "<this>");
            ((goz)object1).M(-1496660632);
            v1 = (csd.a(((goz)object1)) ? 0xFFC4EED0L : 0xFF072711L) << 0x20;
            ((goz)object1).A();
            ((goz)object1).A();
            ftzd.a(fryv0, hfc0, v1, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, ((goz)object1), 0, 0, 0x1FFF8);
            return ibom.a;
        }
        if((ftvk0 instanceof ftvh)) {
            ((goz)object1).M(0x47709C25);
            ibuq.f(fpu.a(((goz)object1)), "<this>");
            ((goz)object1).M(0x3D2D68E0);
            v1 = (csd.a(((goz)object1)) ? 0xFFF9DEDCL : 0xFF410E0BL) << 0x20;
            ((goz)object1).A();
            ((goz)object1).A();
            ftzd.a(fryv0, hfc0, v1, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, ((goz)object1), 0, 0, 0x1FFF8);
            return ibom.a;
        }
        ((goz)object1).M(0x477067A1);
        ((goz)object1).A();
        throw new ibnq();
    }
}

