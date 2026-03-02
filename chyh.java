public final class chyh implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gzkh gzkh0 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gzhw gzhw0 = gzkh0.b == 14 ? ((gzhw)gzkh0.c) : gzhw.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gzhw0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gzhw0));
        ((gzhu)hftp0).a(((gzhv)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzkh gzkh1 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gzhw gzhw1 = (gzhw)((ProtoLiteBuilder)(((gzhu)hftp0))).N_build();
        gzhw1.getClass();
        gzkh1.c = gzhw1;
        gzkh1.b = 14;
    }
}

