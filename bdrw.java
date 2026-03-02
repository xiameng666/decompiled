import java.util.List;

public final class bdrw implements ibty {
    final List a;
    final bdsf b;
    final boolean c;
    final long d;

    public bdrw(List list0, bdsf bdsf0, boolean z, long v) {
        this.a = list0;
        this.b = bdsf0;
        this.c = z;
        this.d = v;
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
            ((goz)object2).M(0x82F6A427);
            boolean z = v == ibpo.d(this.b.e);
            boolean z1 = this.c && z;
            bdsa.i(bdtv.a(hfc.e, z1), (z1 ? 16.0f : 0.0f), gzf.e(0xB4663C3A, new bdrq(z1, this.d, bdtx0, z), ((goz)object2)), ((goz)object2), 0xC00, 2);
            ((goz)object2).A();
            return ibom.a;
        }
        ((goz)object2).G();
        return ibom.a;
    }
}

