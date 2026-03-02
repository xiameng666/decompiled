import java.util.List;

public final class bvfj implements ibty {
    final List a;
    final eoqf b;

    public bvfj(List list0, eoqf eoqf0) {
        this.a = list0;
        this.b = eoqf0;
        super();
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        int v2 = (v1 & 6) == 0 ? (((goz)object2).X(((dnj)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (((goz)object2).V(v) ? 0x20 : 16);
        }
        if(((goz)object2).ad((v2 & 0x93) != 0x92, v2 & 1)) {
            bvgq bvgq0 = (bvgq)this.a.get(v);
            ((goz)object2).M(-610411012);
            bvew.a(this.b, bvgq0, ((goz)object2), 72);
            ((goz)object2).A();
            return ibom.a;
        }
        ((goz)object2).G();
        return ibom.a;
    }
}

