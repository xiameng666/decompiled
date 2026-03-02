import java.nio.charset.StandardCharsets;

public final class dmgi {
    private final chji a;
    private final chjl b;
    private final String c;
    private final String d;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public dmgi(String s, String s1) {
        this(s, s1, null);
    }

    public dmgi(String s, String s1, byte[] arr_b) {
        this.a = chji.v();
        this.b = chjl.v();
        this.c = s;
        this.d = s1;
    }

    public static dmgi a() {
        return new dmgi(null, dmgv.d(), null);
    }

    public final void b(hapr hapr0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hapr0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hapr0));
        this.d(hftp0, null);
    }

    public final void c(hapr hapr0, String s) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hapr0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hapr0));
        this.d(hftp0, s);
    }

    private final void d(ProtoLiteBuilder hftp0, String s) {
        cczb cczb0;
        String s1 = this.d;
        if(dmgv.f(s1)) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hafi.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hafi)hftp1.b_message).c = 2;
            ((hafi)hftp1.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hapr hapr0 = (hapr)hftp0.b_message;
            hafi hafi0 = (hafi)hftp1.N_build();
            hafi0.getClass();
            hapr0.bo = hafi0;
            hapr0.f |= 0x2000;
        }
        else if(dmgv.e(s1)) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hafi.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hafi)hftp2.b_message).c = 1;
            ((hafi)hftp2.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hapr hapr1 = (hapr)hftp0.b_message;
            hafi hafi1 = (hafi)hftp2.N_build();
            hafi1.getClass();
            hapr1.bo = hafi1;
            hapr1.f |= 0x2000;
        }
        else {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hafi.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((hafi)hftp3.b_message).c = 3;
            ((hafi)hftp3.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hapr hapr2 = (hapr)hftp0.b_message;
            hafi hafi2 = (hafi)hftp3.N_build();
            hafi2.getClass();
            hapr2.bo = hafi2;
            hapr2.f |= 0x2000;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hapr)hftp0.b_message).at = 8;
        hapr hapr3 = (hapr)hftp0.N_build();
        if(!bbmq.P()) {
            String s2 = this.c;
            if(s2 == null) {
                cczb0 = this.b.c(((ProtoLiteMessage)hapr3));
            }
            else {
                cczb0 = this.a.c(((ProtoLiteMessage)hapr3));
                cczb0.b = s2;
            }
            if(s != null) {
                cczb0.e = ghfs.a.c(s, StandardCharsets.UTF_8).c();
            }
            cczb0.a();
        }
    }
}

