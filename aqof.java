import j..util.Objects;

final class aqof extends aqpr {
    final hiss a;

    public aqof(aqok aqok0, hiss hiss0) {
        this.a = hiss0;
        Objects.requireNonNull(aqok0);
        super();
    }

    @Override  // aqpr
    protected final clcf a() {
        clbc clbc0 = new clbc(null);
        clbc0.c(hqje.l());
        clbc0.b("/backups");
        clbd clbd0 = new clbd(clbc0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arxk.a).v_newBuilder();
        hiss hiss0 = this.a;
        String s = String.valueOf(hiss0.d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arxk arxk0 = (arxk)hftp0.b_message;
        s.getClass();
        hfuo hfuo0 = arxk0.b;
        if(!hfuo0.c()) {
            arxk0.b = ProtoLiteMessage.E(hfuo0);
        }
        arxk0.b.add(s);
        String s1 = hiss0.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arxk arxk1 = (arxk)hftp0.b_message;
        s1.getClass();
        hfuo hfuo1 = arxk1.c;
        if(!hfuo1.c()) {
            arxk1.c = ProtoLiteMessage.E(hfuo1);
        }
        arxk1.c.add(s1);
        String s2 = (hiss0.c == null ? hise.a : hiss0.c).d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arxk arxk2 = (arxk)hftp0.b_message;
        s2.getClass();
        hfuo hfuo2 = arxk2.d;
        if(!hfuo2.c()) {
            arxk2.d = ProtoLiteMessage.E(hfuo2);
        }
        arxk2.d.add(s2);
        hise hise0 = hiss0.c;
        if(((hise0 == null ? hise.a : hise0).b & 1) != 0) {
            if(hise0 == null) {
                hise0 = hise.a;
            }
            String s3 = (hise0.c == null ? hish.a : hise0.c).b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            arxk arxk3 = (arxk)hftp0.b_message;
            s3.getClass();
            hfuo hfuo3 = arxk3.e;
            if(!hfuo3.c()) {
                arxk3.e = ProtoLiteMessage.E(hfuo3);
            }
            arxk3.e.add(s3);
            hise hise1 = hiss0.c == null ? hise.a : hiss0.c;
            String s4 = String.valueOf((hise1.c == null ? hish.a : hise1.c).c);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            arxk arxk4 = (arxk)hftp0.b_message;
            s4.getClass();
            hfuo hfuo4 = arxk4.f;
            if(!hfuo4.c()) {
                arxk4.f = ProtoLiteMessage.E(hfuo4);
            }
            arxk4.f.add(s4);
        }
        clba clba0 = new clba(null);
        clba0.c(((MessageLite)(((arxk)hftp0.N_build()))), ckau.d, arxl.a);
        return clcg.b(clbd0, new cldm(clba0), ckau.c);
    }
}

