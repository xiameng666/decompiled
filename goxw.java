public final class goxw implements goxo {
    public final String a;
    public final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public goxw(String s, String s1, String s2, String s3, String s4) {
        batl.q("phone");
        this.c = "phone";
        batl.q(s);
        this.a = s;
        this.d = s1;
        this.e = s2;
        this.f = s3;
        this.b = s4;
    }

    @Override  // goxo
    public final MessageLite a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdhn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdhn gdhn0 = (gdhn)hftp0.b_message;
        this.a.getClass();
        gdhn0.b |= 2;
        gdhn0.f = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gdhn)hftp0.b_message).e = 1;
        ((gdhn)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgat.a).v_newBuilder();
        String s = this.e;
        if(s != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hgat)hftp1.b_message).c = s;
        }
        String s1 = this.f;
        if(s1 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hgat)hftp1.b_message).d = s1;
        }
        String s2 = this.b;
        if(s2 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hgat)hftp1.b_message).e = s2;
        }
        String s3 = this.d;
        if(s3 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hgat)hftp1.b_message).b = s3;
        }
        hgat hgat0 = (hgat)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdhn gdhn1 = (gdhn)hftp0.b_message;
        hgat0.getClass();
        gdhn1.d = hgat0;
        gdhn1.c = 3;
        return (gdhn)hftp0.N_build();
    }
}

