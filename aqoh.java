import j..util.Objects;

final class aqoh extends aqpr {
    final hisv a;

    public aqoh(aqok aqok0, hisv hisv0) {
        this.a = hisv0;
        Objects.requireNonNull(aqok0);
        super();
    }

    @Override  // aqpr
    protected final clcf a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arxo.a).v_newBuilder();
        hisv hisv0 = this.a;
        String s = hisv0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arxo arxo0 = (arxo)hftp0.b_message;
        s.getClass();
        arxo0.b |= 1;
        arxo0.c = s;
        arxo arxo1 = (arxo)hftp0.N_build();
        clbc clbc0 = new clbc(null);
        clbc0.c(hqje.l());
        clbc0.d(((MessageLite)arxo1), ckav.e, arxp.a);
        clbd clbd0 = new clbd(clbc0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)arxm.a).v_newBuilder();
        String s1 = hisv0.g;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arxm arxm0 = (arxm)hftp1.b_message;
        s1.getClass();
        hfuo hfuo0 = arxm0.b;
        if(!hfuo0.c()) {
            arxm0.b = ProtoLiteMessage.E(hfuo0);
        }
        arxm0.b.add(s1);
        String s2 = String.valueOf(hisv0.e);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arxm arxm1 = (arxm)hftp1.b_message;
        s2.getClass();
        hfuo hfuo1 = arxm1.c;
        if(!hfuo1.c()) {
            arxm1.c = ProtoLiteMessage.E(hfuo1);
        }
        arxm1.c.add(s2);
        String s3 = hisv0.f;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arxm arxm2 = (arxm)hftp1.b_message;
        s3.getClass();
        hfuo hfuo2 = arxm2.d;
        if(!hfuo2.c()) {
            arxm2.d = ProtoLiteMessage.E(hfuo2);
        }
        arxm2.d.add(s3);
        String s4 = (hisv0.c == null ? hise.a : hisv0.c).d;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arxm arxm3 = (arxm)hftp1.b_message;
        s4.getClass();
        hfuo hfuo3 = arxm3.e;
        if(!hfuo3.c()) {
            arxm3.e = ProtoLiteMessage.E(hfuo3);
        }
        arxm3.e.add(s4);
        hise hise0 = hisv0.c;
        if(((hise0 == null ? hise.a : hise0).b & 1) != 0) {
            if(hise0 == null) {
                hise0 = hise.a;
            }
            String s5 = (hise0.c == null ? hish.a : hise0.c).b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            arxm arxm4 = (arxm)hftp1.b_message;
            s5.getClass();
            hfuo hfuo4 = arxm4.f;
            if(!hfuo4.c()) {
                arxm4.f = ProtoLiteMessage.E(hfuo4);
            }
            arxm4.f.add(s5);
            hise hise1 = hisv0.c == null ? hise.a : hisv0.c;
            String s6 = String.valueOf((hise1.c == null ? hish.a : hise1.c).c);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            arxm arxm5 = (arxm)hftp1.b_message;
            s6.getClass();
            hfuo hfuo5 = arxm5.g;
            if(!hfuo5.c()) {
                arxm5.g = ProtoLiteMessage.E(hfuo5);
            }
            arxm5.g.add(s6);
        }
        clba clba0 = new clba(null);
        clba0.c(((MessageLite)(((arxm)hftp1.N_build()))), ckav.d, arxn.a);
        return clcg.b(clbd0, new cldm(clba0), ckav.c);
    }
}

