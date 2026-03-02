public class azqg {
    public static final azqg a;
    public final boolean b;
    public final azpg c;
    final String d;
    public final Throwable e;
    public final long f;

    static {
        azqg.a = new azqg(true, azpg.c, null, null, -1L);
    }

    public azqg(boolean z, azpg azpg0, String s, Throwable throwable0, long v) {
        this.b = z;
        this.c = azpg0;
        this.d = s;
        this.e = throwable0;
        this.f = v;
    }

    public String a() {
        return this.d;
    }

    final void b() {
        if(!this.b) {
            String s = "GoogleCertificatesRslt: " + this.a() + " (go/gsrlt)";
            throw this.e == null ? new SecurityException(s) : new SecurityException(s, this.e);
        }
    }
}

