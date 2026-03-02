import j..util.Collection.-EL;

final class ctmd implements icih {
    final ctmk a;

    public ctmd(ctmk ctmk0) {
        this.a = ctmk0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if((((ctpc)object0) instanceof ctpa)) {
            ((ggtj)this.a.b.h()).x("Discovery started successfully");
            return ibom.a;
        }
        if((((ctpc)object0) instanceof ctpb)) {
            ((ggtj)this.a.b.h()).x("Discovery stopped");
            return ibom.a;
        }
        if((((ctpc)object0) instanceof ctoy)) {
            ((ggtj)this.a.b.h()).B("Device found %s", ((ctoy)(((ctpc)object0))).a.f());
            ctmn ctmn0 = new ctmn(((ctpc)object0), this.a);
            this.a.d.add(ctmn0);
            ctnf.a(this.a.e, new ctlo(this.a));
            ctmn0.f();
            return ibom.a;
        }
        if(!(((ctpc)object0) instanceof ctoz)) {
            throw new ibnq();
        }
        ((ggtj)this.a.b.h()).B("Device lost %s", ((ctoz)(((ctpc)object0))).a.f());
        ctlq ctlq0 = new ctlq(new ctlp(((ctpc)object0)));
        Collection.-EL.removeIf(this.a.d, ctlq0);
        ctnf.a(this.a.e, new ctlr(this.a));
        return ibom.a;
    }
}

