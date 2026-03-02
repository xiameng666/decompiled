import java.util.List;

public final class bdry implements ibty {
    final List a;
    final bdsf b;
    final long c;

    public bdry(List list0, bdsf bdsf0, long v) {
        this.a = list0;
        this.b = bdsf0;
        this.c = v;
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
            bdtx bdtx0 = (bdtx)this.a.get(v);
            ((goz)object2).M(0xB244C1F);
            boolean z = v == ibpo.d(this.b.f);
            bdsa.i(bdtv.a(hfc.e, z), (z ? 16.0f : 0.0f), gzf.e(0x7C50ECF8, new bdru(z, this.c, bdtx0, z), ((goz)object2)), ((goz)object2), 0xC00, 2);
            ((goz)object2).A();
            return ibom.a;
        }
        ((goz)object2).G();
        return ibom.a;
    }
}

