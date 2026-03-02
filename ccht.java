public final class ccht {
    public static final hjie a(hjie hjie0, gsad gsad0) {
        if(gsad0 != null) {
            if(cchl.d() && (gsad0.b & 2) != 0) {
                return gsad0.d == null ? hjie.a : gsad0.d;
            }
            return gsad0.c == null ? hjie.a : gsad0.c;
        }
        return hjie0;
    }

    public static final String b(String s, gsae gsae0) {
        ibuq.f(s, "url");
        if(gsae0 != null) {
            return !cchl.d() || (gsae0.b & 2) == 0 ? gsae0.c : gsae0.d;
        }
        return s.length() > 0 ? s : null;
    }
}

