public enum gkbm implements hfub {
    UNKNOWN(0),
    THUMBS_UP(1),
    THUMBS_UP_CANCEL(2),
    THUMBS_DOWN(3),
    THUMBS_DOWN_CANCEL(4),
    BOTTOM_SHEET_SUBMIT(5),
    UNRECOGNIZED(-1);

    private final int i;

    private gkbm(int v1) {
        this.i = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gkbm.g) {
            return this.i;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}

