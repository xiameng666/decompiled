public final class fkqi {
    public final fkqb a;
    public final fkpq b;
    public final gful_cronetEngineProvider c;
    private final gfsx d;
    private final gfsx e;
    private final boolean f;

    public fkqi(fkqb fkqb0, fiyn fiyn0, fkpq fkpq0, gful_cronetEngineProvider gful0) {
        this.a = fkqb0;
        this.d = gfsx.m(fiyn0);
        this.e = gfqx.a;
        this.b = fkpq0;
        this.c = gful0;
        this.f = false;
    }

    public fkqi(fkqb fkqb0, gmcd gmcd0, fkpq fkpq0, gful_cronetEngineProvider gful0) {
        this.a = fkqb0;
        this.d = gfqx.a;
        this.e = gfsx.m(gmcd0);
        this.b = fkpq0;
        this.c = gful0;
        this.f = true;
    }

    public final fkpn a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fkpn.a).v_newBuilder();
        fkqb fkqb0 = this.a;
        String s = fkqb0.d;
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fkpn fkpn0 = (fkpn)hftp0.b_message;
            fkpn0.b |= 16;
            fkpn0.f = s;
        }
        String s1 = fkqb0.c;
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fkpn fkpn1 = (fkpn)hftp0.b_message;
            fkpn1.b |= 8;
            fkpn1.e = s1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((fkpn)hftv0).b |= 2;
        ((fkpn)hftv0).c = 2;
        String s2 = fkqb0.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpn fkpn2 = (fkpn)hftp0.b_message;
        fkpn2.b |= 4;
        fkpn2.d = s2;
        return (fkpn)hftp0.N_build();
    }

    public final void b() {
        if(!this.f) {
            fkpq fkpq0 = this.b;
            glnv glnv0 = ((fiyn)this.d.d()).a(fkqi.c(this.a, fkpq0));
            if(glnv0 == null) {
                return;
            }
            fkpz fkpz0 = (fkpz)this.c.mr();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fkpo.a).v_newBuilder();
            int v = (int)glnv0.e;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fkpo fkpo0 = (fkpo)hftp0.b_message;
            fkpo0.b |= 1;
            fkpo0.e = v;
            fkpn fkpn0 = this.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fkpo fkpo1 = (fkpo)hftp0.b_message;
            fkpn0.getClass();
            fkpo1.f = fkpn0;
            fkpo1.b |= 2;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fkpp.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((fkpp)hftp1.b_message).c = glnv0;
            ((fkpp)hftp1.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fkpo fkpo2 = (fkpo)hftp0.b_message;
            fkpp fkpp0 = (fkpp)hftp1.N_build();
            fkpp0.getClass();
            fkpo2.d = fkpp0;
            fkpo2.c = 4;
            fkpz0.a(fkpq0, ((fkpo)hftp0.N_build()));
            return;
        }
        glzd.f(((gmcd)this.e.d()), new fkqh(this), gmap.a);
    }

    public static final String c(fkqb fkqb0, fkpq fkpq0) {
        return fkqb0.a + "#" + fkqb0.c + "#" + fkqb0.b + "#" + fkqb0.d + ":" + fkpq0.y;
    }
}

