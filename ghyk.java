public enum ghyk implements hfub {
    UNKNOWN_TRUSTLET(0),
    BLUETOOTH_TRUSTLET(1),
    PLACE_TRUSTLET(2),
    FACE_UNLOCK_TRUSTLET(3),
    PHONE_POSITION_TRUSTLET(5),
    USER_PRESENT_UNLOCK(99);

    public final int g;

    private ghyk(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

