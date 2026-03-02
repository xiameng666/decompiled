public final class aaua {
    public static final aatb a;

    static {
        aaua.a = aaua.a(null);
    }

    public static aatb a(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aatb.a).v_newBuilder();
        String s1 = gfta.b(s).trim();
        if(!s1.isEmpty()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            aatb aatb0 = (aatb)hftp0.b_message;
            s1.getClass();
            aatb0.b = s1;
        }
        return (aatb)hftp0.N_build();
    }

    public static String b(aatb aatb0) {
        if(aaua.c(aatb0)) {
            return aatb0.b;
        }
        throw new aatz();
    }

    public static boolean c(aatb aatb0) {
        return aatb0 != null && !aatb0.b.trim().isEmpty();
    }
}

