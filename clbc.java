public final class clbc {
    public ckcq a;
    public long b;
    public String c;
    public String d;
    public MessageLite e;
    private boolean f;

    public clbc() {
        throw null;
    }

    public clbc(byte[] arr_b) {
        this.a = ckkp.a;
        this.f = false;
        this.c = "";
        this.d = "";
    }

    protected static String a(String s, String s1) {
        if(s.isEmpty()) {
            return s1;
        }
        boolean z = s.endsWith("/");
        boolean z1 = s1.startsWith("/");
        if(z && z1) {
            return s.substring(0, s.length() - 1) + s1;
        }
        return z || z1 ? s + s1 : a.r(s1, s, "/");
    }

    public final void b(String s) {
        this.d = clbc.a(this.d, s);
        this.c = clbc.a(this.c, s);
    }

    public final void c(hnns hnns0) {
        String s = (hnns0.b == null ? hnnt.a : hnns0.b).b;
        this.d = clbc.a(this.d, s);
        this.c = clbc.a(this.c, s);
    }

    public final void d(MessageLite hfvm0, ckcp ckcp0, clde clde0) {
        if(this.f) {
            throw new UnsupportedOperationException("Proto url path can be only set once.");
        }
        this.f = true;
        this.e = hfvm0;
        String s = clde0.a(hfvm0);
        this.c = clbc.a(this.c, s);
        this.b = (long)s.length();
        this.d = clbc.a(this.d, clde0.b());
        this.a = ckcp0.a;
    }
}

