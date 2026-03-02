public final class aloh implements gfsi {
    public final boolean a;

    public aloh(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((alua)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((alua)object0))));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)altc.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((altc)hftp1.b_message).b = this.a;
        altc altc0 = (altc)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        alua alua0 = (alua)hftp0.b_message;
        altc0.getClass();
        alua0.c = altc0;
        alua0.b |= 1;
        return (alua)hftp0.N_build();
    }
}

