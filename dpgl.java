public final class dpgl implements bboe {
    public final bboe a;

    public dpgl(bboe bboe0) {
        this.a = bboe0;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        dpft dpft0 = ((dpeb)((dpdv)object0).b_message).p;
        if(dpft0 == null) {
            dpft0 = dpft.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dpft0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)dpft0));
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)this.a.a(hftp0);
        if(!((dpdv)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((dpdv)object0))).ensureMutable();
        }
        dpeb dpeb0 = (dpeb)((dpdv)object0).b_message;
        dpft dpft1 = (dpft)hftp1.N_build();
        dpft1.getClass();
        dpeb0.p = dpft1;
        dpeb0.c |= 1;
        return (dpdv)object0;
    }
}

