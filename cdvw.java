public final class cdvw implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        ghuq ghuq0 = ((ghur)((ProtoLiteBuilder)object0).b_message).e;
        if(ghuq0 == null) {
            ghuq0 = ghuq.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ghuq0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)ghuq0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghuq ghuq1 = (ghuq)hftp0.b_message;
        ghuq1.c = ((ghup)object1).e;
        ghuq1.b |= 1;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ghur ghur0 = (ghur)((ProtoLiteBuilder)object0).b_message;
        ghuq ghuq2 = (ghuq)hftp0.N_build();
        ghuq2.getClass();
        ghur0.e = ghuq2;
        ghur0.b |= 4;
    }
}

