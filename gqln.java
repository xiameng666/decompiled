public enum gqln {
    UNKNOWN(""),
    ANDROID("android"),
    HTTPS("https"),
    HTTP("http"),
    FEDERATION("federation");

    public final String f;

    private gqln(String s1) {
        this.f = s1;
    }

    static gqln a(String s) {
        return (gqln)ggch.k(gqln.values()).c(new gqlm(s)).f(gqln.a);
    }
}

