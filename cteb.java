public enum cteb implements hfub {
    UNAVAILABLE(0),
    ENABLED(1),
    DISABLED(2),
    UNRECOGNIZED(-1);

    public static final hfuc e;
    private final int g;

    static {
        cteb.e = new ctea();
    }

    private cteb(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != cteb.d) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

