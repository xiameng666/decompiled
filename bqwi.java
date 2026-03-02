public final class bqwi implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        hlje hlje0 = (hlje)((ProtoLiteMessage)hljf.a).v_newBuilder();
        hldp hldp0 = hldp.a;
        hldm hldm0 = (hldm)((ProtoLiteMessage)hldp0).v_newBuilder();
        hldp hldp1 = ((hljf)object0).f;
        if(hldp1 == null) {
            hldp1 = hldp0;
        }
        String s = hldp1.c;
        if(!hldm0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hldm0).ensureMutable();
        }
        hldp hldp2 = (hldp)hldm0.b_message;
        s.getClass();
        hldp2.b |= 1;
        hldp2.c = s;
        if(!hlje0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlje0).ensureMutable();
        }
        hljf hljf0 = (hljf)hlje0.b_message;
        hldp hldp3 = (hldp)((ProtoLiteBuilder)hldm0).N_build();
        hldp3.getClass();
        hljf0.f = hldp3;
        hljf0.b |= 4;
        long v = ((hljf)object0).c;
        if(!hlje0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlje0).ensureMutable();
        }
        hljf hljf1 = (hljf)hlje0.b_message;
        hljf1.b |= 1;
        hljf1.c = v;
        long v1 = ((hljf)object0).d;
        if(!hlje0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlje0).ensureMutable();
        }
        hljf hljf2 = (hljf)hlje0.b_message;
        hljf2.b |= 2;
        hljf2.d = v1;
        hlje0.a(((hljf)object0).e);
        hldm hldm1 = (hldm)((ProtoLiteMessage)hldp0).v_newBuilder();
        hldp hldp4 = ((hljf)object0).g;
        if(hldp4 != null) {
            hldp0 = hldp4;
        }
        String s1 = hldp0.c;
        if(!hldm1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hldm1).ensureMutable();
        }
        hldp hldp5 = (hldp)hldm1.b_message;
        s1.getClass();
        hldp5.b |= 1;
        hldp5.c = s1;
        if(!hlje0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlje0).ensureMutable();
        }
        hljf hljf3 = (hljf)hlje0.b_message;
        hldp hldp6 = (hldp)((ProtoLiteBuilder)hldm1).N_build();
        hldp6.getClass();
        hljf3.g = hldp6;
        hljf3.b |= 8;
        return ((ProtoLiteBuilder)hlje0).N_build();
    }
}

