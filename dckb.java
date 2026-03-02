public enum dckb implements hfub {
    UNKNOWN_SECURITY_TYPE(0),
    OPEN(1),
    WPA_PSK(2),
    WEP(3),
    SAE(4);

    public final int f;

    private dckb(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static dckb b(int v) {
        switch(v) {
            case 0: {
                return dckb.a;
            }
            case 1: {
                return dckb.b;
            }
            case 2: {
                return dckb.c;
            }
            case 3: {
                return dckb.d;
            }
            case 4: {
                return dckb.e;
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

