public final class jhl {
    public static final iwj a(jhk jhk0) {
        return jhk0.b.e(jbk.d(jhk0.c), jbk.c(jhk0.c));
    }

    public static final iwj b(jhk jhk0, int v) {
        int v1 = jbk.c(jhk0.c);
        int v2 = v1 + v;
        return jhk0.b.e(jbk.c(jhk0.c), Math.min((((v ^ v2) & (v1 ^ v2)) >= 0 ? v1 + v : jhk0.a().length()), jhk0.a().length()));
    }

    public static final iwj c(jhk jhk0, int v) {
        int v1 = jbk.d(jhk0.c);
        return jhk0.b.e(Math.max(0, (((v ^ v1) & (v1 ^ v1 - v)) >= 0 ? v1 - v : 0)), jbk.d(jhk0.c));
    }
}

