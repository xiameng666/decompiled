public enum gylx implements hfub {
    UNKNOWN_ACCEPT_CONNECTION_ERROR(0x1F),
    RESPOND_ACCEPT_CONNECTION_FAILED(0x20);

    public final int c;

    private gylx(int v1) {
        this.c = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.c;
    }

    public static gylx b(int v) {
        switch(v) {
            case 0x1F: {
                return gylx.a;
            }
            case 0x20: {
                return gylx.b;
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

