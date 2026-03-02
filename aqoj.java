import j..util.Objects;

final class aqoj extends aqpq {
    final hism a;

    public aqoj(aqok aqok0, hism hism0) {
        this.a = hism0;
        Objects.requireNonNull(aqok0);
        super();
    }

    @Override  // aqpq
    protected final clcf a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arww.a).v_newBuilder();
        hism hism0 = this.a;
        String s = String.valueOf(hism0.d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arww arww0 = (arww)hftp0.b_message;
        s.getClass();
        arww0.b |= 1;
        arww0.c = s;
        arww arww1 = (arww)hftp0.N_build();
        clbc clbc0 = new clbc(null);
        clbc0.c(hqje.l());
        clbc0.d(((MessageLite)arww1), ckao.e, arwx.a);
        clbd clbd0 = new clbd(clbc0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)arwu.a).v_newBuilder();
        String s1 = (hism0.c == null ? hise.a : hism0.c).d;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arwu arwu0 = (arwu)hftp1.b_message;
        s1.getClass();
        hfuo hfuo0 = arwu0.b;
        if(!hfuo0.c()) {
            arwu0.b = ProtoLiteMessage.E(hfuo0);
        }
        arwu0.b.add(s1);
        hise hise0 = hism0.c;
        if(((hise0 == null ? hise.a : hise0).b & 1) != 0) {
            if(hise0 == null) {
                hise0 = hise.a;
            }
            String s2 = (hise0.c == null ? hish.a : hise0.c).b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            arwu arwu1 = (arwu)hftp1.b_message;
            s2.getClass();
            hfuo hfuo1 = arwu1.c;
            if(!hfuo1.c()) {
                arwu1.c = ProtoLiteMessage.E(hfuo1);
            }
            arwu1.c.add(s2);
            hise hise1 = hism0.c == null ? hise.a : hism0.c;
            String s3 = String.valueOf((hise1.c == null ? hish.a : hise1.c).c);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            arwu arwu2 = (arwu)hftp1.b_message;
            s3.getClass();
            hfuo hfuo2 = arwu2.d;
            if(!hfuo2.c()) {
                arwu2.d = ProtoLiteMessage.E(hfuo2);
            }
            arwu2.d.add(s3);
        }
        clba clba0 = new clba(null);
        clba0.c(((MessageLite)(((arwu)hftp1.N_build()))), ckao.d, arwv.a);
        return clcg.b(clbd0, new cldm(clba0), ckao.c);
    }
}

