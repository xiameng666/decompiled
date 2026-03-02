public final class cikh implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        haeb haeb0 = ((gjpw)((ProtoLiteBuilder)object0).b_message).e;
        if(haeb0 == null) {
            haeb0 = haeb.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)haeb0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)haeb0));
        ((hado)hftp0).a(((hadp)object1));
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gjpw gjpw0 = (gjpw)((ProtoLiteBuilder)object0).b_message;
        haeb haeb1 = (haeb)((ProtoLiteBuilder)(((hado)hftp0))).N_build();
        haeb1.getClass();
        gjpw0.e = haeb1;
        gjpw0.b |= 4;
    }
}

