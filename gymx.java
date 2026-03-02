public enum gymx implements hfub {
    STOP_DISCOVERING_FAILED(0x1F),
    STOP_LEGACY_DISCOVERING_FAILED(0x20),
    STOP_EXTENDED_DISCOVERING_FAILED(33),
    UNKNOWN_STOP_DISCOVERING_ERROR(34);

    public final int e;

    private gymx(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static gymx b(int v) {
        switch(v) {
            case 0x1F: {
                return gymx.a;
            }
            case 0x20: {
                return gymx.b;
            }
            case 33: {
                return gymx.c;
            }
            case 34: {
                return gymx.d;
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

