public enum gymf implements hfub {
    DISCONNECT_NETWORK_FAILED(0x1F),
    UNKNOWN_DISCONNECT_ERROR(0x20);

    public final int c;

    private gymf(int v1) {
        this.c = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.c;
    }

    public static gymf b(int v) {
        switch(v) {
            case 0x1F: {
                return gymf.a;
            }
            case 0x20: {
                return gymf.b;
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

