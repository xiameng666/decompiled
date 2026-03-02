public enum gzah implements hfub {
    PERMISSION_UNKNOWN_TYPE(0),
    PERMISSION_AIRPLANE_MODE_OFF(1),
    PERMISSION_WIFI(2),
    PERMISSION_BLUETOOTH(3),
    PERMISSION_LOCATION(4),
    PERMISSION_WIFI_HOTSPOT(5);

    public final int g;

    private gzah(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

