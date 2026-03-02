public final class cicd implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gzkh gzkh0 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gzif gzif0 = gzkh0.b == 12 ? ((gzif)gzkh0.c) : gzif.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gzif0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gzif0));
        ((gzid)hftp0).a(((gzie)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzkh gzkh1 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gzif gzif1 = (gzif)((ProtoLiteBuilder)(((gzid)hftp0))).N_build();
        gzif1.getClass();
        gzkh1.c = gzif1;
        gzkh1.b = 12;
    }
}

