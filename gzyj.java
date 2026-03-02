public enum gzyj implements hfub {
    UNKNOWN_RANGING_METHOD(0),
    RANGING_METHOD_BLE_RSSI(1),
    RANGING_METHOD_UWB(2),
    RANGING_METHOD_BLE_RSSI_WITH_UUID_FILTER(3),
    RANGING_METHOD_CS(4),
    UNRECOGNIZED(-1);

    private final int h;

    private gzyj(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gzyj.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}

