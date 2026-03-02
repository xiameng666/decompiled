public enum eyed {
    UNSUPPORTED(false, false, false),
    DISABLED_BY_DEVICE_POLICY(true, false, false),
    TRUST_AGENT_OFF(true, false, false),
    NO_BLUETOOTH_PERMISSION(true, false, false),
    BLUETOOTH_OFF(true, false, false),
    LOCKSCREEN_DISABLED(true, true, true),
    AVAILABLE(true, true, true);

    public final boolean h;
    public final boolean i;
    public final boolean j;

    static {
        eyed.k = arr_eyed;
        ibsn.a(arr_eyed);
    }

    private eyed(boolean z, boolean z1, boolean z2) {
        this.h = z;
        this.i = z1;
        this.j = z2;
    }
}

