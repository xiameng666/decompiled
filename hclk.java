public enum hclk implements hfub {
    BOTTOM_SHEET_RENDERING_MODE_UNKNOWN(0),
    BOTTOM_SHEET_RENDERING_MODE_HEIGHT(1),
    BOTTOM_SHEET_RENDERING_MODE_STATE(2);

    public final int d;

    private hclk(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static hclk b(int v) {
        switch(v) {
            case 0: {
                return hclk.a;
            }
            case 1: {
                return hclk.b;
            }
            case 2: {
                return hclk.c;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}

