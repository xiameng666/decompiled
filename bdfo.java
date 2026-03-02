final class bdfo {
    public static final grbg a(graz graz0, String s) {
        ibuq.f(graz0, "checkupIssueType");
        grbf grbf0 = (grbf)((ProtoLiteMessage)grbg.a).v_newBuilder();
        if(!grbf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grbf0).ensureMutable();
        }
        ((grbg)grbf0.b_message).c = graz0.e;
        ((grbg)grbf0.b_message).b |= 1;
        if(!grbf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grbf0).ensureMutable();
        }
        grbg grbg0 = (grbg)grbf0.b_message;
        grbg0.b |= 2;
        grbg0.d = 1;
        grbb grbb0 = (grbb)((ProtoLiteMessage)grbe.b).v_newBuilder();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grax.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)heqb.a).v_newBuilder();
        String s1 = a.a(s, "www.", ".com");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        heqb heqb0 = (heqb)hftp1.b_message;
        heqb0.b |= 2;
        heqb0.d = s1;
        String s2 = a.a(s, "www.", ".com/origin");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((heqb)hftv0).b |= 4;
        ((heqb)hftv0).e = s2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        heqb heqb1 = (heqb)hftp1.b_message;
        heqb1.b |= 0x80;
        heqb1.i = s + " password";
        heqb heqb2 = (heqb)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grax grax0 = (grax)hftp0.b_message;
        heqb2.getClass();
        grax0.b();
        grax0.c.add(heqb2);
        grax grax1 = (grax)hftp0.N_build();
        if(!grbb0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grbb0).ensureMutable();
        }
        grbe grbe0 = (grbe)grbb0.b_message;
        grax1.getClass();
        grbe0.b();
        grbe0.c.add(grax1);
        grbf0.a(((grbe)((ProtoLiteBuilder)grbb0).N_build()));
        ProtoLiteMessage hftv1 = ((ProtoLiteBuilder)grbf0).N_build();
        ibuq.e(hftv1, "build(...)");
        return (grbg)hftv1;
    }
}

