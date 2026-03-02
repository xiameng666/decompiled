import j..util.Objects;

final class aqod extends aqps {
    final hisi a;

    public aqod(aqok aqok0, hisi hisi0) {
        this.a = hisi0;
        Objects.requireNonNull(aqok0);
        super();
    }

    @Override  // aqps
    protected final clcf a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arwq.a).v_newBuilder();
        hisi hisi0 = this.a;
        String s = hisi0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        arwq arwq0 = (arwq)hftp0.b_message;
        s.getClass();
        arwq0.b |= 1;
        arwq0.c = s;
        arwq arwq1 = (arwq)hftp0.N_build();
        clbc clbc0 = new clbc(null);
        clbc0.c(hqje.l());
        clbc0.d(((MessageLite)arwq1), ckam.e, arwr.a);
        clbd clbd0 = new clbd(clbc0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)arwo.a).v_newBuilder();
        String s1 = hisi0.e;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arwo arwo0 = (arwo)hftp1.b_message;
        s1.getClass();
        hfuo hfuo0 = arwo0.b;
        if(!hfuo0.c()) {
            arwo0.b = ProtoLiteMessage.E(hfuo0);
        }
        arwo0.b.add(s1);
        String s2 = (hisi0.c == null ? hise.a : hisi0.c).d;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        arwo arwo1 = (arwo)hftp1.b_message;
        s2.getClass();
        hfuo hfuo1 = arwo1.c;
        if(!hfuo1.c()) {
            arwo1.c = ProtoLiteMessage.E(hfuo1);
        }
        arwo1.c.add(s2);
        hise hise0 = hisi0.c;
        if(((hise0 == null ? hise.a : hise0).b & 1) != 0) {
            if(hise0 == null) {
                hise0 = hise.a;
            }
            String s3 = (hise0.c == null ? hish.a : hise0.c).b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            arwo arwo2 = (arwo)hftp1.b_message;
            s3.getClass();
            hfuo hfuo2 = arwo2.d;
            if(!hfuo2.c()) {
                arwo2.d = ProtoLiteMessage.E(hfuo2);
            }
            arwo2.d.add(s3);
            hise hise1 = hisi0.c == null ? hise.a : hisi0.c;
            String s4 = String.valueOf((hise1.c == null ? hish.a : hise1.c).c);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            arwo arwo3 = (arwo)hftp1.b_message;
            s4.getClass();
            hfuo hfuo3 = arwo3.e;
            if(!hfuo3.c()) {
                arwo3.e = ProtoLiteMessage.E(hfuo3);
            }
            arwo3.e.add(s4);
        }
        clba clba0 = new clba(null);
        clba0.c(((MessageLite)(((arwo)hftp1.N_build()))), ckam.d, arwp.a);
        return clcg.b(clbd0, new cldm(clba0), ckam.c);
    }
}

