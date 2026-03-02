public enum hdsm implements hfub {
    UNIT_UNKNOWN(0),
    UNIT_DP(1),
    UNIT_SP(2),
    UNIT_PX(3),
    UNIT_EM(4),
    UNIT_PERCENT(5);

    public final int g;

    private hdsm(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static hdsm b(int v) {
        switch(v) {
            case 0: {
                return hdsm.a;
            }
            case 1: {
                return hdsm.b;
            }
            case 2: {
                return hdsm.c;
            }
            case 3: {
                return hdsm.d;
            }
            case 4: {
                return hdsm.e;
            }
            case 5: {
                return hdsm.f;
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

