public enum hkpa implements hfub {
    ACTION_UNSPECIFIED(0),
    ALLOW(1),
    DISALLOW(2),
    UNRECOGNIZED(-1);

    private final int f;

    private hkpa(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkpa.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hkpa b(int v) {
        switch(v) {
            case 0: {
                return hkpa.a;
            }
            case 1: {
                return hkpa.b;
            }
            case 2: {
                return hkpa.c;
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

