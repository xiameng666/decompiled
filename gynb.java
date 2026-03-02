public enum gynb implements hfub {
    UNKNOWN_UPGRADE_ERROR(0x1F),
    CREATE_P2P_GROUP_FAILED(0x20);

    public final int c;

    private gynb(int v1) {
        this.c = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.c;
    }

    public static gynb b(int v) {
        switch(v) {
            case 0x1F: {
                return gynb.a;
            }
            case 0x20: {
                return gynb.b;
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

