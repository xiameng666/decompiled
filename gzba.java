public enum gzba implements hfub {
    UNSPECIFIED_FLOW(0),
    FAST_PAIR_PAIRING(1),
    RETROACTIVE_PAIRING(2),
    RETROACTIVE_PROVISIONING(3),
    UPGRADE_NOTIFICATION(4),
    ACCESSORY_TRACKED_BY_OWNER_NOTIFICATION(5);

    public final int g;

    private gzba(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static gzba b(int v) {
        switch(v) {
            case 0: {
                return gzba.a;
            }
            case 1: {
                return gzba.b;
            }
            case 2: {
                return gzba.c;
            }
            case 3: {
                return gzba.d;
            }
            case 4: {
                return gzba.e;
            }
            case 5: {
                return gzba.f;
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

