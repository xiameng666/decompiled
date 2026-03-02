public enum gzxo implements hfub {
    ENABLEMENT_TYPE_UNSPECIFIED(0),
    ENABLEMENT_TYPE_USER_REQUESTED(1),
    ENABLEMENT_TYPE_IMPLICIT(2),
    UNRECOGNIZED(-1);

    private final int f;

    private gzxo(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzxo.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

