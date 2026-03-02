public enum hlun implements hfub {
    UNSPECIFIED(0),
    SUCCESS(1),
    FAILURE(2),
    UNRECOGNIZED(-1);

    private final int f;

    private hlun(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hlun.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

