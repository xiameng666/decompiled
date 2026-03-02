public final class dmgm {
    private final chjo a;
    private final String b;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public dmgm(String s) {
        this.a = chjo.v();
        this.b = s;
    }

    public final void a(ProtoLiteBuilder hftp0) {
        String s = this.b;
        if(dmgv.f(s)) {
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
        else if(dmgv.e(s)) {
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
            this.a.j(((ProtoLiteMessage)hapr3));
        }
    }
}

