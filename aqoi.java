import j..util.Objects;

final class aqoi extends aqpq {
    final hisn a;

    public aqoi(aqok aqok0, hisn hisn0) {
        this.a = hisn0;
        Objects.requireNonNull(aqok0);
        super();
    }

    @Override  // aqpq
    protected final clcf a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arxa.a).v_newBuilder();
        hisn hisn0 = this.a;
        String s = hisn0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arxa arxa0 = (arxa)hftp0.b_message;
        s.getClass();
        arxa0.b |= 1;
        arxa0.c = s;
        arxa arxa1 = (arxa)hftp0.N_build();
        clbc clbc0 = new clbc(null);
        clbc0.c(hqje.l());
        clbc0.d(((MessageLite)arxa1), ckaq.e, arxb.a);
        clbd clbd0 = new clbd(clbc0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)arwy.a).v_newBuilder();
        String s1 = hisn0.e;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arwy arwy0 = (arwy)hftp1.b_message;
        s1.getClass();
        hfuo hfuo0 = arwy0.b;
        if(!hfuo0.c()) {
            arwy0.b = ProtoLiteMessage.E(hfuo0);
        }
        arwy0.b.add(s1);
        String s2 = (hisn0.c == null ? hise.a : hisn0.c).d;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arwy arwy1 = (arwy)hftp1.b_message;
        s2.getClass();
        hfuo hfuo1 = arwy1.c;
        if(!hfuo1.c()) {
            arwy1.c = ProtoLiteMessage.E(hfuo1);
        }
        arwy1.c.add(s2);
        hise hise0 = hisn0.c;
        if(((hise0 == null ? hise.a : hise0).b & 1) != 0) {
            if(hise0 == null) {
                hise0 = hise.a;
            }
            String s3 = (hise0.c == null ? hish.a : hise0.c).b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            arwy arwy2 = (arwy)hftp1.b_message;
            s3.getClass();
            hfuo hfuo2 = arwy2.d;
            if(!hfuo2.c()) {
                arwy2.d = ProtoLiteMessage.E(hfuo2);
            }
            arwy2.d.add(s3);
            hise hise1 = hisn0.c == null ? hise.a : hisn0.c;
            String s4 = String.valueOf((hise1.c == null ? hish.a : hise1.c).c);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            arwy arwy3 = (arwy)hftp1.b_message;
            s4.getClass();
            hfuo hfuo3 = arwy3.e;
            if(!hfuo3.c()) {
                arwy3.e = ProtoLiteMessage.E(hfuo3);
            }
            arwy3.e.add(s4);
        }
        clba clba0 = new clba(null);
        clba0.c(((MessageLite)(((arwy)hftp1.N_build()))), ckaq.d, arwz.a);
        return clcg.b(clbd0, new cldm(clba0), ckaq.c);
    }
}

