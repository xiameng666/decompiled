public final class aloa implements gfsi {
    public final String a;

    public aloa(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((alua)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((alua)object0))));
        String s = this.a;
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            alua alua0 = (alua)hftp0.b_message;
            alua0.b |= 4;
            alua0.f = s;
            return (alua)hftp0.N_build();
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        alua alua1 = (alua)hftp0.b_message;
        alua1.b &= -5;
        alua1.f = alua.a.f;
        return (alua)hftp0.N_build();
    }
}

