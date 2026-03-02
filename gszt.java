public enum gszt implements hfub {
    DEVICE_COMPONENT_UNSPECIFIED(0),
    DEVICE_COMPONENT_RIGHT(1),
    DEVICE_COMPONENT_LEFT(2),
    DEVICE_COMPONENT_CASE(3),
    UNRECOGNIZED(-1);

    private final int g;

    private gszt(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gszt.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static gszt b(int v) {
        switch(v) {
            case 0: {
                return gszt.a;
            }
            case 1: {
                return gszt.b;
            }
            case 2: {
                return gszt.c;
            }
            case 3: {
                return gszt.d;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

