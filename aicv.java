public final class aicv {
    public static final aicv a;

    static {
        aicv.a = new aicv();
    }

    public static final ghwp a(String s, ghwo ghwo0, int v) {
        ibuq.f(s, "packageName");
        ibuq.f(ghwo0, "eventType");
        return aicv.e(v, new aicu(ghwo0, s));
    }

    public static final ghwp b(String s, ghwo ghwo0, ghwm ghwm0, int v) {
        ibuq.f(s, "packageName");
        ibuq.f(ghwo0, "eventType");
        ibuq.f(ghwm0, "errorType");
        return aicv.e(v, new aict(ghwo0, s, ghwm0));
    }

    public static ghwp c(String s, ghwo ghwo0) {
        return aicv.a(s, ghwo0, -1);
    }

    public static ghwp d(String s, ghwo ghwo0, ghwm ghwm0) {
        return aicv.b(s, ghwo0, ghwm0, -1);
    }

    private static final ghwp e(int v, ibts ibts0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghwp.a).v_newBuilder();
        ibuq.e(hftp0, "newBuilder(...)");
        ibts0.a(hftp0);
        if(v >= 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghwp ghwp0 = (ghwp)hftp0.b_message;
            ghwp0.b |= 4;
            ghwp0.e = v;
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ghwp)hftv0;
    }
}

