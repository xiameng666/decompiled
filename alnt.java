public final class alnt implements gfsi {
    public final boolean a;

    public alnt(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((alua)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((alua)object0))));
        alum alum0 = this.a ? alum.b : alum.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        alua alua0 = (alua)hftp0.b_message;
        alua0.d = alum0.a();
        return (alua)hftp0.N_build();
    }
}

