public enum hkfo implements hfub {
    PROVISIONING_SOURCE_UNKNOWN(0),
    PROVISIONING_SOURCE_APP(1),
    PROVISIONING_SOURCE_WEB(2),
    UNRECOGNIZED(-1);

    private final int f;

    private hkfo(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkfo.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hkfo b(int v) {
        switch(v) {
            case 0: {
                return hkfo.a;
            }
            case 1: {
                return hkfo.b;
            }
            case 2: {
                return hkfo.c;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

