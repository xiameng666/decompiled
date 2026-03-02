public enum dcju implements hfub {
    UNKNOWN(0),
    TEXT(1),
    URL(2),
    ADDRESS(3),
    PHONE_NUMBER(4);

    public final int f;

    private dcju(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static dcju b(int v) {
        switch(v) {
            case 0: {
                return dcju.a;
            }
            case 1: {
                return dcju.b;
            }
            case 2: {
                return dcju.c;
            }
            case 3: {
                return dcju.d;
            }
            case 4: {
                return dcju.e;
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

