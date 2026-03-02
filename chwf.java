public final class chwf implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        btai btai0 = (btai)((ProtoLiteBuilder)object0).b_message;
        bszs bszs0 = btai0.c == 9 ? ((bszs)btai0.d) : bszs.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bszs0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)bszs0));
        if(!((bszq)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((bszq)hftp0))).ensureMutable();
        }
        bszs bszs1 = (bszs)((bszq)hftp0).b_message;
        ((bszr)object1).getClass();
        bszs1.b();
        bszs1.b.add(((bszr)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        btai btai1 = (btai)((ProtoLiteBuilder)object0).b_message;
        bszs bszs2 = (bszs)((ProtoLiteBuilder)(((bszq)hftp0))).N_build();
        bszs2.getClass();
        btai1.d = bszs2;
        btai1.c = 9;
    }
}

