public final class aloc implements gfsi {
    public final boolean a;

    public aloc(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((alua)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((alua)object0))));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aluq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((aluq)hftp1.b_message).b = this.a;
        aluq aluq0 = (aluq)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        alua alua0 = (alua)hftp0.b_message;
        aluq0.getClass();
        alua0.e = aluq0;
        alua0.b |= 2;
        return (alua)hftp0.N_build();
    }
}

