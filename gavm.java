public final class gavm {
    public static void a(boolean z, String s, String s1) {
        ibts ibts0 = gavs.a;
        if(z) {
            return;
        }
        throw new gavn(s, s1, ibts0);
    }

    public static void b(Object object0, String s, String s1, int v) {
        ibts ibts0 = (v & 4) == 0 ? null : gavs.a;
        if((v & 8) != 0) {
            s1 = null;
        }
        ibuq.f(ibts0, "addMoreInfo");
        if(object0 != null) {
            return;
        }
        throw new gavn(s, s1, ibts0);
    }

    public static void c(String s, String s1) {
        throw new gavn(s, s1, gavs.a);
    }
}

