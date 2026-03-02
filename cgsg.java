public final class cgsg implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gkvy gkvy0 = ((gkvw)((ProtoLiteBuilder)object0).b_message).D;
        if(gkvy0 == null) {
            gkvy0 = gkvy.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gkvy0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gkvy0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkvy gkvy1 = (gkvy)hftp0.b_message;
        ((ByteString)object1).getClass();
        gkvy1.b |= 1;
        gkvy1.c = (ByteString)object1;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkvw gkvw0 = (gkvw)((ProtoLiteBuilder)object0).b_message;
        gkvy gkvy2 = (gkvy)hftp0.N_build();
        gkvy2.getClass();
        gkvw0.D = gkvy2;
        gkvw0.b |= 0x8000000;
    }
}

