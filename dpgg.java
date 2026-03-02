public final class dpgg implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjyp.a).v_newBuilder();
        int v = ((ftcw)object0).b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hjyp)hftv0).b |= 1;
        ((hjyp)hftv0).c = v;
        String s = ((ftcw)object0).c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hjyp hjyp0 = (hjyp)hftp0.b_message;
        s.getClass();
        hjyp0.b |= 2;
        hjyp0.d = s;
        return (hjyp)hftp0.N_build();
    }
}

