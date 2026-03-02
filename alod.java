public final class alod implements gfsi {
    public final boolean a;

    public alod(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((alua)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((alua)object0))));
        aldk aldk0 = this.a ? aldk.c : aldk.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        alua alua0 = (alua)hftp0.b_message;
        alua0.g = aldk0.a();
        alua0.b |= 8;
        return (alua)hftp0.N_build();
    }
}

