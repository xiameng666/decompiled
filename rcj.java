public final class rcj {
    public static final int a;

    static {
    }

    public static String a(Exception exception0) {
        try {
            return rdk.g(a.r(gfta.b(exception0.getMessage()), exception0.getClass().getSimpleName(), ":"), 40);
        }
        catch(Throwable throwable0) {
            rdk.i("BillingLogger", "Unable to get truncated exception info", throwable0);
            return null;
        }
    }

    public static hgxx b(int v, int v1, rcm rcm0) {
        return rcj.d(v, v1, rcm0, null, hgyf.a);
    }

    public static hgxx c(int v, int v1, rcm rcm0, hgyf hgyf0) {
        return rcj.d(v, v1, rcm0, null, hgyf0);
    }

    public static hgxx d(int v, int v1, rcm rcm0, String s, hgyf hgyf0) {
        try {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgyc.a).v_newBuilder();
            int v2 = rcm0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hgyc)hftv0).b |= 1;
            ((hgyc)hftv0).c = v2;
            String s1 = rcm0.c;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            s1.getClass();
            ((hgyc)hftv1).b |= 2;
            ((hgyc)hftv1).d = s1;
            int v3 = rcm0.b;
            if(v3 != 0) {
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgyc hgyc0 = (hgyc)hftp0.b_message;
                hgyc0.b |= 16;
                hgyc0.g = v3;
            }
            if(v != 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hgyc)hftp0.b_message).e = v - 1;
                ((hgyc)hftp0.b_message).b |= 4;
            }
            if(s != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgyc hgyc1 = (hgyc)hftp0.b_message;
                hgyc1.b |= 8;
                hgyc1.f = s;
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgxx.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hgxx hgxx0 = (hgxx)hftp1.b_message;
            hgyc hgyc2 = (hgyc)hftp0.N_build();
            hgyc2.getClass();
            hgxx0.f = hgyc2;
            hgxx0.b |= 2;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hgxx)hftp1.b_message).e = v1 - 1;
            ((hgxx)hftp1.b_message).b |= 1;
            if(!hgyf0.equals(hgyf.a)) {
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hgxx)hftp1.b_message).g = hgyf0.e;
                ((hgxx)hftp1.b_message).b |= 4;
            }
            return (hgxx)hftp1.N_build();
        }
        catch(Throwable throwable0) {
            rdk.i("BillingLogger", "Unable to create logging payload", throwable0);
            return null;
        }
    }

    public static hgxz e(int v) {
        return rcj.f(v, hgyf.a);
    }

    public static hgxz f(int v, hgyf hgyf0) {
        try {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgxz.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hgxz)hftp0.b_message).e = v - 1;
            ((hgxz)hftp0.b_message).b |= 1;
            if(!hgyf0.equals(hgyf.a)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hgxz)hftp0.b_message).f = hgyf0.e;
                ((hgxz)hftp0.b_message).b |= 2;
            }
            return (hgxz)hftp0.N_build();
        }
        catch(Exception exception0) {
            rdk.i("BillingLogger", "Unable to create logging payload", exception0);
            return null;
        }
    }
}

