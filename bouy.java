public final class bouy implements gfsi {
    public final bovs a;
    public final gszv b;

    public bouy(bovs bovs0, gszv gszv0) {
        this.a = bovs0;
        this.b = gszv0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hfug hfug0 = fqzv.a;
        hfuh hfuh0 = new hfuh(((fqzv)object0).d, hfug0);
        gszv gszv0 = this.b;
        if(hfuh0.contains(gszv0)) {
            return (fqzv)object0;
        }
        boolean z = fqso.e(gszv0);
        boolean z1 = bovs.j(new hfuh(((fqzv)object0).d, hfug0));
        boolean z2 = false;
        boolean z3 = fqso.a(gszv0) || z1;
        if(!z && z3 && !z1) {
            z2 = true;
        }
        boolean z4 = fray.b(z2, new bove());
        this.a.i(z3, z4, true);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzv)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fqzv)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqzv fqzv0 = (fqzv)hftp0.b_message;
        gszv0.getClass();
        fqzv0.b();
        fqzv0.d.i(gszv0.a());
        return (fqzv)hftp0.N_build();
    }
}

