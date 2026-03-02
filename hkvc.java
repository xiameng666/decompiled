public enum hkvc implements hfub {
    UNKNOWN_PADDING(0),
    NONE(1),
    PKCS7(2),
    UNRECOGNIZED(-1);

    private final int f;

    private hkvc(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkvc.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

