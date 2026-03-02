import j..util.Objects;

final class ziv implements gmbg {
    final zix a;

    public ziv(zix zix0) {
        Objects.requireNonNull(zix0);
        this.a = zix0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        zix.a.g("Exception while resolving future in OwnerRepositoryImpl - %s", throwable0, new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        int v = ((gged_interceptors)object0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            foec foec0 = (foec)((gged_interceptors)object0).get(v1);
            zix zix0 = this.a;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aatb.a).v_newBuilder();
            String s = foec0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aatb aatb0 = (aatb)hftp0.b_message;
            s.getClass();
            aatb0.b = s;
            zix0.b(((aatb)hftp0.N_build()));
        }
    }
}

