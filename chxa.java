public final class chxa implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        btai btai0 = (btai)((ProtoLiteBuilder)object0).b_message;
        btao btao0 = btai0.c == 10 ? ((btao)btai0.d) : btao.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)btao0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)btao0));
        if(!((btam)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((btam)hftp0))).ensureMutable();
        }
        btao btao1 = (btao)((btam)hftp0).b_message;
        ((btan)object1).getClass();
        btao1.b();
        btao1.b.add(((btan)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        btai btai1 = (btai)((ProtoLiteBuilder)object0).b_message;
        btao btao2 = (btao)((ProtoLiteBuilder)(((btam)hftp0))).N_build();
        btao2.getClass();
        btai1.d = btao2;
        btai1.c = 10;
    }
}

