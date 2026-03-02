public enum hclr implements hfub {
    BOTTOM_SHEET_POSITION_STATE_UNKNOWN(0),
    BOTTOM_SHEET_POSITION_STATE_COLLAPSED(1),
    BOTTOM_SHEET_POSITION_STATE_PARTIALLY_EXPANDED(2),
    BOTTOM_SHEET_POSITION_STATE_EXPANDED(3),
    @Deprecated
    BOTTOM_SHEET_POSITION_STATE_HIDDEN(4);

    public final int f;

    private hclr(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static hclr b(int v) {
        switch(v) {
            case 0: {
                return hclr.a;
            }
            case 1: {
                return hclr.b;
            }
            case 2: {
                return hclr.c;
            }
            case 3: {
                return hclr.d;
            }
            case 4: {
                return hclr.e;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

