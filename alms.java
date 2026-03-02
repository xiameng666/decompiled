public final class alms implements gfsi {
    public final alua a;

    public alms(alua alua0) {
        this.a = alua0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)this.a).jf(5, null);
        hftp0.X(((ProtoLiteMessage)this.a));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        alua alua0 = (alua)hftp0.b_message;
        ((altc)object0).getClass();
        alua0.c = (altc)object0;
        alua0.b |= 1;
        return (alua)hftp0.N_build();
    }
}

