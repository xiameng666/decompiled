final class bupu extends ibsl implements ibtw {
    int a;
    final bupw b;
    private Object c;

    public bupu(bupw bupw0, ibrl ibrl0) {
        this.b = bupw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bupu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bupu(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            icck icck0 = (icck)this.c;
            try {
                hivy hivy0 = hivz.a(((ProtoLiteMessage)hivy.a).v_newBuilder()).a();
                this.a = 1;
                hixg hixg0 = bure.a(bure.b(((hixg)this.b.j.b.a().q(cmlp.a, ckhp.b))), this.b.j.a);
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hivy0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)hivy0));
                hiwa hiwa0 = hivz.a(hftp0);
                hiwm hiwm0 = busb.a;
                ibuq.f(hiwm0, "value");
                ProtoLiteBuilder hftp1 = hiwa0.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hivy hivy1 = (hivy)hftp1.b_message;
                hiwm0.getClass();
                hivy1.c = hiwm0;
                hivy1.b |= 1;
                object0 = hixg0.g(hiwa0.a(), new iaof_metadata(), this);
                return object0 == object1 ? object1 : new ibnw(((hiwb)object0));
            }
            catch(Throwable throwable0) {
                return new ibnw(ibnx.a(throwable0));
            }
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(Throwable throwable0) {
                return new ibnw(ibnx.a(throwable0));
            }
        }
        return new ibnw(((hiwb)object0));
    }
}

