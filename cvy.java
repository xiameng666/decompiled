public final class cvy implements ibuc {
    @Override  // ibuc
    public final Object a(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        Object object9;
        Object object8;
        Boolean boolean0 = (Boolean)object2;
        int v = (int)(((Integer)object7));
        boolean z = true;
        int v1 = (v & 6) == 0 ? (((goz)object6).X(object0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((goz)object6).X(object1) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (((goz)object6).Y(true) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            v1 |= (((goz)object6).X(object3) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            object8 = object4;
            v1 |= (((goz)object6).Z(object8) ? 0x4000 : 0x2000);
        }
        else {
            object8 = object4;
        }
        if((v & 0x30000) == 0) {
            object9 = object5;
            v1 |= (((goz)object6).Z(object9) ? 0x20000 : 0x10000);
        }
        else {
            object9 = object5;
        }
        if((0x92493 & v1) == 0x92492) {
            z = false;
        }
        if(((goz)object6).ad(z, v1 & 1)) {
            cwo.b(((String)object1), true, ((cwb)object3), ((hfc)object0), ((ibtx)object8), ((ibth)object9), ((goz)object6), v1 >> 3 & 0x3FE | v1 << 9 & 0x1C00 | 0xE000 & v1 | v1 & 0x70000);
            return ibom.a;
        }
        ((goz)object6).G();
        return ibom.a;
    }
}

