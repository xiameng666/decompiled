public final class chvs implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        btai btai0 = (btai)((ProtoLiteBuilder)object0).b_message;
        bszf bszf0 = btai0.c == 11 ? ((bszf)btai0.d) : bszf.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bszf0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)bszf0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bszf bszf1 = (bszf)hftp0.b_message;
        ((bszd)object1).getClass();
        bszf1.b();
        bszf1.b.add(((bszd)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        btai btai1 = (btai)((ProtoLiteBuilder)object0).b_message;
        bszf bszf2 = (bszf)hftp0.N_build();
        bszf2.getClass();
        btai1.d = bszf2;
        btai1.c = 11;
    }
}

