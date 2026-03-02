public final class goxu implements goxo {
    public String a;
    public final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public goxu(String s, String s1, String s2, String s3, String s4, String s5) {
        batl.q("phone");
        this.c = "phone";
        batl.q(s);
        this.a = s;
        this.d = s1;
        this.f = s2;
        this.g = s3;
        this.b = s4;
        this.e = s5;
    }

    @Override  // goxo
    public final MessageLite a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdhl.a).v_newBuilder();
        String s = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdhl gdhl0 = (gdhl)hftp0.b_message;
        s.getClass();
        gdhl0.b |= 1;
        gdhl0.e = s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gdhl)hftv0).f = 1;
        ((gdhl)hftv0).b |= 2;
        String s1 = this.e;
        if(s1 != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhl gdhl1 = (gdhl)hftp0.b_message;
            gdhl1.b |= 4;
            gdhl1.g = s1;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgat.a).v_newBuilder();
        String s2 = this.f;
        if(s2 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hgat)hftp1.b_message).c = s2;
        }
        String s3 = this.g;
        if(s3 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hgat)hftp1.b_message).d = s3;
        }
        String s4 = this.b;
        if(s4 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hgat)hftp1.b_message).e = s4;
        }
        String s5 = this.d;
        if(s5 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hgat)hftp1.b_message).b = s5;
        }
        hgat hgat0 = (hgat)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdhl gdhl2 = (gdhl)hftp0.b_message;
        hgat0.getClass();
        gdhl2.d = hgat0;
        gdhl2.c = 4;
        return (gdhl)hftp0.N_build();
    }
}

