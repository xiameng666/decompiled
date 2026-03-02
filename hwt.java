public final class hwt extends ibur implements ibtx {
    final ibts a;

    public hwt(ibts ibts0) {
        this.a = ibts0;
        super(3);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        hfc hfc0 = (hfc)object0;
        ((Number)object2).intValue();
        ((goz)object1).M(0x1650851B);
        Object object3 = ((goz)object1).k();
        if(object3 == gop.a) {
            object3 = new hws();
            ((goz)object1).R(object3);
        }
        ((hws)object3).a = this.a;
        ((hws)object3).e(null);
        ((goz)object1).A();
        return (hws)object3;
    }
}

