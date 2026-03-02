public final class cdvf implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        ghun ghun0 = ((ghur)((ProtoLiteBuilder)object0).b_message).f;
        if(ghun0 == null) {
            ghun0 = ghun.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ghun0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)ghun0));
        boolean z = ((Boolean)object1).booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghun ghun1 = (ghun)hftp0.b_message;
        ghun1.b |= 2;
        ghun1.d = z;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ghur ghur0 = (ghur)((ProtoLiteBuilder)object0).b_message;
        ghun ghun2 = (ghun)hftp0.N_build();
        ghun2.getClass();
        ghur0.f = ghun2;
        ghur0.b |= 8;
    }
}

