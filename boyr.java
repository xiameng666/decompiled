public final class boyr implements gfsi {
    public final haea a;
    public final fqzl b;

    public boyr(haea haea0, fqzl fqzl0) {
        this.a = haea0;
        this.b = fqzl0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hadz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqzl fqzl0 = this.b;
        hadz hadz0 = (hadz)hftp0.b_message;
        hadz0.c = this.a.a();
        hadz0.b |= 1;
        boolean z = bouv.j(fqzl0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hadz)hftv0).b |= 2;
        ((hadz)hftv0).d = z;
        gtas gtas0 = gtas.b(fqzl0.g) == null ? gtas.a : gtas.b(fqzl0.g);
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hadz hadz1 = (hadz)hftp0.b_message;
        hadz1.e = gtas0.a();
        hadz1.b |= 4;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        hadp hadp0 = (hadp)((ProtoLiteBuilder)object0).b_message;
        hadz hadz2 = (hadz)hftp0.N_build();
        hadz2.getClass();
        hadp0.d = hadz2;
        hadp0.b |= 2;
        return (ProtoLiteBuilder)object0;
    }
}

