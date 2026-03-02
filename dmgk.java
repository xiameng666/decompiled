public final class dmgk {
    private final chji a;
    private final chjl b;
    private final String c;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public dmgk(String s) {
        this.a = chji.v();
        this.b = chjl.v();
        this.c = s;
    }

    @Deprecated
    public final void a(hagz hagz0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hagz0.getClass();
        hapr0.aE = hagz0;
        hapr0.d |= 0x4000000;
        this.b(((hapr)hftp0.N_build()), null);
    }

    @Deprecated
    public final void b(hapr hapr0, String s) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hapr0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hapr0));
        this.d(hftp0, s);
    }

    public final void c(ProtoLiteBuilder hftp0) {
        this.d(hftp0, null);
    }

    public final void d(ProtoLiteBuilder hftp0, String s) {
        cczb cczb0;
        String s1 = this.c;
        if(dmgv.f(s1)) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hafi.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hafi)hftp1.b_message).c = 2;
            ((hafi)hftp1.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hapr hapr0 = (hapr)hftp0.b_message;
            hafi hafi0 = (hafi)hftp1.N_build();
            hafi0.getClass();
            hapr0.bo = hafi0;
            hapr0.f |= 0x2000;
        }
        else if(dmgv.e(s1)) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hafi.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hafi)hftp2.b_message).c = 1;
            ((hafi)hftp2.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hapr hapr1 = (hapr)hftp0.b_message;
            hafi hafi1 = (hafi)hftp2.N_build();
            hafi1.getClass();
            hapr1.bo = hafi1;
            hapr1.f |= 0x2000;
        }
        else {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hafi.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((hafi)hftp3.b_message).c = 3;
            ((hafi)hftp3.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hapr hapr2 = (hapr)hftp0.b_message;
            hafi hafi2 = (hafi)hftp3.N_build();
            hafi2.getClass();
            hapr2.bo = hafi2;
            hapr2.f |= 0x2000;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hapr)hftp0.b_message).at = 8;
        hapr hapr3 = (hapr)hftp0.N_build();
        if(!bbmq.P()) {
            if(s == null) {
                cczb0 = this.b.c(((ProtoLiteMessage)hapr3));
            }
            else {
                cczb0 = this.a.c(((ProtoLiteMessage)hapr3));
                cczb0.b = s;
            }
            cczb0.a();
        }
    }
}

