public enum gquw implements hfub {
    UNKNOWN(0),
    AUTHZEN(1),
    BETTER_TOGETHER(2),
    FIDO(3),
    SMARTSETUP(4),
    UNRECOGNIZED(-1);

    private final int h;

    private gquw(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gquw.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}

