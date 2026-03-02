public enum gpts_PositionProvider {
    UNKNOWN(0),
    ECHO_GPS(1),
    ECHO_WIFI(2),
    ECHO_CELL(3),
    GPS_WIFI(4),
    GPS_WIFI_GPS(5),
    PARTICLE_FILTER(6),
    INJECTION_FUSION(7);

    public final int value;

    private gpts_PositionProvider(int v1) {
        this.value = v1;
    }
}

