public enum fttr {
    SYNC(0x7F080C3B, 0.0f, 0.0f),  // drawable:quantum_gm_ic_sync_alt_vd_theme_24
    PLANE(0x7F08057D, 90.0f, -90.0f);  // drawable:gs_flight_vd_theme_48

    public final int c;
    public final float d;
    public final float e;

    static {
        fttr.f = arr_fttr;
        ibsn.a(arr_fttr);
    }

    private fttr(int v1, float f, float f1) {
        this.c = v1;
        this.d = f;
        this.e = f1;
    }
}

