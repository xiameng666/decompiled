public final class cdvp implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        ghuk ghuk0 = ((ghur)((ProtoLiteBuilder)object0).b_message).d;
        if(ghuk0 == null) {
            ghuk0 = ghuk.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ghuk0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)ghuk0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghuk ghuk1 = (ghuk)hftp0.b_message;
        ghuk1.c = ((ghuj)object1).h;
        ghuk1.b |= 1;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ghur ghur0 = (ghur)((ProtoLiteBuilder)object0).b_message;
        ghuk ghuk2 = (ghuk)hftp0.N_build();
        ghuk2.getClass();
        ghur0.d = ghuk2;
        ghur0.b |= 2;
    }
}

