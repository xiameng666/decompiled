public enum aktu implements hfub {
    LSKF_TYPE_UNSPECIFIED(0),
    PIN(1),
    PASSWORD(2),
    PATTERN(3);

    public final int e;

    private aktu(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static aktu b(int v) {
        switch(v) {
            case 0: {
                return aktu.a;
            }
            case 1: {
                return aktu.b;
            }
            case 2: {
                return aktu.c;
            }
            case 3: {
                return aktu.d;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}

