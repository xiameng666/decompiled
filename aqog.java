import j..util.Objects;

final class aqog extends aqps {
    final hisk a;

    public aqog(aqok aqok0, hisk hisk0) {
        this.a = hisk0;
        Objects.requireNonNull(aqok0);
        super();
    }

    @Override  // aqps
    protected final clcf a() {
        clbc clbc0 = new clbc(null);
        clbc0.c(hqje.l());
        clbc0.b("/backups");
        clbd clbd0 = new clbd(clbc0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arws.a).v_newBuilder();
        hisk hisk0 = this.a;
        String s = String.valueOf(hisk0.d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arws arws0 = (arws)hftp0.b_message;
        s.getClass();
        hfuo hfuo0 = arws0.b;
        if(!hfuo0.c()) {
            arws0.b = ProtoLiteMessage.E(hfuo0);
        }
        arws0.b.add(s);
        String s1 = (hisk0.c == null ? hise.a : hisk0.c).d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arws arws1 = (arws)hftp0.b_message;
        s1.getClass();
        hfuo hfuo1 = arws1.c;
        if(!hfuo1.c()) {
            arws1.c = ProtoLiteMessage.E(hfuo1);
        }
        arws1.c.add(s1);
        hise hise0 = hisk0.c;
        if(((hise0 == null ? hise.a : hise0).b & 1) != 0) {
            if(hise0 == null) {
                hise0 = hise.a;
            }
            String s2 = (hise0.c == null ? hish.a : hise0.c).b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            arws arws2 = (arws)hftp0.b_message;
            s2.getClass();
            hfuo hfuo2 = arws2.d;
            if(!hfuo2.c()) {
                arws2.d = ProtoLiteMessage.E(hfuo2);
            }
            arws2.d.add(s2);
            hise hise1 = hisk0.c == null ? hise.a : hisk0.c;
            String s3 = String.valueOf((hise1.c == null ? hish.a : hise1.c).c);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            arws arws3 = (arws)hftp0.b_message;
            s3.getClass();
            hfuo hfuo3 = arws3.e;
            if(!hfuo3.c()) {
                arws3.e = ProtoLiteMessage.E(hfuo3);
            }
            arws3.e.add(s3);
        }
        clba clba0 = new clba(null);
        clba0.c(((MessageLite)(((arws)hftp0.N_build()))), ckan.d, arwt.a);
        return clcg.b(clbd0, new cldm(clba0), ckan.c);
    }
}

