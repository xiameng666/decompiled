import java.util.Comparator;

public final class gqlz {
    public static final Comparator a;

    static {
        gqlz.a = ggmo.g(new gqlx());
    }

    public static hhyc a(gqlo gqlo0) {
        return gqlo0.d() ? hhyc.c : hhyc.b;
    }

    public static hhyd b(gqlo gqlo0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhyd.a).v_newBuilder();
        String s = gqlz.d(gqlo0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhyd hhyd0 = (hhyd)hftp0.b_message;
        s.getClass();
        hhyd0.b |= 1;
        hhyd0.c = s;
        hhyc hhyc0 = gqlz.a(gqlo0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hhyd)hftp0.b_message).d = hhyc0.d;
        ((hhyd)hftp0.b_message).b |= 2;
        if(gqlo0.f() || gqlo0.e()) {
            String s1 = gqlz.c(gqlo0.a);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s1.getClass();
            ((hhyd)hftv0).b |= 4;
            ((hhyd)hftv0).e = s1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((hhyd)hftv1).b |= 16;
            ((hhyd)hftv1).g = 0x20;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            hhyd hhyd1 = (hhyd)hftp0.b_message;
            hhyd1.b |= 8;
            hhyd1.f = 0x20;
        }
        return (hhyd)hftp0.N_build();
    }

    static String c(String s) {
        glwd glwd0 = glwd.b("https://t1.gstatic.com/faviconV2?client=PASSWORD_MANAGER&type=FAVICON&fallback_opts=TYPE,SIZE,URL&size=32&nfrp=3");
        glwd0.d("url", s);
        return glwd0.toString();
    }

    public static String d(gqlo gqlo0) {
        if(gqlo0.f()) {
            return glwd.b(gqlo0.a).b;
        }
        return gqlo0.d() ? gqlw.a(gqlo0.a) : gqlo0.a;
    }
}

