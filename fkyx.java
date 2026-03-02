public final class fkyx {
    private final gful_cronetEngineProvider a;
    private final fiyl b;
    private final fkqb c;

    public fkyx(gful_cronetEngineProvider gful0, fiyl fiyl0, fkqb fkqb0) {
        this.a = gfus.a(gful0);
        this.b = fiyl0;
        this.c = fkqb0;
    }

    public final void a(fkpq fkpq0, boolean z) {
        if(!this.b.a(0L)) {
            return;
        }
        fkpz fkpz0 = (fkpz)this.a.mr();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fkpo.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo0 = (fkpo)hftp0.b_message;
        fkpo0.b |= 1;
        fkpo0.e = 0;
        fkpn fkpn0 = this.f();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo1 = (fkpo)hftp0.b_message;
        fkpn0.getClass();
        fkpo1.f = fkpn0;
        fkpo1.b |= 2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fkps.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fkps fkps0 = (fkps)hftp1.b_message;
        fkps0.b |= 1;
        fkps0.c = z;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo2 = (fkpo)hftp0.b_message;
        fkps fkps1 = (fkps)hftp1.N_build();
        fkps1.getClass();
        fkpo2.d = fkps1;
        fkpo2.c = 1;
        fkpz0.a(fkpq0, ((fkpo)hftp0.N_build()));
    }

    public final void b(boolean z) {
        this.a(fkpq.b, z);
    }

    public final void c(boolean z) {
        this.a(fkpq.d, z);
    }

    public final void d(boolean z) {
        this.a(fkpq.g, z);
    }

    public final void e(fkpq fkpq0, boolean z) {
        if(!this.b.a(0L)) {
            return;
        }
        fkpz fkpz0 = (fkpz)this.a.mr();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fkpo.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo0 = (fkpo)hftp0.b_message;
        fkpo0.b |= 1;
        fkpo0.e = 0;
        fkpn fkpn0 = this.f();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo1 = (fkpo)hftp0.b_message;
        fkpn0.getClass();
        fkpo1.f = fkpn0;
        fkpo1.b |= 2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fkps.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((fkps)hftv0).b |= 1;
        ((fkps)hftv0).c = true;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        fkps fkps0 = (fkps)hftp1.b_message;
        fkps0.b |= 2;
        fkps0.d = z;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo2 = (fkpo)hftp0.b_message;
        fkps fkps1 = (fkps)hftp1.N_build();
        fkps1.getClass();
        fkpo2.d = fkps1;
        fkpo2.c = 1;
        fkpz0.a(fkpq0, ((fkpo)hftp0.N_build()));
    }

    private final fkpn f() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fkpn.a).v_newBuilder();
        fkqb fkqb0 = this.c;
        String s = fkqb0.d;
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fkpn fkpn0 = (fkpn)hftp0.b_message;
            fkpn0.b |= 16;
            fkpn0.f = s;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((fkpn)hftv0).b |= 2;
        ((fkpn)hftv0).c = 1;
        String s1 = fkqb0.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpn fkpn1 = (fkpn)hftp0.b_message;
        fkpn1.b |= 4;
        fkpn1.d = s1;
        return (fkpn)hftp0.N_build();
    }
}

