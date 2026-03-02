public final class azqz {
    public final String a;
    public final boolean b;
    public final Throwable c;
    public final bbhf d;
    private final azpg e;
    private final String f;

    public azqz(String s, azpg azpg0, boolean z, String s1, Throwable throwable0, bbhf bbhf0) {
        this.a = s;
        this.e = azpg0;
        this.b = z;
        this.f = s1;
        this.c = throwable0;
        this.d = bbhf0;
    }

    public final void a() {
        if(!this.b) {
            String s = "PackageVerificationRslt: " + this.f;
            throw this.c == null ? new SecurityException(s) : new SecurityException(s, this.c);
        }
    }

    public final boolean b() {
        return this.e.equals(azpg.c);
    }
}

