public enum hkmy implements hfub {
    DISPLAY_PREFERENCES_UNKNOWN(0),
    LIST_VIEW(1),
    BACK_OF_CARD_VIEW(2),
    UNRECOGNIZED(-1);

    private final int f;

    private hkmy(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkmy.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

