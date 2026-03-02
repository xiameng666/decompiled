public enum gymn implements hfub {
    UNKNOWN_SEND_PAYLOAD_ERROR(0x1F),
    SEND_PAYLOAD_FAILED(0x20);

    public final int c;

    private gymn(int v1) {
        this.c = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.c;
    }

    public static gymn b(int v) {
        switch(v) {
            case 0x1F: {
                return gymn.a;
            }
            case 0x20: {
                return gymn.b;
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

