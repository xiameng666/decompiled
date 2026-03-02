public enum gymj implements hfub {
    UNKNOWN_RECEIVE_PAYLOAD_ERROR(0x1F),
    RECEIVE_PAYLOAD_FAILED(0x20);

    public final int c;

    private gymj(int v1) {
        this.c = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.c;
    }

    public static gymj b(int v) {
        switch(v) {
            case 0x1F: {
                return gymj.a;
            }
            case 0x20: {
                return gymj.b;
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

