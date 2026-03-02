public enum gyvu implements hfub {
    UNKNOWN_NOTIFICATION_TYPE(0),
    INVITATION(1),
    OPTED_IN(2),
    OPTED_OUT(3),
    ACTIVE_UNLOCK_NOTIFY_WATCH(101),
    UNRECOGNIZED(-1);

    private final int h;

    private gyvu(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gyvu.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static gyvu b(int v) {
        switch(v) {
            case 0: {
                return gyvu.a;
            }
            case 1: {
                return gyvu.b;
            }
            case 2: {
                return gyvu.c;
            }
            case 3: {
                return gyvu.d;
            }
            case 101: {
                return gyvu.e;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}

