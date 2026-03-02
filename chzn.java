public final class chzn implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gzkh gzkh0 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gzip gzip0 = gzkh0.b == 15 ? ((gzip)gzkh0.c) : gzip.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gzip0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gzip0));
        ((gzil)hftp0).a(((gzio)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzkh gzkh1 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gzip gzip1 = (gzip)((ProtoLiteBuilder)(((gzil)hftp0))).N_build();
        gzip1.getClass();
        gzkh1.c = gzip1;
        gzkh1.b = 15;
    }
}

