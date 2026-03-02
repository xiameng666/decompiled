public enum bmbt {
    WEBAUTHN_CREATE("webauthn.create"),
    WEBAUTHN_GET("webauthn.get");

    private final String d;

    private bmbt(String s1) {
        this.d = s1;
    }

    @Override
    public final String toString() {
        return this.d;
    }
}

