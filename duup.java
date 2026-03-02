import java.util.List;

public final class duup implements ibty {
    final List a;
    final ibts b;

    public duup(List list0, ibts ibts0) {
        this.a = list0;
        this.b = ibts0;
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
            hkas hkas0 = (hkas)this.a.get(v);
            ((goz)object2).M(0x4AA3DEC6);
            duus.s(null, hkas0, this.b, ((goz)object2), 0);
            ((goz)object2).A();
            return ibom.a;
        }
        ((goz)object2).G();
        return ibom.a;
    }
}

