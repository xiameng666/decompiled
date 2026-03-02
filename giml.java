public enum giml implements hfub {
    UNKNOWN(0),
    VALID_GLOBAL(1),
    VALID_NATIONAL(2),
    VALID_INCOMPLETE_LOCAL(3),
    INVALID_MISSING(4),
    INVALID_UNPARSABLE(5),
    INVALID_COUNTRY_CODE(6),
    INVALID_TOO_SHORT(7),
    INVALID_TOO_LONG(8),
    INVALID_LENGTH(9);

    public final int k;

    private giml(int v1) {
        this.k = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.k;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}

