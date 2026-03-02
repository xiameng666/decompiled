public enum hckd implements hfub {
    SETUP_WIZARD_UNKNOWN(0),
    SETUP_WIZARD_GLIF_V1(1),
    SETUP_WIZARD_GLIF_V2(2),
    SETUP_WIZARD_GLIF_V3(3),
    SETUP_WIZARD_GLIF_V4(4),
    SETUP_WIZARD_GLIF_EXPRESSIVE(5);

    public final int g;

    private hckd(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static hckd b(int v) {
        switch(v) {
            case 0: {
                return hckd.a;
            }
            case 1: {
                return hckd.b;
            }
            case 2: {
                return hckd.c;
            }
            case 3: {
                return hckd.d;
            }
            case 4: {
                return hckd.e;
            }
            case 5: {
                return hckd.f;
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

