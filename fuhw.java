final class fuhw implements ibtx {
    final ibtw a;
    final fuhy b;

    public fuhw(ibtw ibtw0, fuhy fuhy0) {
        this.a = ibtw0;
        this.b = fuhy0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$ElevatedButton");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ibtw ibtw0 = this.a;
        if(ibtw0 != null) {
            ((goz)object1).M(0xAA8E125F);
            ibtw0.a(((goz)object1), Integer.valueOf(0));
            ((goz)object1).A();
            return ibom.a;
        }
        ((goz)object1).M(-1433481060);
        fuhx.c(this.b, ((goz)object1));
        ((goz)object1).A();
        return ibom.a;
    }
}

