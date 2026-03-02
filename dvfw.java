public final class dvfw {
    private final dmgk a;

    public dvfw(dmgk dmgk0) {
        this.a = dmgk0;
    }

    public final void a(String s, String s1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hana.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hana)hftp1.b_message).b = s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hana hana0 = (hana)hftp1.N_build();
        hana0.getClass();
        hapr0.r = hana0;
        hapr0.b |= 0x200;
        this.a.d(hftp0, s1);
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)haqy.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((haqy)hftv0).b = 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((haqy)hftv1).c = v;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((haqy)hftv2).d = 2;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((haqy)hftp1.b_message).e = 0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        haqy haqy0 = (haqy)hftp1.N_build();
        haqy0.getClass();
        hapr0.bm = haqy0;
        hapr0.f |= 0x40;
        this.a.c(hftp0);
    }
}

