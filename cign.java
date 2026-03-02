public final class cign implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        gzkh gzkh0 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gziv gziv0 = gzkh0.b == 25 ? ((gziv)gzkh0.c) : gziv.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gziv0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gziv0));
        if(!((gzit)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gzit)hftp0))).ensureMutable();
        }
        gziv gziv1 = (gziv)((gzit)hftp0).b_message;
        ((gziu)object1).getClass();
        gziv1.b();
        gziv1.b.add(((gziu)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gzkh gzkh1 = (gzkh)((ProtoLiteBuilder)object0).b_message;
        gziv gziv2 = (gziv)((ProtoLiteBuilder)(((gzit)hftp0))).N_build();
        gziv2.getClass();
        gzkh1.c = gziv2;
        gzkh1.b = 25;
    }
}

