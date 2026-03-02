public enum ftja implements hfub {
    TOS_ACCEPTANCE_TYPE_UNKNOWN(0),
    TOS_ACCEPTANCE_TYPE_FELICA(1),
    TOS_ACCEPTANCE_TYPE_SUICA(2),
    TOS_ACCEPTANCE_TYPE_PASMO(3),
    UNRECOGNIZED(-1);

    private final int g;

    private ftja(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != ftja.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

