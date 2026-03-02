public enum gymv implements hfub {
    STOP_ADVERTISING_FAILED(0x1F),
    RESTORE_BLUETOOTH_NAME_FAILED(0x20),
    STOP_LEGACY_ADVERTISING_FAILED(33),
    STOP_EXTENDED_ADVERTISING_FAILED(34),
    UNKNOWN_STOP_ADVERTISING_ERROR(35);

    public final int f;

    private gymv(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static gymv b(int v) {
        switch(v) {
            case 0x1F: {
                return gymv.a;
            }
            case 0x20: {
                return gymv.b;
            }
            case 33: {
                return gymv.c;
            }
            case 34: {
                return gymv.d;
            }
            case 35: {
                return gymv.e;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

