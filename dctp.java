final class dctp implements icih {
    final dctq a;
    final String b;
    final hjjt c;

    public dctp(dctq dctq0, String s, hjjt hjjt0) {
        this.a = dctq0;
        this.b = s;
        this.c = hjjt0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        return this.b(((dctx)object0), ibrl0);
    }

    public final Object b(dctx dctx0, ibrl ibrl0) {
        dcto dcto0;
        if((ibrl0 instanceof dcto)) {
            dcto0 = (dcto)ibrl0;
            int v = dcto0.d;
            if((v & 0x80000000) == 0) {
                dcto0 = new dcto(this, ibrl0);
            }
            else {
                dcto0.d = v - 0x80000000;
            }
        }
        else {
            dcto0 = new dcto(this, ibrl0);
        }
        Object object0 = dcto0.b;
        Object object1 = ibrx.a;
        switch(dcto0.d) {
            case 0: {
                ibnx.b(object0);
                dcto0.a = dctx0;
                dcto0.d = 1;
                if(this.a.d.a(dctx0, dcto0) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                dctx0 = dcto0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(dctx0.c()) {
            dcvz.a.b().h("File[%s]: Completed, cancelling transfer", this.b);
            this.c.e();
        }
        return ibom.a;
    }
}

