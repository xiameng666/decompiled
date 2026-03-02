public enum gyml implements hfub {
    UNKNOWN_REJECT_CONNECTION_ERROR(0x1F),
    RESPOND_REJECT_CONNECTION_FAILED(0x20);

    public final int c;

    private gyml(int v1) {
        this.c = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.c;
    }

    public static gyml b(int v) {
        switch(v) {
            case 0x1F: {
                return gyml.a;
            }
            case 0x20: {
                return gyml.b;
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

