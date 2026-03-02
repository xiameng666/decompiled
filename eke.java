public final class eke implements ibtz {
    @Override  // ibtz
    public final Object a(Object object0, Object object1, Object object2, Object object3, Object object4) {
        int v = (int)(((Integer)object4));
        boolean z = true;
        int v1 = (v & 6) == 0 ? (((v & 8) == 0 ? ((goz)object3).X(((ejc)object0)) : ((goz)object3).Z(((ejc)object0))) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((v & 0x40) == 0 ? ((goz)object3).X(((emx)object1)) : ((goz)object3).Z(((emx)object1))) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (((goz)object3).Z(((ibth)object2)) ? 0x100 : 0x80);
        }
        if((v1 & 0x493) == 1170) {
            z = false;
        }
        if(((goz)object3).ad(z, v1 & 1)) {
            eku.c(((ejc)object0), ((emx)object1), ((ibth)object2), ((goz)object3), v1 & 0x3FE);
            return ibom.a;
        }
        ((goz)object3).G();
        return ibom.a;
    }
}

