public enum hewl implements hfub {
    UNKNOWN_ACCESS_TYPE(0),
    READ_ONLY(1),
    WRITE_ONLY(2),
    READ_WRITE(3),
    LISTEN_ONLY(4),
    INJECT_ONLY(5),
    LISTEN_WRITE(6),
    LISTEN_INJECT(7),
    READ_INJECT(8);

    public final int j;

    private hewl(int v1) {
        this.j = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.j;
    }

    public static hewl b(int v) {
        switch(v) {
            case 0: {
                return hewl.a;
            }
            case 1: {
                return hewl.b;
            }
            case 2: {
                return hewl.c;
            }
            case 3: {
                return hewl.d;
            }
            case 4: {
                return hewl.e;
            }
            case 5: {
                return hewl.f;
            }
            case 6: {
                return hewl.g;
            }
            case 7: {
                return hewl.h;
            }
            case 8: {
                return hewl.i;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.j);
    }
}

