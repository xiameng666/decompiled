public enum ftze {
    ARROWS(0x7F080C3B, 0x7F153562, 0.0f, 0.0f),  // drawable:quantum_gm_ic_sync_alt_vd_theme_24
    PLANE(0x7F08057D, 0x7F153561, 90.0f, -90.0f);  // drawable:gs_flight_vd_theme_48

    public final int c;
    public final int d;
    public final float e;
    public final float f;

    static {
        ftze.g = arr_ftze;
        ibsn.a(arr_ftze);
    }

    private ftze(int v1, int v2, float f, float f1) {
        this.c = v1;
        this.d = v2;
        this.e = f;
        this.f = f1;
    }
}

