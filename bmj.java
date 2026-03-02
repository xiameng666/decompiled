public enum bmj {
    DEFAULT(0),
    PREVIEW(1),
    VIDEO_RECORD(3),
    STILL_CAPTURE(2),
    VIDEO_CALL(5),
    PREVIEW_VIDEO_STILL(4),
    CROPPED_RAW(6);

    public final long h;

    static {
        bmj.i = arr_bmj;
        ibsn.a(arr_bmj);
    }

    private bmj(int v1) {
        this.h = (long)v1;
    }
}

