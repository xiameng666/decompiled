public enum hcoi implements hfub {
    VALIDITY_UNKNOWN(0),
    VALIDITY_VALID(1),
    VALIDITY_INVALID(2),
    VALIDITY_PENDING(3),
    VALIDITY_NO_VALUE(4);

    public final int f;

    private hcoi(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static hcoi b(int v) {
        switch(v) {
            case 0: {
                return hcoi.a;
            }
            case 1: {
                return hcoi.b;
            }
            case 2: {
                return hcoi.c;
            }
            case 3: {
                return hcoi.d;
            }
            case 4: {
                return hcoi.e;
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

