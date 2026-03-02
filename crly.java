public enum crly {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    private final String f;

    private crly(String s1) {
        this.f = s1;
    }

    @Override
    public final String toString() {
        return this.f;
    }
}

