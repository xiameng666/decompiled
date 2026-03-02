public enum iayf {
    NO_ERROR(0, iapk.q),
    PROTOCOL_ERROR(1, iapk.p),
    INTERNAL_ERROR(2, iapk.p),
    FLOW_CONTROL_ERROR(3, iapk.p),
    SETTINGS_TIMEOUT(4, iapk.p),
    STREAM_CLOSED(5, iapk.p),
    FRAME_SIZE_ERROR(6, iapk.p),
    REFUSED_STREAM(7, iapk.q),
    CANCEL(8, iapk.c),
    COMPRESSION_ERROR(9, iapk.p),
    CONNECT_ERROR(10, iapk.p),
    ENHANCE_YOUR_CALM(11, iapk.k.f("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, iapk.i.f("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, iapk.d);

    public static final iayf[] o;
    public final iapk p;
    private final int r;

    static {
        iayf[] arr_iayf = iayf.values();
        iayf[] arr_iayf1 = new iayf[((int)arr_iayf[arr_iayf.length - 1].a()) + 1];
        for(int v = 0; v < arr_iayf.length; ++v) {
            iayf iayf0 = arr_iayf[v];
            arr_iayf1[((int)iayf0.a())] = iayf0;
        }
        iayf.o = arr_iayf1;
    }

    private iayf(int v1, iapk iapk0) {
        this.r = v1;
        this.p = iapk0.f((iapk0.u == null ? "HTTP/2 error code: " + this.name() : a.V(iapk0.u, "HTTP/2 error code: " + this.name(), " (", ")")));
    }

    public final long a() {
        return (long)this.r;
    }
}

