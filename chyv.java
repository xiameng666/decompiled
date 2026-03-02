public final class chyv implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gzkh gzkh0 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gzht gzht0 = gzkh0.b == 20 ? ((gzht)gzkh0.c) : gzht.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gzht0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gzht0));
        ((gzhs)hftp0).a(((gzhr)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzkh gzkh1 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gzht gzht1 = (gzht)((ProtoLiteBuilder)(((gzhs)hftp0))).N_build();
        gzht1.getClass();
        gzkh1.c = gzht1;
        gzkh1.b = 20;
    }
}

