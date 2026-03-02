public enum ftpc implements hfub {
    WINDOW_SIZE_CLASS_UNKNOWN(0),
    WINDOW_SIZE_CLASS_COMPACT(1),
    WINDOW_SIZE_CLASS_MEDIUM(2),
    WINDOW_SIZE_CLASS_EXPANDED(3),
    UNRECOGNIZED(-1);

    private final int g;

    private ftpc(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != ftpc.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

