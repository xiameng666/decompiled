import j..util.Objects;

final class aqoc extends aqps {
    final hisx a;

    public aqoc(aqok aqok0, hisx hisx0) {
        this.a = hisx0;
        Objects.requireNonNull(aqok0);
        super();
    }

    @Override  // aqps
    protected final clcf a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arxs.a).v_newBuilder();
        hisx hisx0 = this.a;
        String s = hisx0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arxs arxs0 = (arxs)hftp0.b_message;
        s.getClass();
        arxs0.b |= 1;
        arxs0.c = s;
        arxs arxs1 = (arxs)hftp0.N_build();
        clbc clbc0 = new clbc(null);
        clbc0.c(hqje.l());
        clbc0.d(((MessageLite)arxs1), ckaw.e, arxt.a);
        clbd clbd0 = new clbd(clbc0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)arxq.a).v_newBuilder();
        String s1 = String.valueOf((hisx0.e == null ? hita.a : hisx0.e).b);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arxq arxq0 = (arxq)hftp1.b_message;
        s1.getClass();
        hfuo hfuo0 = arxq0.b;
        if(!hfuo0.c()) {
            arxq0.b = ProtoLiteMessage.E(hfuo0);
        }
        arxq0.b.add(s1);
        if(hisz.b((hisx0.e == null ? hita.a : hisx0.e).b) == 4) {
            String s2 = String.valueOf(hisx0.f);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            arxq arxq1 = (arxq)hftp1.b_message;
            s2.getClass();
            hfuo hfuo1 = arxq1.c;
            if(!hfuo1.c()) {
                arxq1.c = ProtoLiteMessage.E(hfuo1);
            }
            arxq1.c.add(s2);
        }
        String s3 = (hisx0.c == null ? hise.a : hisx0.c).d;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arxq arxq2 = (arxq)hftp1.b_message;
        s3.getClass();
        hfuo hfuo2 = arxq2.d;
        if(!hfuo2.c()) {
            arxq2.d = ProtoLiteMessage.E(hfuo2);
        }
        arxq2.d.add(s3);
        hise hise0 = hisx0.c;
        if(((hise0 == null ? hise.a : hise0).b & 1) != 0) {
            if(hise0 == null) {
                hise0 = hise.a;
            }
            String s4 = (hise0.c == null ? hish.a : hise0.c).b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            arxq arxq3 = (arxq)hftp1.b_message;
            s4.getClass();
            hfuo hfuo3 = arxq3.e;
            if(!hfuo3.c()) {
                arxq3.e = ProtoLiteMessage.E(hfuo3);
            }
            arxq3.e.add(s4);
            hise hise1 = hisx0.c == null ? hise.a : hisx0.c;
            String s5 = String.valueOf((hise1.c == null ? hish.a : hise1.c).c);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            arxq arxq4 = (arxq)hftp1.b_message;
            s5.getClass();
            hfuo hfuo4 = arxq4.f;
            if(!hfuo4.c()) {
                arxq4.f = ProtoLiteMessage.E(hfuo4);
            }
            arxq4.f.add(s5);
        }
        clba clba0 = new clba(null);
        clba0.c(((MessageLite)(((arxq)hftp1.N_build()))), ckaw.d, arxr.a);
        return clcg.b(clbd0, new cldm(clba0), ckaw.c);
    }
}

