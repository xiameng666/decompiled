public final class ciik implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        hadv hadv0 = ((hadp)((ProtoLiteBuilder)object0).b_message).f;
        if(hadv0 == null) {
            hadv0 = hadv.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hadv0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hadv0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hadv hadv1 = (hadv)hftp0.b_message;
        hadv1.d = ((hadw)object1).a();
        hadv1.b |= 2;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        hadp hadp0 = (hadp)((ProtoLiteBuilder)object0).b_message;
        hadv hadv2 = (hadv)hftp0.N_build();
        hadv2.getClass();
        hadp0.f = hadv2;
        hadp0.b |= 8;
    }
}

