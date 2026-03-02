public enum ctee implements hfub {
    UNSET(0),
    OPTED_IN(1),
    OPTED_OUT(2),
    UNRECOGNIZED(-1);

    public static final hfuc e;
    private final int g;

    static {
        ctee.e = new cted();
    }

    private ctee(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != ctee.d) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

