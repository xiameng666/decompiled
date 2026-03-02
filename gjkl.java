public enum gjkl implements hfub {
    UNKNOWN_OEM_TYPE(0),
    SAMSUNG(1),
    GOOGLE(2);

    public final int d;

    private gjkl(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static gjkl b(int v) {
        switch(v) {
            case 0: {
                return gjkl.a;
            }
            case 1: {
                return gjkl.b;
            }
            case 2: {
                return gjkl.c;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}

