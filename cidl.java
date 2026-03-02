public final class cidl implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gzkh gzkh0 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gzik gzik0 = gzkh0.b == 17 ? ((gzik)gzkh0.c) : gzik.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gzik0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gzik0));
        ((gzig)hftp0).a(((gzij)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzkh gzkh1 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gzik gzik1 = (gzik)((ProtoLiteBuilder)(((gzig)hftp0))).N_build();
        gzik1.getClass();
        gzkh1.c = gzik1;
        gzkh1.b = 17;
    }
}

