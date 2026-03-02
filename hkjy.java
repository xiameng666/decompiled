public enum hkjy implements hfub {
    PARTNER_NAME_UNSPECIFIED(0),
    FELICA_MFI(1),
    DOCOMO(2),
    SUICA(3),
    PASMO(4),
    UNRECOGNIZED(-1);

    private final int h;

    private hkjy(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkjy.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hkjy b(int v) {
        switch(v) {
            case 0: {
                return hkjy.a;
            }
            case 1: {
                return hkjy.b;
            }
            case 2: {
                return hkjy.c;
            }
            case 3: {
                return hkjy.d;
            }
            case 4: {
                return hkjy.e;
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

