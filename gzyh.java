public enum gzyh implements hfub {
    UNKNOWN_RANGING_EVENT(0),
    FIRST_ADVERTISEMENT_SEEN(1),
    RANGING_COMPLETED(2),
    UNRECOGNIZED(-1);

    private final int f;

    private gzyh(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzyh.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

