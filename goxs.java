import com.google.firebase.auth.EmailAuthCredential;

public final class goxs implements goxo {
    private final String a;
    private final String b;
    private final String c;

    static {
        new baun("EmailLinkSignInRequest", new String[0]);
    }

    public goxs(EmailAuthCredential emailAuthCredential0, String s) {
        batl.q(emailAuthCredential0.a);
        this.a = emailAuthCredential0.a;
        batl.q(emailAuthCredential0.c);
        this.b = emailAuthCredential0.c;
        this.c = s;
    }

    @Override  // goxo
    public final MessageLite a() {
        gora gora0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdhj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdhj gdhj0 = (gdhj)hftp0.b_message;
        this.a.getClass();
        gdhj0.b |= 2;
        gdhj0.d = this.a;
        batl.q(this.b);
        String s = null;
        try {
            gora0 = null;
            gora0 = new gora(this.b);
        }
        catch(IllegalArgumentException unused_ex) {
        }
        String s1 = gora0 == null ? null : gora0.a;
        if(gora0 != null) {
            s = gora0.b;
        }
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhj gdhj1 = (gdhj)hftp0.b_message;
            gdhj1.b |= 1;
            gdhj1.c = s1;
        }
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhj gdhj2 = (gdhj)hftp0.b_message;
            gdhj2.b |= 8;
            gdhj2.f = s;
        }
        String s2 = this.c;
        if(s2 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhj gdhj3 = (gdhj)hftp0.b_message;
            gdhj3.b |= 4;
            gdhj3.e = s2;
        }
        return (gdhj)hftp0.N_build();
    }
}

