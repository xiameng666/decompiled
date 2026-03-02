public enum gygu implements hfub {
    BLE_BACKGROUND_SCAN_STRATEGY_UNKNOWN(0),
    BLE_BACKGROUND_SCAN_STRATEGY_SCREEN_ON_EVENTS(1),
    BLE_BACKGROUND_SCAN_STRATEGY_ALWAYS_ON(2);

    public final int d;

    private gygu(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static gygu b(int v) {
        switch(v) {
            case 0: {
                return gygu.a;
            }
            case 1: {
                return gygu.b;
            }
            case 2: {
                return gygu.c;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}

