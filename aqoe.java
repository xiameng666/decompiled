import j..util.Objects;

final class aqoe extends aqpr {
    final hisq a;

    public aqoe(aqok aqok0, hisq hisq0) {
        this.a = hisq0;
        Objects.requireNonNull(aqok0);
        super();
    }

    @Override  // aqpr
    protected final clcf a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arxe.a).v_newBuilder();
        hisq hisq0 = this.a;
        String s = String.valueOf(hisq0.d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arxe arxe0 = (arxe)hftp0.b_message;
        s.getClass();
        arxe0.b |= 1;
        arxe0.c = s;
        arxe arxe1 = (arxe)hftp0.N_build();
        clbc clbc0 = new clbc(null);
        clbc0.c(hqje.l());
        clbc0.d(((MessageLite)arxe1), ckas.e, arxf.a);
        clbd clbd0 = new clbd(clbc0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)arxc.a).v_newBuilder();
        String s1 = (hisq0.c == null ? hise.a : hisq0.c).d;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arxc arxc0 = (arxc)hftp1.b_message;
        s1.getClass();
        hfuo hfuo0 = arxc0.b;
        if(!hfuo0.c()) {
            arxc0.b = ProtoLiteMessage.E(hfuo0);
        }
        arxc0.b.add(s1);
        hise hise0 = hisq0.c;
        if(((hise0 == null ? hise.a : hise0).b & 1) != 0) {
            if(hise0 == null) {
                hise0 = hise.a;
            }
            String s2 = (hise0.c == null ? hish.a : hise0.c).b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            arxc arxc1 = (arxc)hftp1.b_message;
            s2.getClass();
            hfuo hfuo1 = arxc1.c;
            if(!hfuo1.c()) {
                arxc1.c = ProtoLiteMessage.E(hfuo1);
            }
            arxc1.c.add(s2);
            hise hise1 = hisq0.c == null ? hise.a : hisq0.c;
            String s3 = String.valueOf((hise1.c == null ? hish.a : hise1.c).c);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            arxc arxc2 = (arxc)hftp1.b_message;
            s3.getClass();
            hfuo hfuo2 = arxc2.d;
            if(!hfuo2.c()) {
                arxc2.d = ProtoLiteMessage.E(hfuo2);
            }
            arxc2.d.add(s3);
        }
        clba clba0 = new clba(null);
        clba0.c(((MessageLite)(((arxc)hftp1.N_build()))), ckas.d, arxd.a);
        return clcg.b(clbd0, new cldm(clba0), ckas.c);
    }
}

