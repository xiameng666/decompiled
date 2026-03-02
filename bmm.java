import android.util.Size;

public enum bmm {
    VGA(0, new Size(640, 480)),
    X_VGA(1, new Size(0x400, 0x300)),
    S720P_16_9(2, new Size(0x500, 720)),
    PREVIEW(3),
    S1080P_4_3(4, new Size(0x5A0, 1080)),
    S1080P_16_9(5, new Size(0x780, 1080)),
    S1440P_4_3(6, new Size(0x780, 0x5A0)),
    S1440P_16_9(7, new Size(0xA00, 0x5A0)),
    UHD(8, new Size(0xF00, 0x870)),
    RECORD(9),
    MAXIMUM(10),
    MAXIMUM_4_3(11),
    MAXIMUM_16_9(12),
    ULTRA_MAXIMUM(13),
    NOT_SUPPORT(14);

    public final int p;
    public final Size q;

    static {
        bmm.r = arr_bmm;
        ibsn.a(arr_bmm);
    }

    private bmm(int v1, Size size0) {
        this.p = v1;
        this.q = size0;
    }
}

