public enum ftkn implements hfub {
    UNKNOWN_SETTING(0),
    EXPRESS_TRANSIT_SETTING(1),
    OMELETTE_SETTING(2),
    UNRECOGNIZED(-1);

    private final int f;

    private ftkn(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != ftkn.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

