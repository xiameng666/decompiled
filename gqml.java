public final class gqml implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        hhyg hhyg0 = (hhyg)((ProtoLiteMessage)hhyh.a).v_newBuilder();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhyf.a).v_newBuilder();
        String s = ((gqlo)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhyf hhyf0 = (hhyf)hftp0.b_message;
        hhyf0.b |= 1;
        hhyf0.c = s;
        hhyd hhyd0 = gqlz.b(((gqlo)object0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhyf hhyf1 = (hhyf)hftp0.b_message;
        hhyd0.getClass();
        hhyf1.d = hhyd0;
        hhyf1.b |= 2;
        if(!hhyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hhyg0).ensureMutable();
        }
        hhyh hhyh0 = (hhyh)hhyg0.b_message;
        hhyf hhyf2 = (hhyf)hftp0.N_build();
        hhyf2.getClass();
        hhyh0.b();
        hhyh0.c.add(hhyf2);
        return (hhyh)((ProtoLiteBuilder)hhyg0).N_build();
    }
}

