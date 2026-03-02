public final class cdvi implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        ghok ghok0 = ((ghon)((ProtoLiteBuilder)object0).b_message).af;
        if(ghok0 == null) {
            ghok0 = ghok.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ghok0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)ghok0));
        ((ghoj)hftp0).k(((ghur)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ghon ghon0 = (ghon)((ProtoLiteBuilder)object0).b_message;
        ghok ghok1 = (ghok)((ProtoLiteBuilder)(((ghoj)hftp0))).N_build();
        ghok1.getClass();
        ghon0.af = ghok1;
        ghon0.d |= 1;
    }
}

