public enum hkuj implements hfub {
    TRANSIT_ACTION_UNKNOWN(0),
    TRANSIT_ACTION_ON(1),
    TRANSIT_ACTION_OFF(2),
    TRANSIT_ACTION_TAP(3),
    TRANSIT_ACTION_TRANSFER(4),
    UNRECOGNIZED(-1);

    private final int h;

    private hkuj(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkuj.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}

