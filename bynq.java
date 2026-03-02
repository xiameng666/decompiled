import java.util.List;

final class bynq implements ibtx {
    final List a;
    final ibts b;

    public bynq(List list0, ibts ibts0) {
        this.a = list0;
        this.b = ibts0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dnj)object0), "$this$item");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        byjd.b(null, gzf.e(0x24C8FE08, new bynp(this.a, this.b), ((goz)object1)), ((goz)object1), 0x30);
        return ibom.a;
    }
}

