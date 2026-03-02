public enum gymz implements hfub {
    STOP_ACCEPTING_CONNECTION_FAILED(0x1F),
    UNKNOWN_STOP_LISTENING_INCOMING_CONNECTION_ERROR(0x20);

    public final int c;

    private gymz(int v1) {
        this.c = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.c;
    }

    public static gymz b(int v) {
        switch(v) {
            case 0x1F: {
                return gymz.a;
            }
            case 0x20: {
                return gymz.b;
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

