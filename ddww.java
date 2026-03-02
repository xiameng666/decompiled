final class ddww implements ibtx {
    final ibty a;
    final ibty b;

    public ddww(ibty ibty0, ibty ibty1) {
        this.a = ibty0;
        this.b = ibty1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dkd)object0), "$this$FlowRow");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ibty ibty0 = this.a;
        ((goz)object1).M(1340249310);
        if(ibty0 != null) {
            hey hey0 = hfc.e;
            ((goz)object1).M(0x6E3C21FE);
            Object object3 = ((goz)object1).k();
            if(object3 == gop.a) {
                object3 = new ddwu();
                ((goz)object1).R(object3);
            }
            ((goz)object1).A();
            ibty0.a(hey0, ((ibts)object3), ((goz)object1), Integer.valueOf(54));
        }
        ((goz)object1).A();
        ibty ibty1 = this.b;
        if(ibty1 != null) {
            hey hey1 = hfc.e;
            ((goz)object1).M(0x6E3C21FE);
            Object object4 = ((goz)object1).k();
            if(object4 == gop.a) {
                object4 = new ddwv();
                ((goz)object1).R(object4);
            }
            ((goz)object1).A();
            ibty1.a(hey1, ((ibts)object4), ((goz)object1), Integer.valueOf(54));
        }
        return ibom.a;
    }
}

