public final class ezrc implements ezsr {
    public final String a;
    public final fpgj b;
    private final icck c;

    public ezrc(String s, fpgj fpgj0, icck icck0) {
        ibuq.f(s, "accountName");
        ibuq.f(fpgj0, "facsAppSearchSession");
        super();
        this.a = s;
        this.b = fpgj0;
        this.c = icck0;
    }

    @Override  // ezsr
    public final gmcd a() {
        ezra ezra0 = new ezra(this, null);
        return icpu.e(this.c, ezra0);
    }

    @Override  // ezsr
    public final gmcd b(ezmc ezmc0) {
        ibuq.f(ezmc0, "settings");
        ezrb ezrb0 = new ezrb(this, ezmc0, null);
        return icpu.e(this.c, ezrb0);
    }
}

