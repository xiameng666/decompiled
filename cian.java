public final class cian implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gzkh gzkh0 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gzhz gzhz0 = gzkh0.b == 23 ? ((gzhz)gzkh0.c) : gzhz.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gzhz0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gzhz0));
        ((gzhx)hftp0).a(((gzhy)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzkh gzkh1 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gzhz gzhz1 = (gzhz)((ProtoLiteBuilder)(((gzhx)hftp0))).N_build();
        gzhz1.getClass();
        gzkh1.c = gzhz1;
        gzkh1.b = 23;
    }
}

