public enum gsuc implements hfub {
    REQUEST_MASK_CONTAINER_UNKNOWN(0),
    PROFILE(1),
    DOMAIN_PROFILE(7),
    CONTACT(2),
    ACCOUNT(5),
    AFFINITY(11),
    DOMAIN_CONTACT(8),
    PLACE(4),
    RAW_DEVICE_CONTACT(13),
    DELEGATED_CONTACT(15),
    CONTACT_ANNOTATION(14),
    GOOGLE_GROUP(10),
    CHAT_ROOM(17),
    @Deprecated
    CIRCLE(3),
    @Deprecated
    EXTERNAL_ACCOUNT(6),
    @Deprecated
    DEVICE_CONTACT(9),
    UNRECOGNIZED(-1);

    private final int s;

    private gsuc(int v1) {
        this.s = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gsuc.q) {
            return this.s;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.s);
    }
}

