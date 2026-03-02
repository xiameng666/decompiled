public enum gqus implements hfub {
    UNKNOWN_FEATURE(0),
    BETTER_TOGETHER_HOST(1),
    BETTER_TOGETHER_CLIENT(2),
    EASY_UNLOCK_HOST(3),
    EASY_UNLOCK_CLIENT(4),
    MAGIC_TETHER_HOST(5),
    MAGIC_TETHER_CLIENT(6),
    SMS_CONNECT_HOST(7),
    SMS_CONNECT_CLIENT(8),
    PHONE_HUB_HOST(9),
    PHONE_HUB_CLIENT(10),
    WIFI_SYNC_HOST(11),
    WIFI_SYNC_CLIENT(12),
    EXO_HOST(13),
    EXO_CLIENT(14),
    PHONE_HUB_CAMERA_ROLL_HOST(15),
    PHONE_HUB_CAMERA_ROLL_CLIENT(16),
    UNRECOGNIZED(-1);

    private final int t;

    private gqus(int v1) {
        this.t = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gqus.r) {
            return this.t;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static gqus b(String s) {
        return (gqus)Enum.valueOf(gqus.class, s);
    }

    @Override
    public final String toString() {
        return Integer.toString(this.t);
    }
}

