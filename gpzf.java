import j..util.Objects;

public final class gpzf {
    public static final gpzf a;
    public final String b;
    public final String c;
    public final boolean d;

    static {
        gpzf.a = new gpzf("", "", false);
        new gpzf("\n", "  ", true);
    }

    private gpzf(String s, String s1, boolean z) {
        Objects.requireNonNull(s, "newline == null");
        Objects.requireNonNull(s1, "indent == null");
        if(!s.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if(!s1.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.b = s;
        this.c = s1;
        this.d = z;
    }
}

