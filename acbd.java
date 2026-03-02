public final class acbd extends Exception {
    private static final bboh a;
    private final Exception b;

    static {
        acbd.a = bboh.b("AppinviteApiException", bbcu.aK);
    }

    public acbd(Exception exception0) {
        super((exception0 == null ? "Appinvite API Disabled!" : exception0.getMessage()));
        this.b = exception0;
    }

    public final void a() {
        Exception exception0 = this.b;
        if(exception0 == null) {
            ((ggtj)acbd.a.i()).x("Appinvite API Disabled!");
            return;
        }
        if((exception0 instanceof acse)) {
            ((ggtj)((ggtj)acbd.a.i()).s(((acse)exception0))).x("Authentication Failed");
            return;
        }
        a.ae(acbd.a.i(), "Error communicating with server or internal error", exception0);
    }

    public final boolean b() {
        return this.b instanceof acse;
    }
}

