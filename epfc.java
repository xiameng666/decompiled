public enum epfc {
    DEFAULT(0, 2),
    KIDS(1, 3),
    SIDEWINDER(0, 4),
    AUTOMOTIVE(2, 2),
    DOGFOOD(3, 5),
    DESKTOP(4, 2),
    DESKTOP_KIDS(5, 3);

    public final int h;
    public final int i;

    private epfc(int v1, int v2) {
        this.h = v1;
        this.i = v2;
    }
}

