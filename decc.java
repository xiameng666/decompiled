final class decc implements ibtx {
    final decl a;
    final ibts b;

    public decc(decl decl0, ibts ibts0) {
        this.a = decl0;
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
        decl decl0 = this.a;
        ((goz)object1).M(5004770);
        ibts ibts0 = this.b;
        boolean z = ((goz)object1).X(ibts0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new decb(ibts0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        deck.f(decl0.a, ((ibts)object3), ((goz)object1), 0);
        return ibom.a;
    }
}

