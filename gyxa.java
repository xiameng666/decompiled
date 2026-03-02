public enum gyxa implements hfub {
    LEGACY(0),
    INSTANT(1);

    public final int c;

    private gyxa(int v1) {
        this.c = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.c;
    }

    public static gyxa b(int v) {
        switch(v) {
            case 0: {
                return gyxa.a;
            }
            case 1: {
                return gyxa.b;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.c);
    }
}

