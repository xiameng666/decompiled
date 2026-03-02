public final class cije implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        hady hady0 = ((hadp)((ProtoLiteBuilder)object0).b_message).e;
        if(hady0 == null) {
            hady0 = hady.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hady0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hady0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hady hady1 = (hady)hftp0.b_message;
        hady1.c = ((hadx)object1).a();
        hady1.b |= 1;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        hadp hadp0 = (hadp)((ProtoLiteBuilder)object0).b_message;
        hady hady2 = (hady)hftp0.N_build();
        hady2.getClass();
        hadp0.e = hady2;
        hadp0.b |= 4;
    }
}

