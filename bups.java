final class bups extends ibsl implements ibtw {
    int a;
    final bupw b;
    private Object c;

    public bups(bupw bupw0, ibrl ibrl0) {
        this.b = bupw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bups)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bups(this.b, ibrl0);
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
                buri buri0 = this.b.h;
                hivo hivo0 = hivn.a(((ProtoLiteMessage)hivm.a).v_newBuilder());
                ProtoLiteBuilder hftp0 = hivo0.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hivm)hftp0.b_message).d = true;
                hivm hivm0 = hivo0.a();
                this.a = 1;
                hixg hixg0 = bure.a(bure.b(((hixg)buri0.b.a().q(cmlp.a, ckhm.b))), buri0.a);
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hivm0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)hivm0));
                hivo hivo1 = hivn.a(hftp1);
                hiwm hiwm0 = busb.a;
                ibuq.f(hiwm0, "value");
                ProtoLiteBuilder hftp2 = hivo1.a;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hivm hivm1 = (hivm)hftp2.b_message;
                hiwm0.getClass();
                hivm1.c = hiwm0;
                hivm1.b |= 1;
                object0 = hixg0.e(hivo1.a(), new iaof_metadata(), this);
                return object0 == object1 ? object1 : new ibnw(((hivr)object0));
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
        return new ibnw(((hivr)object0));
    }
}

