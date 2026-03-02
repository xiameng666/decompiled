public final class brpl implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hljf)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((hljf)object0))));
        if(!((hlje)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((hlje)hftp0))).ensureMutable();
        }
        ((hljf)((hlje)hftp0).b_message).f = null;
        ((hljf)((hlje)hftp0).b_message).b &= -5;
        if(!((hlje)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((hlje)hftp0))).ensureMutable();
        }
        ((hljf)((hlje)hftp0).b_message).g = null;
        ((hljf)((hlje)hftp0).b_message).b &= -9;
        if((((hljf)object0).b & 8) != 0) {
            hldp hldp0 = ((hljf)object0).g;
            if(hldp0 == null) {
                hldp0 = hldp.a;
            }
            hldp hldp1 = bqwb.c(hldp0.c);
            if(!((hlje)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((hlje)hftp0))).ensureMutable();
            }
            hljf hljf0 = (hljf)((hlje)hftp0).b_message;
            hldp1.getClass();
            hljf0.g = hldp1;
            hljf0.b |= 8;
        }
        return ((hljf)((ProtoLiteBuilder)(((hlje)hftp0))).N_build()).getDefaultInstanceForType();
    }
}

