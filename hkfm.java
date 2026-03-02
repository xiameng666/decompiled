public enum hkfm implements hfub {
    PHYSICAL_TO_VIRTUAL_CONVERSION_METHOD_UNKNOWN(0),
    PHYSICAL_TO_VIRTUAL_CONVERSION_METHOD_MANUAL(1),
    PHYSICAL_TO_VIRTUAL_CONVERSION_METHOD_NFC(2),
    UNRECOGNIZED(-1);

    private final int f;

    private hkfm(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkfm.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

