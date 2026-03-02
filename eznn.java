public final class eznn implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfqj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hfqj)hftv0).b |= 1;
        ((hfqj)hftv0).c = 10;
        int v = ((hfem)object0).c ? 3 : 4;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfqj)hftp0.b_message).e = v - 1;
        ((hfqj)hftp0.b_message).b |= 4;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfqg.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((hfqg)hftv1).b |= 1;
        ((hfqg)hftv1).c = true;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        hfqg hfqg0 = (hfqg)hftp1.b_message;
        hfqg0.b |= 4;
        hfqg0.e = true;
        hfqg hfqg1 = (hfqg)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        hfqg1.getClass();
        ((hfqj)hftv2).f = hfqg1;
        ((hfqj)hftv2).b |= 8;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfqj)hftp0.b_message).d = 1;
        ((hfqj)hftp0.b_message).b |= 2;
        return new eznq(((hfqj)hftp0.N_build()));
    }
}

