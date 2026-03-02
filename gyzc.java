public enum gyzc implements hfub {
    UNKNOWN_ADVERTISING_MODE(0),
    SCREEN_OFF_ADVERTISING_MODE(1),
    BACKGROUND_ADVERTISING_MODE(2),
    MIDGROUND_ADVERTISING_MODE(3),
    FOREGROUND_ADVERTISING_MODE(4),
    SUSPENDED_ADVERTISING_MODE(5);

    public final int g;

    private gyzc(int v1) {
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

