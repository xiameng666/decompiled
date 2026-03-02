public enum hdzf implements hfub {
    SETUP_WIZARD_TEXT_PROPERTY_STYLE_UNKNOWN(0),
    SETUP_WIZARD_TEXT_PROPERTY_STYLE_TITLE(1),
    SETUP_WIZARD_TEXT_PROPERTY_STYLE_SUBTITLE(2);

    public final int d;

    private hdzf(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static hdzf b(int v) {
        switch(v) {
            case 0: {
                return hdzf.a;
            }
            case 1: {
                return hdzf.b;
            }
            case 2: {
                return hdzf.c;
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

