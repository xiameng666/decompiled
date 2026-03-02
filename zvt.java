final class zvt implements ibtx {
    final znr a;

    public zvt(znr znr0) {
        this.a = znr0;
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
        ggqk ggqk0 = this.a.a.E();
        ibuq.e(ggqk0, "iterator(...)");
        while(ggqk0.hasNext()) {
            znq znq0 = (znq)ggqk0.next();
            ibuq.c(znq0);
            zvz.b(znq0, ((goz)object1));
        }
        return ibom.a;
    }
}

