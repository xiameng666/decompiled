public final class cibq implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gzkh gzkh0 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gzic gzic0 = gzkh0.b == 18 ? ((gzic)gzkh0.c) : gzic.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gzic0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gzic0));
        ((gzia)hftp0).a(((gzib)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzkh gzkh1 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gzic gzic1 = (gzic)((ProtoLiteBuilder)(((gzia)hftp0))).N_build();
        gzic1.getClass();
        gzkh1.c = gzic1;
        gzkh1.b = 18;
    }
}

