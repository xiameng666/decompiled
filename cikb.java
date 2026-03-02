public final class cikb implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        hadz hadz0 = ((hadp)((ProtoLiteBuilder)object0).b_message).d;
        if(hadz0 == null) {
            hadz0 = hadz.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hadz0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hadz0));
        boolean z = ((Boolean)object1).booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hadz hadz1 = (hadz)hftp0.b_message;
        hadz1.b |= 2;
        hadz1.d = z;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        hadp hadp0 = (hadp)((ProtoLiteBuilder)object0).b_message;
        hadz hadz2 = (hadz)hftp0.N_build();
        hadz2.getClass();
        hadp0.d = hadz2;
        hadp0.b |= 2;
    }
}

